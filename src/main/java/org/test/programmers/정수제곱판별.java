package org.test.programmers;

public class 정수제곱판별 {

    // 문제 - 정수 제곱근 판별

    // 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
    // n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
    public long solution(long n) {
        // n의 제곱근을 계산
        long sqrt = (long) Math.sqrt(n);

        // 제곱근의 제곱이 n과 같은지 확인
        if (sqrt * sqrt == n) {
            // 제곱근이 정수인 경우, (제곱근 + 1)의 제곱 반환
            return (sqrt + 1) * (sqrt + 1);
        } else {
            // 제곱근이 정수가 아닌 경우, -1 반환
            return -1;
        }
    }
}
