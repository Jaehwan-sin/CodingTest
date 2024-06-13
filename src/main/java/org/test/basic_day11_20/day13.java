package org.test.basic_day11_20;

import java.util.ArrayList;
import java.util.Arrays;

public class day13 {

    // 정수 리스트 num_list와 정수 n이 주어질 때,
    // n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.
    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, n-1, num_list.length);
    }

    // 정수 리스트 num_list와 정수 n이 주어질 때,
    // num_list를 n 번째 원소 이후의 원소들과
    // n 번째까지의 원소들로 나눠 n 번째 원소 이후의 원소들을
    // n 번째까지의 원소들 앞에 붙인 리스트를 return하도록 solution 함수를 완성해주세요.
    public int[] solution2 (int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<>();

        int[] ints = Arrays.copyOfRange(num_list, n , num_list.length);
        int[] ints2 = Arrays.copyOfRange(num_list, 0 , n);

        for (int i = 0; i < ints.length; i++) {
            list.add(ints[i]);
        }

        for (int i = 0; i < ints2.length; i++) {
            list.add(ints2[i]);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    // 다른 풀이
    public int[] solution2_1 (int[] num_list, int n) {
        int[] part1 = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] part2 = Arrays.copyOfRange(num_list, 0, n);

        int[] result = new int[part1.length + part2.length];

        System.arraycopy(part1, 0, result, 0, part1.length);
        System.arraycopy(part2, 0, result, part1.length, part2.length);

        return result;
    }
}
