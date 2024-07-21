package org.test.programmers;

import java.util.HashSet;
import java.util.Set;

public class 없는숫자더하기 {

    // 문제 - 없는 숫자 더하기

    // 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
    // numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
    public int solution(int[] numbers) {
        Set<Integer> numberSet = new HashSet<>();

        // Hashset에 배열 numbers 값 추가
        for (int number : numbers) {
            numberSet.add(number);
        }

        int sum = 0;

        // numberSet에 9까지 포함되어 있지 않은 값만 합 구하기
        for (int i = 0; i <= 9; i++) {
            if (!numberSet.contains(i)) {
                sum += i;
            }
        }

        return sum;
    }
}
