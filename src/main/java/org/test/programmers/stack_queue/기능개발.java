package org.test.programmers.stack_queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 기능개발 {

    // 문제 - 기능개발

    // 프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.
    // 또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고, 
    // 이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.
    // 먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 
    // 각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때 각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> resultList = new ArrayList<>();

        int n = progresses.length;
        int[] daysLeft = new int[n];

        // 각 작업이 완료되기까지 남은 일수를 계산
        for (int i = 0; i < n; i++) {
            daysLeft[i] = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }

        // 배포 주기 계산
        int i = 0;
        while (i < n) {
            int deployDay = daysLeft[i];
            int count = 0;

            // 같은 배포일에 함께 배포될 기능들 계산
            while (i < n && daysLeft[i] <= deployDay) {
                count++;
                i++;
            }

            resultList.add(count);
        }

        // 결과를 배열로 변환
        int[] answer = new int[resultList.size()];
        for (i = 0; i < answer.length; i++) {
            answer[i] = resultList.get(i);
        }

        return answer;
    }
}
