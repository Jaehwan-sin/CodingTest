package org.test.day11_20;

import java.util.Arrays;
import java.util.HashSet;
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

    // 문자열 my_string이 매개변수로 주어집니다.
    // my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.
    public String solution3 (String my_string) {
        HashSet<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : my_string.toCharArray()) {
            if (!seen.contains(c)) {
                result.append(c);
                seen.add(c);
            }
        }

        return result.toString();
    }

    // 선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
    // 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
    // 삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다.
    // 세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.
    public int solution(int[] sides) {
        int answer = 0;

        Arrays.sort(sides);

        if (sides[2] < sides[0] + sides[1]) {
            answer = 1;
        } else {
            answer = 2;
        }

        return answer;
    }
}
