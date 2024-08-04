package org.test.programmers;

public class 이상한문자만들기 {

    // 문제 - 이상한 문자 만들기

    // 문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
    // 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
    // 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
    // 제한 사항
    // 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
    // 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
    public static String solution(String s) {
        StringBuilder result = new StringBuilder();
        int idx = 0; // 각 단어에서의 위치를 추적할 인덱스 변수

        // 문자열의 각 문자를 확인
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // 공백을 만나면 idx를 초기화
            if (c == ' ') {
                idx = 0;
                result.append(c);
            } else {
                // 짝수 인덱스인 경우 대문자로, 홀수 인덱스인 경우 소문자로 변환
                if (idx % 2 == 0) {
                    result.append(Character.toUpperCase(c));
                } else {
                    result.append(Character.toLowerCase(c));
                }
                idx++; // 단어 내에서의 위치를 증가
            }
        }

        return result.toString();
    }
}
