package org.test.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 문자열내림차순 {

    // 문제 - 문자열 내림차순으로 배치하기

    // 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
    // s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
    public String solution(String s) {
        // 매개변수 s를 char 타입으로 변경
        Character[] charArray = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            charArray[i] = s.charAt(i);
        }

        // 문자 배열을 내림차순으로 정렬
        Arrays.sort(charArray, Collections.reverseOrder());

        // 정렬된 문자 배열을 다시 문자열로 결합
        StringBuilder sortedString = new StringBuilder(charArray.length);
        for (char c : charArray) {
            sortedString.append(c);
        }

        // 결과 출력
        return sortedString.toString();
    }
}
