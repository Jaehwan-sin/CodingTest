package org.test.programmers.greedy;

public class Biggest_number {

    // 문제 - 큰 수 만들기

    // 어떤 숫자에서 k개의 수를 제거했을 때 얻을 수 있는 가장 큰 숫자를 구하려 합니다.
    // 예를 들어, 숫자 1924에서 수 두 개를 제거하면 [19, 12, 14, 92, 94, 24] 를 만들 수 있습니다. 이 중 가장 큰 숫자는 94 입니다.
    // 문자열 형식으로 숫자 number와 제거할 수의 개수 k가 solution 함수의 매개변수로 주어집니다.
    // number에서 k 개의 수를 제거했을 때 만들 수 있는 수 중 가장 큰 숫자를 문자열 형태로 return 하도록 solution 함수를 완성하세요.
    public String solution(String number, int k) {
        StringBuilder result = new StringBuilder();
        int length = number.length() - k; // 최종 결과 문자열의 길이

        for (char digit : number.toCharArray()) {
            // 스택의 마지막 값이 현재 값보다 작고, 제거할 k가 남아있을 때 제거
            while (k > 0 && result.length() > 0 && result.charAt(result.length() - 1) < digit) {
                result.deleteCharAt(result.length() - 1);
                k--;
            }
            result.append(digit);
        }

        // 최종 길이를 맞추기 위해 앞에서부터 필요한 만큼만 자르기
        return result.substring(0, length).toString();
    }
}
