package org.test.basic_day1_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class day6 {

    // 정수 리스트 num_list가 주어질 때,
    // 마지막 원소가 그전 원소보다 크면 마지막 원소에서
    // 그전 원소를 뺀 값을 마지막 원소가 그전 원소보다 크지 않다면
    // 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.
    public List solution(int[] num_list) {
        List<Integer> answer = new ArrayList<>();

        int last = num_list[num_list.length - 1];  // 마지막 원소
        int lastb = num_list[num_list.length - 2];  // 마지막 원소에서 그 전 원소

        for(int i = 0; i < num_list.length; i++){
            answer.add(num_list[i]);
        }

        if (last > lastb) {
            answer.add(last - lastb);
        } else {
            answer.add(last * 2);
        }

        return answer;
    }

    // 정수 n과 문자열 control이 주어집니다.
    // control은 "w", "a", "s", "d"의 4개의 문자로 이루어져 있으며,
    // control의 앞에서부터 순서대로 문자에 따라 n의 값을 바꿉니다.
    // "w" : n이 1 커집니다.
    // "s" : n이 1 작아집니다.
    // "d" : n이 10 커집니다.
    // "a" : n이 10 작아집니다.
    // 위 규칙에 따라 n을 바꿨을 때 가장 마지막에 나오는 n의 값을 return 하는 solution 함수를 완성해 주세요.
    public int solution2 (int n, String control) {
        String[] split = control.split("");

        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("w")) {
                n += 1;
            } else if (split[i].equals("s")) {
                n -= 1;
            } else if (split[i].equals("d")) {
                n += 10;
            } else if (split[i].equals("a")) {
                n -= 10;
            }
        }

        return n;
    }

    // 정수 배열 numLog가 주어집니다.
    // 처음에 numLog[0]에서 부터 시작해 "w", "a", "s", "d"로 이루어진 문자열을 입력으로 받아 순서대로 다음과 같은 조작을 했다고 합시다.
    // "w" : 수에 1을 더한다.
    // "s" : 수에 1을 뺀다.
    // "d" : 수에 10을 더한다.
    // "a" : 수에 10을 뺀다.
    // 그리고 매번 조작을 할 때마다 결괏값을 기록한 정수 배열이 numLog입니다.
    // 즉, numLog[i]는 numLog[0]로부터 총 i번의 조작을 가한 결과가 저장되어 있습니다.
    // 주어진 정수 배열 numLog에 대해 조작을 위해 입력받은 문자열을 return 하는 solution 함수를 완성해 주세요.
    public String solution3 (int[] numLog) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < numLog.length; i++) {
            switch (numLog[i] - numLog[i - 1]) {
                case 1 -> sb.append("w");
                case 10 -> sb.append("d");
                case -1 -> sb.append("s");
                case -10 -> sb.append("a");
            }
        }

        return sb.toString();
    }

    // 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다.
    // queries의 원소는 각각 하나의 query를 나타내며, [i, j] 꼴입니다.
    // 각 query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꿉니다.
    // 위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
    public int[] solution4 (int[] arr, int[][] queries) {
        int n = 0;

        for (int i = 0; i < queries.length; i++) {
            n = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = n;
        }

        return arr;
    }

    // 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다.
    // queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
    // 각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 찾습니다.
    // 각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요.
    // 단, 특정 쿼리의 답이 존재하지 않으면 -1을 저장합니다.
    public int[] solution5 (int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, Integer.MAX_VALUE);

        for (int j = 0; j < queries.length; j++) {
            for (int i = queries[j][0]; i <= queries[j][1]; i++) {
                if (arr[i] > queries[j][2]) {
                    answer[j] = Math.min(answer[j], arr[i]);
                }
            }
            if (answer[j] == Integer.MAX_VALUE) answer[j] = -1;
        }
        return answer;
    }
}
