package org.test.day10_20;

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
}
