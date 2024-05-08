package org.test.day0_10;

import java.util.Arrays;

public class day2 {
    // 정수 num1과 num2가 매개변수로 주어질 때,
    // num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
    public int solution (int num1, int num2) {
        double result = (double) num1 / num2 * 1000;
        return (int) result;
    }

    // 정수 num1과 num2가 매개변수로 주어집니다.
    // 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
    public int solution2 (int num1, int num2) {
        if (num1==num2) {
            return 1;
        } else {
            return -1;
        }
    }

    // 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1,
    // 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
    // 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
    public int[] solution3 (int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;

        int max = 1;

        for (int i = 1; i <= numer && i <= denom; i++) {
            if (denom % i == 0 && numer % i == 0) {
                max = i;
            }
        }

        numer = numer/max;
        denom = denom/max;

        int[] answer = {numer, denom};

        return answer;
    }

    // 정수 배열 numbers가 매개변수로 주어집니다.
    // numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
    public int[] solution4 (int[] numbers) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }

        return answer;
    }

    // 4번 다른 문제 풀이
    public int[] solution(int[] numbers) {
        return Arrays.stream(numbers).map(i -> i * 2).toArray();
    }
}
