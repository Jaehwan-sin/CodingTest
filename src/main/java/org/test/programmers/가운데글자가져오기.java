package org.test.programmers;

public class 가운데글자가져오기 {

    // 문제 - 가운데 글자 가져오기

    // 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어보세요.
    // 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
    public String solution(String s) {
        int length = s.length();
        int middle = length / 2;

        if (length % 2 == 0) {
            // 문자열의 길이가 짝수인 경우, 가운데 두 글자를 반환
            return s.substring(middle - 1, middle + 1);
        } else {
            // 문자열의 길이가 홀수인 경우, 가운데 한 글자를 반환
            return s.substring(middle, middle + 1);
        }
    }
}
