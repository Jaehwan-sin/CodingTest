package org.test.basic_day1_10;

import java.util.ArrayList;
import java.util.List;

public class day6 {

    // 정수 리스트 num_list가 주어질 때,
    // 마지막 원소가 그전 원소보다 크면 마지막 원소에서
    // 그전 원소를 뺀 값을 마지막 원소가 그전 원소보다 크지 않다면
    // 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.
    public List solution(int[] num_list) {
        List<Integer> answer = new ArrayList<>();

        int last = num_list[num_list.length - 1];  // 마지막 원소
        int lastb = num_list[num_list.length - 2];  // 마지막 원소에서 그 전 원소

        for(int i = 0; i < num_list.length; i++){
            answer.add(num_list[i]);
        }

        if (last > lastb) {
            answer.add(last - lastb);
        } else {
            answer.add(last * 2);
        }

        return answer;
    }

    // 정수 n과 문자열 control이 주어집니다.
    // control은 "w", "a", "s", "d"의 4개의 문자로 이루어져 있으며,
    // control의 앞에서부터 순서대로 문자에 따라 n의 값을 바꿉니다.
    // "w" : n이 1 커집니다.
    // "s" : n이 1 작아집니다.
    // "d" : n이 10 커집니다.
    // "a" : n이 10 작아집니다.
    // 위 규칙에 따라 n을 바꿨을 때 가장 마지막에 나오는 n의 값을 return 하는 solution 함수를 완성해 주세요.
    public int solution2 (int n, String control) {
        String[] split = control.split("");

        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("w")) {
                n += 1;
            } else if (split[i].equals("s")) {
                n -= 1;
            } else if (split[i].equals("d")) {
                n += 10;
            } else if (split[i].equals("a")) {
                n -= 10;
            }
        }

        return n;
    }
}
