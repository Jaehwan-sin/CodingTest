package org.test.baekjoon;

import java.util.Scanner;

public class a_11382 {

    // 문제 : A + B + C 계산
    // 주의할 점 : 입력 : 첫 번째 줄에 A,B,C(1 ≤ A, B, C ≤ 10¹²) 이 공백을 사이에 두고 주어진다.
    // 풀이 : 받는 숫자가 int형보다 큰 값을 출력하므로 long타입(8byte)를 사용하여 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        System.out.println(a+b+c);
    }
}
