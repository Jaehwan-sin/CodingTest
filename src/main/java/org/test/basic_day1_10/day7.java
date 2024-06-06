package org.test.basic_day1_10;

import java.util.ArrayList;

public class day7 {

    // 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
    // 각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 i가 k의 배수이면 arr[i]에 1을 더합니다.
    // 위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
    public int[] solution(int[] arr, int[][] queries) {

        for (int i=0; i<queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            for(int j=s; j<=e; j++) {
                if(j%k==0){
                    arr[j] += 1;
                }
            }
        }
        return arr;
    }

    // 정수 l과 r이 주어졌을 때,
    // l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진
    // 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
    // 만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
    public int[] solution(int l, int r) {
        ArrayList<Integer> arraylist = new ArrayList<>();


        for (int i = l; i <= r; i++) {
            if (String.valueOf(i).matches("[05]+")) {
                arraylist.add(i);
            }
        }
        System.out.println("arraylist = " + arraylist);

        if (arraylist.isEmpty()) {
            return new int[]{-1};
        }

        int[] arr = new int[arraylist.size()];
        for (int j = 0; j < arraylist.size(); j++) {
            arr[j] = arraylist.get(j);
        }

        return arr;
    }

    // 정수 start_num와 end_num가 주어질 때,
    // start_num부터 end_num까지의 숫자를 차례로 담은 리스트를
    // return하도록 solution 함수를 완성해주세요.
    public int[] solution3 (int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];

        for (int i = 0; i <= end_num - start_num; i++) {
            answer[i] = start_num + i;
        }

        return answer;
    }

}
