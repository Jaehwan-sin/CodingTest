package org.test.day10_20;

import java.util.Stack;

public class day13 {

    // 숫자와 "Z"가 공백으로 구분되어 담긴 문자열이 주어집니다.
    // 문자열에 있는 숫자를 차례대로 더하려고 합니다.
    // 이 때 "Z"가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다.
    // 숫자와 "Z"로 이루어진 문자열 s가 주어질 때, 머쓱이가 구한 값을 return 하도록 solution 함수를 완성해보세요.
    public int solution(String s) {
        String[] sArray = s.split(" ");
        int result = 0;
        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i].equals("Z")) {
                result -= Integer.parseInt(sArray[i - 1]);
                continue;
            }
            result += Integer.parseInt(sArray[i]);
        }
        return result;
    }

    // stack을 사용한 다른 풀이
    public int solution1 (String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (String w : s.split(" ")) {
            if (w.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(w));
            }
        }
        for (int i : stack) {
            answer += i;
        }
        return answer;
    }

    // 문자열 배열 strlist가 매개변수로 주어집니다.
    // strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.
    public int[] solution2 (String[] strlist) {
        int[] answer = new int[strlist.length];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}
