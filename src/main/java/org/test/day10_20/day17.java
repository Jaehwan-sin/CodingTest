package org.test.day10_20;

public class day17 {

    // 정수 num과 k가 매개변수로 주어질 때,
    // num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
    public int solution(int num, int k) {
        int answer = 1;

        // int num을 String으로 변환
        String numStr = String.valueOf(num);

        for (int i = 0; i < numStr.length(); i++) {
            // 각 자릿수를 문자로 변환하여 확인
            int digit = Character.getNumericValue(numStr.charAt(i));
            if (digit == k) {
                answer = i + 1;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }

    //
}