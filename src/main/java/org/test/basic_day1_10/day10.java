package org.test.basic_day1_10;

public class day10 {

    // 문자열 my_string과 정수 n이 매개변수로 주어질 때,
    // my_string의 앞의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
    public String solution(String my_string, int n) {
        return my_string.substring(0, n);
    }

    // 어떤 문자열에 대해서 접두사는 특정 인덱스까지의 문자열을 의미합니다.
    // 예를 들어, "banana"의 모든 접두사는 "b", "ba", "ban", "bana", "banan", "banana"입니다.
    // 문자열 my_string과 is_prefix가 주어질 때,
    // is_prefix가 my_string의 접두사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.
    public int solution(String my_string, String is_prefix) {
        return my_string.startsWith(is_prefix) ? 1 : 0;
    }

    // 문자열 my_string과 정수 s, e가 매개변수로 주어질 때,
    // my_string에서 인덱스 s부터 인덱스 e까지를 뒤집은 문자열을 return 하는 solution 함수를 작성해 주세요.
    public String solution(String my_string, int s, int e) {
        String substring = my_string.substring(s, e + 1);

        StringBuilder sb = new StringBuilder(substring);
        String reversedSubstring = sb.reverse().toString();

        String result = my_string.substring(0, s) + reversedSubstring + my_string.substring(e + 1);

        return result;
    }

    // 문자열 my_string과 두 정수 m, c가 주어집니다.
    // my_string을 한 줄에 m 글자씩 가로로 적었을 때 왼쪽부터 세로로 c번째 열에 적힌 글자들을 문자열로 return 하는 solution 함수를 작성해 주세요.
    public String solution4 (String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();

        // 인덱스를 이용해 특정 열의 글자를 세로로 읽음
        for (int i = 0; i < my_string.length(); i += m) {
            if (i + c - 1 < my_string.length()) {
                answer.append(my_string.charAt(i + c - 1));
            }
        }

        return answer.toString();
    }

    // 두 정수 q, r과 문자열 code가 주어질 때,
    // code의 각 인덱스를 q로 나누었을 때 나머지가 r인 위치의 문자를 앞에서부터 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
    public String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) {
                sb.append(code.charAt(i));
            }
        }

        return sb.toString();
    }
}
