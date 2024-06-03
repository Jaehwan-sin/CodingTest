package org.test.basic_day1_10;

import java.util.Scanner;

public class day3 {

    // 길이가 같은 두 문자열 str1과 str2가 주어집니다.
    // 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.
    public String solution(String str1, String str2) {
        String answer = "";

        String[] split1 = str1.split("");
        String[] split2 = str2.split("");

        for (int i = 0; i < split1.length; i++) {
            answer += split1[i];
            answer += split2[i];
        }

        return answer;
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

    // 자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.
    public static void main4 (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n % 2 == 0) {
            System.out.print(n + " is even");
        } else {
            System.out.print(n + " is odd");
        }
    }

    // 문자열 my_string, overwrite_string과 정수 s가 주어집니다.
    // 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을
    // 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0, s) + overwrite_string;

        if(my_string.length() > answer.length()) {
            answer += my_string.substring(answer.length());
        }

        return answer;
    }
}
