package org.test.programmers.Arrays;

import java.util.Arrays;

public class LargestNumber {

    // 문제 - 가장 큰 수

    // 0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
    // 예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
    // 0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때,
    // 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.

    public String solution(int[] numbers) {
        // 숫자를 문자열로 변환하여 저장할 배열 생성
        String[] arr = new String[numbers.length];

        // 배열의 각 정수를 문자열로 변환
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        // 두 문자열을 연결했을 때 더 큰 숫자를 만든다.
        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        // 만약 가장 큰 숫자가 0 이라면 0을 리턴
        if (arr[0].equals("0")) {
            return "0";
        }

        // StringBuilder 생성
        StringBuilder answer = new StringBuilder();

        // 정렬된 문자열 배열을 순회하며 StringBuilder에 추가
        for (int i = 0; i < arr.length; i++) {
            answer.append(arr[i]);
        }

        // StringBuilder에 저장된 문자열 변환
        return answer.toString();
    }
}
