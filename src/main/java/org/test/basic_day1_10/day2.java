package org.test.basic_day1_10;

import java.util.Scanner;

public class day2 {

    // 두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.
    // a + b = c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));
    }

    // 두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다.
    // 입출력 예와 같이 str1과 str2을 이어서 출력하는 코드를 작성해 보세요.
    // 입력 : apple pen
    // 출력 : applepen
    public static void main2 (String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(a+b);
    }

    // 문자열 str이 주어집니다.
    // 문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
    // 입력 abcde
    // 출력 a
    // b
    // c
    // d
    // e
    public static void main3 (String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.substring(i, i + 1));
        }
    }
    
}
