package org.test.programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class 약수의합 {

    // 문제 - 약수의 합

    // 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
    public static void main(String[] args) {
        int n = 12;
        int sum = 0;

        // 약수를 찾기 위한 반복문
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i; // 약수를 더하기
            }
        }

        System.out.println("sum = " + sum); // 약수의 합 출력
    }
}
