package org.test.programmers;

public class 최소공배수 {

    // 문제 - N개의 최소공배수

    // 두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다.
    // 예를 들어 2와 7의 최소공배수는 14가 됩니다.
    // 정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다.
    // n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요.

    // 두 수의 최대공약수를 구하는 함수
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 두 수의 최소공배수를 구하는 함수
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // 배열의 최소공배수를 구하는 함수
    public static int solution(int[] arr) {
        int answer = arr[0];
        for (int i = 1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 14};
        int answer = solution(arr);
        System.out.println("최소공배수 = " + answer); // expected output: 168
    }
}
