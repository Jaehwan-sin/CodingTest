package org.test.day0_10;

import java.util.Arrays;

public class day8 {

    // 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
    // numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
    public int[] solution (int[] numbers, int num1, int num2) {
        int[] answer = new int[numbers.length];
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }

    // 우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다.
    // 입국심사에서 나이를 말해야 하는데, PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다.
    // a는 0, b는 1, c는 2, ..., j는 9입니다. 예를 들어 23살은 cd, 51살은 fb로 표현합니다.
    // 나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.
    public String solution2 (int age) {
        String answer = "";
        String[] Alpha = new String[]{"a","b","c","d","e","f","g","h","i","j"};

        while(age>0) {
            answer = Alpha[age % 10] + answer;
            age /= 10;
        }

        return answer;
    }

    // 외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
    // 정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.
    public int[] solution3 (int[] emergency) {
        int[] answer = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] <= emergency[j]) {
                    answer[i] += 1;
                }
            }
        }
        return answer;
    }
}
