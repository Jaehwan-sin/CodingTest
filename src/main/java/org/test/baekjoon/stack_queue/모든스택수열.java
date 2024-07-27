package org.test.baekjoon.stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class 모든스택수열 {

    // 문제 - 모든 스택 수열

    // 스택 (stack)은 기본적인 자료구조 중 하나로, 컴퓨터 프로그램을 작성할 때 자주 이용되는 개념이다.
    // 스택은 자료를 넣는 (push) 입구와 자료를 뽑는 (pop) 입구가 같아 제일 나중에 들어간 자료가 제일 먼저 나오는 (LIFO, Last in First out) 특성을 가지고 있다.
    // 1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다.
    // 이때, 스택에 push하는 순서는 반드시 오름차순을 지키도록 한다고 하자. n이 주어졌을 때, 만들 수 있는 모든 스택 수열을 구해보자.
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();  // 수열의 크기 입력
            int[] sequence = new int[n];

            // 수열 입력
            for (int i = 0; i < n; i++) {
                sequence[i] = sc.nextInt();
            }

            Stack<Integer> stack = new Stack<>();
            StringBuilder result = new StringBuilder();
            int current = 1;  // 현재 스택에 추가할 숫자

            // 수열을 만들기 위한 스택 연산
            for (int i = 0; i < n; i++) {
                int value = sequence[i];

                // value에 도달할 때까지 push 연산 수행
                while (current <= value) {
                    stack.push(current);  // 스택에 숫자 추가
                    result.append("+\n");  // push 연산 기록
                    current++;
                }

                // 스택의 최상단 값이 value와 같으면 pop 연산 수행
                if (stack.peek() == value) {
                    stack.pop();  // 스택에서 숫자 제거
                    result.append("-\n");  // pop 연산 기록
                } else {
                    // 수열을 만들 수 없는 경우
                    System.out.println("NO");
                    return;
                }
            }

            // 모든 연산 결과 출력
            System.out.println(result.toString());
        }
    }

}
