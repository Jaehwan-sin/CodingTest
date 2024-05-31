package org.test.day11_20;

import java.util.ArrayList;
import java.util.List;

public class day19 {

    // 머쓱이는 행운의 숫자 7을 가장 좋아합니다.
    // 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
    public int solution(int[] array) {
        int answer = 0;

        List<Integer> digits = new ArrayList<>();

        for (int num : array) {
            String numStr = String.valueOf(num);
            for (char c : numStr.toCharArray()) {
                digits.add(Character.getNumericValue(c));
            }
        }

        for (int i = 0; i < digits.size(); i++) {
            if (digits.get(i) == 7) {
                answer++;
            }
        }

        return answer;
    }

    // 문자열 my_str과 n이 매개변수로 주어질 때,
    // my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
    public String[] solution (String my_str, int n) {
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < (my_str.length() / n); i++) {
            answer.add(my_str.substring((n * i), (n * (i + 1))));
        }

        if (my_str.length() % n != 0) {
            answer.add(my_str.substring((my_str.length() / n) * n));
        }

        return answer.toArray(new String[0]);
    }

    // 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때,
    // array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
    public int solution(int[] array, int n) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n)
                answer++;
        }

        return answer;
    }

    // 3번 다른 풀이
    public int solution3_1 (int[] array, int n) {
        int answer = 0;

        for (int num : array) {
            if (num == n) answer++;
        }

        return answer;
    }

    // 머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.
    // 머쓱이네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 매개변수로 주어질 때,
    // 머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요.
    public int solution4 (int[] array, int height) {
        int count = 0; // height보다 큰 키를 가진 사람 수를 세는 변수

        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                count++; // height보다 큰 키를 가진 사람 수 증가
            }
        }

        return count; // height보다 큰 키를 가진 사람 수 반환
    }
}
