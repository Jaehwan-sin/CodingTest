package org.test.basic_day11_20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class day11 {

    // 알파벳 대소문자로만 이루어진 문자열 my_string이 주어질 때,
    // my_string에서 'A'의 개수, my_string에서 'B'의 개수,...,
    // my_string에서 'Z'의 개수, my_string에서 'a'의 개수,
    // my_string에서 'b'의 개수,..., my_string에서 'z'의 개수를
    // 순서대로 담은 길이 52의 정수 배열을 return 하는 solution 함수를 작성해 주세요.
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        // A~Z는 ASCII 코드 65~90, a~z는 97~122
        for (char ch : my_string.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                answer[ch - 'A']++;
            } else if (ch >= 'a' && ch <= 'z') {
                answer[ch - 'a' + 26]++;
            } 
        }

        return answer;
    }

    // 정수 n과 k가 주어졌을 때,
    // 1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
    public int[] solution(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                list.add(i);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] += list.get(i);
        }

        return answer;
    }

    // 다른 풀이
    public int[] solution2_1 (int n, int k) {
        int count = n / k;
        int[] answer = new int[count];

        for (int i = 1; i <= count; i++) {
            answer[i - 1] = k * i;
        }

        return answer;
    }

    // 문자열 my_string과 정수 배열 indices가 주어질 때,
    // my_string에서 indices의 원소에 해당하는 인덱스의 글자를 지우고 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
    public String solution(String my_string, int[] indices) {
        // Set을 사용하여 indices 배열을 저장
        Set<Integer> indexSet = new HashSet<>();
        for (int index : indices) {
            indexSet.add(index);
        }

        // StringBuilder를 사용하여 결과 문자열을 생성
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (!indexSet.contains(i)) {
                answer.append(my_string.charAt(i));
            }
        }

        return answer.toString();
    }

    // 정수 start_num와 end_num가 주어질 때,
    // start_num에서 end_num까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
    public int[] solution4 (int start, int end) {
        int[] answer = {};
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=start; i>=end; i--){
            arrayList.add(i);
        }

        answer = new int[arrayList.size()];

        for(int i=0; i<arrayList.size(); i++){
            answer[i] = arrayList.get(i);
        }
        return answer;
    }

    // 정수 배열 arr가 주어집니다.
    // 이때 arr의 원소는 1 또는 0입니다.
    // 정수 idx가 주어졌을 때,
    // idx보다 크면서 배열의 값이 1인 가장 작은 인덱스를 찾아서 반환하는 solution 함수를 완성해 주세요.
    // 단, 만약 그러한 인덱스가 없다면 -1을 반환합니다.
    public int solution(int[] arr, int idx) {
        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i >= idx && arr[i] == 1) {
                answer = i;
                break;
            } else {
                answer = -1;
            }
        }

        return answer;
    }
}
