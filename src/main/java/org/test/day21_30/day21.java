package org.test.day21_30;

public class day21 {

    // 문자열 my_string이 매개변수로 주어집니다.
    // my_string은 소문자, 대문자, 자연수로만 구성되어있습니다.
    // my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
    public int solution(String my_string) {
        int answer = 0;

        // 소문자,대문자 영어 a-z 를 다 " " 으로 대체한다.
        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

        // ""을 제외한 다른 글자를 int형변환 후 더한다.
        for (String s : str) {
            if (!s.equals("")) {
                answer += Integer.parseInt(s);
            }
        }
        return answer;
    }
}
