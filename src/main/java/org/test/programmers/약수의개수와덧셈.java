package org.test.programmers;

public class 약수의개수와덧셈 {

    // 문제 - 약수의 개수와 덧셈

    // 두 정수 left와 right가 매개변수로 주어집니다.
    // left부터 right까지의 모든 수들 중에서,
    // 약수의 개수가 짝수인 수는 더하고,
    // 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int divisorCount = getDivisorCount(i);
            if (divisorCount % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }

        return answer;
    }

    // 약수 구하는 메서드
    public static int getDivisorCount(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }
}
