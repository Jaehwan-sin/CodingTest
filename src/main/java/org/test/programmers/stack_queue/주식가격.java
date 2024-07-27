package org.test.programmers.stack_queue;

import java.util.Stack;

public class 주식가격 {

    // 문제 - 주식가격

    // 초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때,
    // 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // 현재 가격이 이전 가격보다 낮을 때, 스택에 있는 가격들을 처리
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int idx = stack.pop();
                answer[idx] = i - idx;
            }
            stack.push(i);
        }

        // 스택에 남아 있는 가격들은 끝까지 떨어지지 않은 가격들
        while (!stack.isEmpty()) {
            int idx = stack.pop();
            answer[idx] = n - idx - 1;
        }

        return answer;
    }
}
