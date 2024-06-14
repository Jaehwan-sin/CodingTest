package org.test.basic_day11_20;

import java.util.ArrayList;
import java.util.List;

public class day14 {

    // 정수 리스트 num_list가 주어집니다.
    // 가장 첫 번째 원소를 1번 원소라고 할 때,
    // 홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 return 하도록 solution 함수를 완성해주세요.
    // 두 값이 같을 경우 그 값을 return합니다.
    public int solution(int[] num_list) {
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                evenSum += num_list[i];
            } else {
                oddSum += num_list[i];
            }
        }

        return (oddSum > evenSum) ? oddSum : evenSum;
    }

    // 최대 5명씩 탑승가능한 놀이기구를 타기 위해 줄을 서있는 사람들의 이름이 담긴 문자열 리스트 names가 주어질 때,
    // 앞에서 부터 5명씩 묶은 그룹의 가장 앞에 서있는 사람들의 이름을 담은 리스트를 return하도록 solution 함수를 완성해주세요.
    // 마지막 그룹이 5명이 되지 않더라도 가장 앞에 있는 사람의 이름을 포함합니다.
    public String[] solution(String[] names) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            if(i % 5 == 0) list.add(names[i]);
        }

        return list.toArray(new String[list.size()]);
    }
}
