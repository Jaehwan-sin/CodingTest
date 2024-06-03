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

    // 문자들이 담겨있는 배열 arr가 주어집니다.
    // arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
    public String solution2 (String[] arr) {
        String answer = "";

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        return answer;
    }

    // 문자열 my_string과 정수 k가 주어질 때,
    // my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.
    public String solution3 (String my_string, int k) {
        String answer = "";

        for (int i = 1; i <= k ; i++) {
            answer += (my_string);
        }

        return answer;
    }

    // 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
    // 12 ⊕ 3 = 123
    // 3 ⊕ 12 = 312
    // 양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
    // 단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
    public int solution4 (int a, int b) {
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);

        if (Integer.parseInt(ab) >= Integer.parseInt(ba)) {
            return Integer.parseInt(ab);
        } else {
            return Integer.parseInt(ba);
        }

    }

    // 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
    // 12 ⊕ 3 = 123
    // 3 ⊕ 12 = 312
    // 양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
    // 단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.
    public int solution(int a, int b) {
        String sValue = String.valueOf(a) + String.valueOf(b);
        int c = 2 * a * b;

        if (Integer.parseInt(sValue) > c) {
            return Integer.parseInt(sValue);
        } else {
            return c;
        }
    }
}
