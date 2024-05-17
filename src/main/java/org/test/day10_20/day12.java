package org.test.day10_20;

import java.util.Arrays;

public class day12 {

    // 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
    // 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();

        for (char ch : my_string.toCharArray()) {
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                sb.append(ch);
            }
        }

        return sb.toString();

        // 다른 풀이
        // return myString.replaceAll("a|e|i|o|u", "");
    }

    // 문자열 my_string이 매개변수로 주어질 때,
    // my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
    public int[] solution2 (String my_string) {
        my_string = my_string.replaceAll("[a-zA-Z]", "");

        String[] arr = my_string.split("");
        int[]answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(answer);

        return answer;
    }
}
