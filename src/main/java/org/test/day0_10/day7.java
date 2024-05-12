package org.test.day0_10;

import java.util.Scanner;

public class day6 {

    // 문자열 my_string이 매개변수로 주어집니다.
    // my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string);
        return sb.reverse().toString();
    }

    // "*"의 높이와 너비를 1이라고 했을 때, "*"을 이용해 직각 이등변 삼각형을 그리려고합니다.
    // 정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 출력하도록 코드를 작성해보세요.
    public String solution2() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.println("*");
            }
            System.out.println();
        }

        return null;
    }
    // 정수가 담긴 리스트 num_list가 주어질 때,
    // num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
    public int[] solution3 (int[] num_list) {
        int[] answer = new int[2];

        for (int num : num_list) {
            if (num % 2 == 0) {
                answer[0]++;
            } else {
                answer[1]++;
            }
        }
        return answer;
    }

    // 문자열 my_string과 정수 n이 매개변수로 주어질 때,
    // my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
    public String solution4 (String my_string, int n) {
        String answer = "";

        return answer;
    }
}
