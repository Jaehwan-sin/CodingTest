package org.test.programmers;

import java.util.Arrays;

public class JadenCase {

    // 문제 - JadenCase 문자열 만들기

    // JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다.
    // 단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
    // 문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.
    public String solution(String s) {
        String[] words = s.split(" ", -1); // -1을 사용하여 공백도 유지
        StringBuilder jadenCase = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                // 첫 문자가 알파벳인 경우 첫 문자는 대문자, 나머지는 소문자로 변환
                jadenCase.append(Character.toUpperCase(word.charAt(0)));
                jadenCase.append(word.substring(1).toLowerCase());
            }
            // 단어 간 공백 유지
            jadenCase.append(" ");
        }

        // 마지막 공백 제거
        if (jadenCase.length() > 0) {
            jadenCase.setLength(jadenCase.length() - 1);
        }

        System.out.println("jadenCase = " + jadenCase);
        return jadenCase.toString();
    }

    public String solution2 (String s) {
        // 최종 결과를 저장할 변수 초기화
        String answer = "";
        // 입력 문자열을 모두 소문자로 변환한 후, 하나씩 분리하여 배열에 저장
        String[] sp = s.toLowerCase().split("");
        // 다음 문자가 대문자로 변환될지 여부를 판단하는 플래그 변수 초기화
        boolean flag = true;

        // 분리된 문자열 배열을 순회
        for(String ss : sp) {
            // flag가 true이면 대문자로 변환하여 추가, 아니면 소문자 그대로 추가
            answer += flag ? ss.toUpperCase() : ss;
            // 현재 문자가 공백인지 확인, 공백이면 flag를 true로 설정, 아니면 false로 설정
            flag = ss.equals(" ") ? true : false;
        }

        // 최종 변환된 JadenCase 문자열 반환
        return answer;
    }
}
