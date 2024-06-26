package org.test.baekjoon;

import java.util.Scanner;

public class a_2480 {

    /**
     * 문제 : 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
     * 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
     * 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
     * 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
     * 예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다.
     * 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다.
     * 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
     * 3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();    // 첫번째 주사위
        int B = sc.nextInt();    // 두번째 주사위
        int C = sc.nextInt();    // 세번째 주사위

        if(A == B && A == C) { // 3개다 같을 경우 10000 + (같은눈) x 1000
            System.out.println(10000 + A * 1000);
        } else if(A == B && A != C || A == C && A != B) {  // 2개만 같을 경우 1000 + (같은눈) x 100
            System.out.println(1000 + A * 100);
        } else if(B == C && B != A) { // 2개만 같을 경우 1000 + (같은눈) x 100
            System.out.println(1000 + B * 100);
        } else { // 모두 다른 눈이 나오는 경우
            int m = A; // (그중 가장 큰눈) x 100
            if (m < B) m = B;
            if (m < C) m = C;
            System.out.println(m * 100);
        }
    }

    // 다른 풀이 과정
    public static void main2 (String[] args) {
        // 1. 같은 값이 3개면 10000 + a * 1000
        // 2. 같은 값이 2개면 1000 + a * 100
        // 3. 모두 다른 눈이 나오는 경우 ( 가장 큰 수 ) * 100

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = 0;

        if (a == b && b== c && a == c) {
            System.out.println(10000 + (a * 1000));
        } else if (a == b || a == c) {
            System.out.println(1000 + (a * 100));
        } else if (b == c) {
            System.out.println(1000 + (a * 100));
        } else {
            int z = Math.max(a,b); // Math 함수 이용 가장 큰 값 비교
            z = Math.max(z, c); // 비교한 값을 c 랑 또 비교한다.
            sum = z * 100;
            System.out.println(sum);
        }
    }
}
