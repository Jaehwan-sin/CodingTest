package org.test.baekjoon.stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class 제로 {

    // 문제 - 제로

    // 나코더 기장 재민이는 동아리 회식을 준비하기 위해서 장부를 관리하는 중이다.
    // 재현이는 재민이를 도와서 돈을 관리하는 중인데, 애석하게도 항상 정신없는 재현이는 돈을 실수로 잘못 부르는 사고를 치기 일쑤였다.
    // 재현이는 잘못된 수를 부를 때마다 0을 외쳐서, 가장 최근에 재민이가 쓴 수를 지우게 시킨다.
    // 재민이는 이렇게 모든 수를 받아 적은 후 그 수의 합을 알고 싶어 한다. 재민이를 도와주자!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt(); // 몇 개 입력할지 갯수
        Stack<Integer> stack = new Stack<>(); // 값을 담을 스택 생성

        // for문으로 입력받은 값 stack에 추가
        for (int i = 0; i < K; i++) { 
            int number = sc.nextInt();

            // 입력 값이 0 이면 최근 값 제거, 나머진 그대로 stack에 추가
            if (number == 0) {
                stack.pop();
            } else {
                stack.push(number);
            }
        }

        // stack의 값을 합계에서 sum에 저장
        int sum = 0;
        for (int num : stack) {
            sum += num;
        }

        System.out.println("stack = " + stack);
        System.out.println("sum = " + sum);
    }
}
