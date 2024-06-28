package org.test.programmers.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sweatshirts {

    // 문제 - 체육복

    // 점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다.
    // 다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다.
    // 학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다.
    // 예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다.
    // 체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.
    // 전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost,
    // 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때,
    // 체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        int answer = 0;

        // 정렬된 배열을 사용하면 편리합니다.
        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 체육복을 도난당한 학생들이 여벌 체육복을 가지고 있는 경우 처리
        List<Integer> realLost = new ArrayList<>();
        for (int l : lost) {
            boolean hasReserve = false;
            for (int r : reserve) {
                if (l == r) {
                    hasReserve = true;
                    break;
                }
            }
            if (!hasReserve) {
                realLost.add(l);
            }
        }

        // 여벌 체육복을 다른 학생에게 빌려주는 경우 처리
        for (int r : reserve) {
            if (realLost.contains(r - 1)) {
                realLost.remove((Integer) (r - 1));
            } else if (realLost.contains(r + 1)) {
                realLost.remove((Integer) (r + 1));
            }
        }

        answer = n - realLost.size();
        System.out.println("answer = " + answer);
    }
}
