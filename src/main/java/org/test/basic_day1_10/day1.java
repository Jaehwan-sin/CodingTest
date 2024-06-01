package org.test.basic_day1_10;

import java.util.Scanner;

public class day1 {

    // 프로그래머스 기초 트레이닝 Day1~25 문제 풀이
    // 문자열 str이 주어질 때, str을 출력하는 코드를 작성해보세요.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        System.out.println(a);
    }

    // 정수 a와 b가 주어집니다. 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.
    public static void main2 (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }

    // 문자열 str과 정수 n이 주어집니다.
    // str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.
    public static void main3 (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(str);
        }
    }

    // 영어 알파벳으로 이루어진 문자열 str이 주어집니다.
    // 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
    public static void main4 (String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String result = "";
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else {
                result += Character.toUpperCase(ch);
            }
        }
        System.out.println(result);
    }

    // 다음과 같이 출력하도록 코드를 작성해 주세요.
    // !@#$%^&*(\'"<>?:;
    public static void main5 (String[] args) {
        System.out.println("!@#$%^&*(\\'\"<>?:;\n");
    }
}
