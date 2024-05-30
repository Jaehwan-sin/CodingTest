package org.test.day21_30;

import java.util.Arrays;

public class day24 {

    // 프로그래머스 치킨은 치킨을 시켜먹으면 한 마리당 쿠폰을 한 장 발급합니다.
    // 쿠폰을 열 장 모으면 치킨을 한 마리 서비스로 받을 수 있고, 서비스 치킨에도 쿠폰이 발급됩니다.
    // 시켜먹은 치킨의 수 chicken이 매개변수로 주어질 때 받을 수 있는 최대 서비스 치킨의 수를 return하도록 solution 함수를 완성해주세요.
    public int solution(int chicken) {
        int answer = 0;

        while (chicken >= 10) {
            answer += chicken / 10;
            chicken = (chicken / 10) + (chicken % 10);
        }

        return answer;
    }

    // 이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때,
    // 두 이진수의 합을 return하도록 solution 함수를 완성해주세요.
    public String solution2 (String bin1, String bin2) {
        int num1 = Integer.parseInt(bin1,2);
        int num2 = Integer.parseInt(bin2,2);

        return Integer.toBinaryString(num1+num2);
    }

    // 문자열 before와 after가 매개변수로 주어질 때,
    // before의 순서를 바꾸어 after를 만들 수 있으면 1을,
    // 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.
    public int solution3 (String before, String after) {
        char[] arr1 = before.toCharArray();
        char[] arr2 = after.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String str1 = new String(arr1);
        String str2 = new String(arr2);

        return str1.equals(str2) ? 1 : 0;
    }

    // 1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다.
    // 정수 i, j, k가 매개변수로 주어질 때,
    // i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.

}
