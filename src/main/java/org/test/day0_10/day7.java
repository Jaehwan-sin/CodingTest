package org.test.day0_10;

import java.util.Scanner;

public class day7 {

    // 문자열 my_string과 문자 letter이 매개변수로 주어집니다.
    // my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
    public String solution(String my_string, String letter) {
        return my_string.replace(letter, "");
    }

    // 각에서 0도 초과 90도 미만은 예각, 90도는 직각, 90도 초과 180도 미만은 둔각 180도는 평각으로 분류합니다.
    // 각 angle이 매개변수로 주어질 때 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 return하도록 solution 함수를 완성해주세요.
    // 예각 : 0 < angle < 90 직각 : angle = 90 둔각 : 90 < angle < 180 평각 : angle = 180
    public int solution(int angle) {
        int answer = 0;

        if (0 < angle && angle < 90) {
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        } else if (90 < angle && angle < 180) {
            answer = 3;
        } else if (angle == 180) {
            answer = 4;
        }

        return answer;
    }

    // 머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다.
    // 양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다. 정수 n과 k가 매개변수로 주어졌을 때,
    // 양꼬치 n인분과 음료수 k개를 먹었다면 총얼마를 지불해야 하는지 return 하도록 solution 함수를 완성해보세요.
    public int solution3 (int n, int k) {
        int answer = 0;
        answer = (12000 * n) + ((k-(n/10)) * 2000);
        return answer;
    }

    // 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
    public int solution4 (int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        return sum;
    }
}
