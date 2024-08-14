package org.test.programmers;

import java.util.Arrays;

public class 하샤드수 {

    // 문제 - 하샤드 수

    // 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
    // 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
    // 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
    public boolean solution(int x) {
        int num = 0;
        boolean answer = true;
        String s = String.valueOf(x); 

        String[] split = s.split("");

        for (int i = 0; i < split.length; i++) {
            num += Integer.parseInt(split[i]);
        }

        if (x % num == 0) {
            return answer;
        } else {
            answer = false;
            return answer;
        }
    }
}
