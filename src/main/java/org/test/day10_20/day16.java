package org.test.day10_20;

import java.util.*;

public class day16 {

    // 머쓱이는 할머니께 생신 축하 편지를 쓰려고 합니다.
    // 할머니가 보시기 편하도록 글자 한 자 한 자를 가로 2cm 크기로 적으려고 하며, 편지를 가로로만 적을 때,
    // 축하 문구 message를 적기 위해 필요한 편지지의 최소 가로길이를 return 하도록 solution 함수를 완성해주세요.
    public int solution(String message) {
        int MessageCount = message.length();

        return MessageCount * 2;
    }

    // 정수 배열 array가 매개변수로 주어질 때,
    // 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
    public int[] solution2 (int[] array) {
        // 최대 값을 저장할 변수
        int maxValue = Integer.MIN_VALUE;

        // 최대 값의 인덱스를 저장할 변수
        int maxIndex = -1;

        // 배열을 순회하면서 최대 값과 인덱스를 찾음
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }

        // 결과를 저장할 배열
        int[] result = {maxValue, maxIndex};
        return result;
    }

    // 2번 다른 풀이 - 좀 더 간결한 코드
    public int[] solution2_1 (int[] array) {
        int[] answer = new int[2];

        for(int i=0;i<array.length;i++) {
            if(array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }

        return answer;
    }

    // my_string은 "3 + 5"처럼 문자열로 된 수식입니다.
    // 문자열 my_string이 매개변수로 주어질 때, 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.
    public int solution3 (String my_string) {
        String[] split = my_string.split(" ");

        int result = Integer.parseInt(split[0]);

        for (int i = 1; i < split.length; i += 2) {
            String operator = split[i];
            int nextNumber = Integer.parseInt(split[i + 1]);

            if (operator.equals("+")) {
                result += nextNumber;
            } else {
                result -= nextNumber;
            }
        }

        return result;
    }

    // 두 배열이 얼마나 유사한지 확인해보려고 합니다.
    // 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.
    public int solution4 (String[] s1, String[] s2) {
        // 동일한 문자를 담아줄 ArrayList 생성
        List<String> word = new ArrayList<>();

        // s1 을 str1, s2를 str2 에 대입하고 str1,str2를 비교해서 동일한 값이면 word에 저장
        for (String str1 : s1) {
            for (String str2 : s2) {
                if (str1.equals(str2)) {
                    word.add(str1);
                }
            }
        }
        // 원소의 개수를 리턴해야하니까 word.size를 리턴한다.
        return word.size();
    }
}
