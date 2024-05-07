package org.test.day0_10;

public class Divisionoftwonumbers_day1 {
    // 정수 num1과 num2가 매개변수로 주어질 때,
    // num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
    public int solution(int num1, int num2) {
        double result = (double) num1 / num2 * 1000;
        return (int) result;
    }

    // 정수 num1과 num2가 매개변수로 주어집니다.
    // 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
    public int solution2 (int num1, int num2) {
        if (num1==num2) {
            return 1;
        } else {
            return -1;
        }
    }

}
