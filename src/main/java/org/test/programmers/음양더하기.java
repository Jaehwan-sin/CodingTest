package org.test.programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class 음양더하기 {

    // 문제 - 음양 더하기

    // 어떤 정수들이 있습니다.
    // 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와
    // 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다.
    // 실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        // absolutes[i] == signs[i] 를 비교하여 false 인 숫자를 -로 변환
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == false) {
                absolutes[i] = -absolutes[i];
            }
            answer += absolutes[i];
        }

        return answer;
    }
}
