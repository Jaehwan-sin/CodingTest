package org.test.day11_20;

import java.util.Arrays;

public class day18 {

    // 문자열 str1, str2가 매개변수로 주어집니다.
    // str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.
    public int solution (String str1, String str2) {
        int answer = 0;

        // contains는 문자열 안에 해당하는 문자열이 포함되어 있는지 판별해주는 메소드
        if (str1.contains(str2)) {
            answer = 1;
        } else {
            answer = 2;
        }

        return answer;
    }
    // 삼항연산자 풀이
    // return (str1.contains(str2) ? 1 : 2);

    // 어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다.
    // 정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.
    public int solution2 (int n) {
        // Math.sqrt는 제곱근을 반환하는 메서드
        // % 1 해서 나머지가 0이라면 정수이기 때문에 return 1
        if (Math.sqrt(n) % 1 == 0) {
            return 1;
        } else {
            return 2;
        }
    }

    // 어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
    // 처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.
    public int solution3 (int n, int t) {
        int answer = 0;

        for (int i = 1; i <= t ; i++) {
            answer = n *= 2;
        }

        return answer;
    }

    // 영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때,
    // my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();

        char[] chArr = my_string.toCharArray();
        Arrays.sort(chArr);

        String answer = new String(chArr);
        return answer;
    }
    //  my_string을 소문자로 변경한다. ( toLowerCase() )
    //  변경한 문자열을 char 배열에 각각 넣는다. ( toCharArray() )
    //  사전 순으로 정렬한다. ( Arrays.sort() )
    //  정렬한 char 배열을 String 생성자의 인자로 넣어서 문자열로 변환시켜 answer에 저장한다.

}
