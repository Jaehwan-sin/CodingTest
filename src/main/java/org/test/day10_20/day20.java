package org.test.day10_20;

import java.util.Arrays;

public class day20 {

    // 정수 배열 numbers가 매개변수로 주어집니다.
    // numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
    public int solution3 (int[] numbers) {
        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length;  i++) {
            for (int j = i+1; j < numbers.length; j++) {
                int product = numbers[i] * numbers[j];
                if (product > answer) {
                    answer = product;
                }
            }
        }

        return answer;
    }
    // 정렬을 이용한 풀이
    public int solution3_1 (int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);

        int edge1 = numbers[0]*numbers[1];
        int edge2 = numbers[numbers.length-2]*numbers[numbers.length-1];

        answer = Math.max(edge1,edge2);
        return answer;
    }
    
    // 한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다.
    // 다항식을 계산할 때는 동류항끼리 계산해 정리합니다.
    // 덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때,
    // 동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요.
    // 같은 식이라면 가장 짧은 수식을 return 합니다.
}
