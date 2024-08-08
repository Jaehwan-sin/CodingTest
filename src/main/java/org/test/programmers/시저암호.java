package org.test.programmers;

public class 시저암호 {

    // 문제 - 시저 암호

    // 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
    // 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다.
    // 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
    // 제한 조건
    // 공백은 아무리 밀어도 공백입니다.
    // s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
    // s의 길이는 8000이하입니다.
    // n은 1 이상, 25이하인 자연수입니다.
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // 문자가 알파벳인지 확인
            if (Character.isLetter(ch)) {
                // 대문자인 경우 'A', 소문자인 경우 'a'를 기준(base)으로 설정
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                // 문자를 n만큼 이동시키고 알파벳 순환을 처리하기 위해 26으로 나눈 나머지를 사용
                char shiftedChar = (char) ((ch - base + n) % 26 + base);
                // 결과 문자열에 이동된 문자 추가
                sb.append(shiftedChar);
            } else {
                // 알파벳이 아닌 문자는 그대로 추가 (공백 처리)
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
