package org.test.basic_day11_20;

import java.util.ArrayList;
import java.util.List;

public class day12 {

    // 정수 n과 정수 3개가 담긴 리스트 slicer 그리고 정수 여러 개가 담긴 리스트 num_list가 주어집니다. slicer에 담긴 정수를 차례대로 a, b, c라고 할 때, n에 따라 다음과 같이 num_list를 슬라이싱 하려고 합니다.
    // n = 1 : num_list의 0번 인덱스부터 b번 인덱스까지
    // n = 2 : num_list의 a번 인덱스부터 마지막 인덱스까지
    // n = 3 : num_list의 a번 인덱스부터 b번 인덱스까지
    // n = 4 : num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로
    // 올바르게 슬라이싱한 리스트를 return하도록 solution 함수를 완성해주세요.
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        List<Integer> result = new ArrayList<>();

        if (n == 1) {
            for (int i = 0; i <= b; i++) {
                result.add(num_list[i]);
            }
        } else if (n == 2) {
            for (int i = a; i < num_list.length; i++) {
                result.add(num_list[i]);
            }
        } else if (n == 3) {
            for (int i = a; i <= b; i++) {
                result.add(num_list[i]);
            }
        } else {
            for (int i = a; i <= b; i += c) {
                result.add(num_list[i]);
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }

    // 정수 리스트 num_list가 주어질 때,
    // 첫 번째로 나오는 음수의 인덱스를 return하도록 solution 함수를 완성해주세요.
    // 음수가 없다면 -1을 return합니다.
    public int solution(int[] num_list) {
        int answer = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                answer = i;
                break;
            } else {
                answer = -1;
            }
        }

        return answer;
    }

}
