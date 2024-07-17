package org.test.programmers;

public class 자릿수더하기 {

    // 문제 - 자릿수 더하기

    // 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return하는 solution 함수를 만들어 주세요.
    // 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
    // 제한사항
    // N의 범위 : 100,000,000 이하의 자연수
    public int solution(int n) {
        int answer = 0;

        // 정수를 문자열로 변환
        String str = String.valueOf(n);

        // 각 자릿수를 더함
        for (int i = 0; i < str.length(); i++) {
            answer += Character.getNumericValue(str.charAt(i));
        }

        return answer;
    }
}
