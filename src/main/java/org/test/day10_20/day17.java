package org.test.day10_20;

import java.util.ArrayList;

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

    // 정수 n과 정수 배열 numlist가 매개변수로 주어질 때,
    // numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.
    public int[] solution(int n, int[] numlist) {
        // n의 배수가 아닌 수들은 가변적이기 때문에 ArrayList 생성
        ArrayList<Integer> answerList = new ArrayList<>();

        // numlist[i]를 n 으로 나누어 0이라면 배수이기 때문에 answerList에 추가
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answerList.add(numlist[i]);
            }
        }

        // ArrayList를 int 배열로 변환
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}