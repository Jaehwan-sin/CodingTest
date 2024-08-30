package org.test.programmers;

import java.util.TreeSet;

public class 두개뽑아서더하기 {

    // 문제 - 두개 뽑아서 더하기

    // 정수 배열 numbers가 주어집니다.
    // numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
    public int[] solution(int[] numbers) {
        TreeSet<Integer> resultSet = new TreeSet<>();  // 중복을 제거하고 자동으로 정렬하기 위해 TreeSet 사용

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {  // j는 i+1부터 시작하여 같은 인덱스를 사용하지 않도록 함
                int sum = numbers[i] + numbers[j];
                resultSet.add(sum);
            }
        }

        // 결과를 배열로 변환
        int[] answer = new int[resultSet.size()];
        int idx = 0;
        for (int num : resultSet) {
            answer[idx++] = num;
        }

        return answer;
    }
}
