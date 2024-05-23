package org.test.day10_20;

import java.util.ArrayList;

public class day17 {

    // 정수 num과 k가 매개변수로 주어질 때,
    // num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
    public int solution(int num, int k) {
        int answer = 1;

        // int num을 String으로 변환
        String numStr = String.valueOf(num);

        for (int i = 0; i < numStr.length(); i++) {
            // 각 자릿수를 문자로 변환하여 확인
            int digit = Character.getNumericValue(numStr.charAt(i));
            if (digit == k) {
                answer = i + 1;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }

    // 정수 n과 정수 배열 numlist가 매개변수로 주어질 때,
    // numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.
    public int[] solution(int n, int[] numlist) {
        // n의 배수가 아닌 수들은 가변적이기 때문에 ArrayList 생성
        ArrayList<Integer> answerList = new ArrayList<>();

        // numlist[i]를 n 으로 나누어 0이라면 배수이기 때문에 answerList에 추가
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answerList.add(numlist[i]);
            }
        }

        // ArrayList를 int 배열로 변환
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    // 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
    public int solution2 (int n) {
        int answer = 0;
        // n 매개변수를 배열에 담아 주기위해 String으로 전환 후 배열로 담아 split한다.
        String str = Integer.toString(n);
        String[] arr = str.split("");

        // split한 숫자를 각각 더해서 answer에 추가
        for(int i = 0; i < arr.length; i++) {
            answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }

    // 덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다.
    // 수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.
    public String[] solution4 (String[] quiz) {
        // 정답 리턴할 배열 생성
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            // quiz를 하나의 식으로 나누어 배열에 저장
            String[] s = quiz[i].split(" ");

            // 식의 1번 인덱스가 +일 경우
            if (s[1].equals("+")) {
                // 식의 0,2,4 번째 인덱스는 숫자이기 때문에 + 한 값이 올바른 경우
                if (Integer.parseInt(s[0]) + Integer.parseInt(s[2]) == Integer.parseInt(s[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }

            // 식의 1번 인덱스가 -일 경우
            if (s[1].equals("-")) {
                // 식의 0,2,4 번째 인덱스는 숫자이기 때문에 - 한 값이 올바른 경우
                if (Integer.parseInt(s[0]) - Integer.parseInt(s[2]) == Integer.parseInt(s[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }

        return answer;

    }
}