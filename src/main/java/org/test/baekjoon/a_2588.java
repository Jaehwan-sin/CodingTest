package org.test.baekjoon;

import java.util.Scanner;

public class a_2588 {

    /** 문제 : (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
        (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
     *  https://www.acmicpc.net/problem/2588
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        String B = sc.next();

        System.out.println(A* (B.charAt(2) - '0'));
        System.out.println(A* (B.charAt(1) - '0'));
        System.out.println(A* (B.charAt(0) - '0'));
        System.out.println(A* Integer.parseInt(B));
    }
}
