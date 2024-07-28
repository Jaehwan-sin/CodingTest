package org.test.baekjoon.stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class 좋은단어 {

    // 문제 - 좋은 단어

    // 이번 계절학기에 심리학 개론을 수강 중인 평석이는 오늘 자정까지 보고서를 제출해야 한다.
    // 보고서 작성이 너무 지루했던 평석이는 노트북에 엎드려서 꾸벅꾸벅 졸다가 제출 마감 1시간 전에 깨고 말았다.
    // 안타깝게도 자는 동안 키보드가 잘못 눌려서 보고서의 모든 글자가 A와 B로 바뀌어 버렸다!
    // 그래서 평석이는 보고서 작성을 때려치우고 보고서에서 '좋은 단어'나 세보기로 마음 먹었다.
    // 평석이는 단어 위로 아치형 곡선을 그어 같은 글자끼리(A는 A끼리, B는 B끼리) 쌍을 짓기로 하였다.
    // 만약 선끼리 교차하지 않으면서 각 글자를 정확히 한 개의 다른 위치에 있는 같은 글자와 짝 지을수 있다면, 그 단어는 '좋은 단어'이다.
    // 평석이가 '좋은 단어' 개수를 세는 것을 도와주자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0; 

        for (int i = 0; i < N; i++) {
            String word = sc.next();
            if (isGoodWord(word)) {
                count++;
            }
        }

        System.out.println("count = " + count);

    }

    private static boolean isGoodWord(String word) {
        Stack<Character> stack = new Stack<>();

        // 단어의 각 문자를 순차적으로 확인
        for (char c : word.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) { // 스택이 비어있지 않고, 스택의 최상단 문자가 현재 문자와 같다면
                stack.pop(); // 스택에서 최상단 문자 제거
            } else {
                stack.push(c); // 스택에 현재 문자를 추가
            }
        }

        return stack.isEmpty(); // 스택이 비어있다면 좋은 단어
    }
}
