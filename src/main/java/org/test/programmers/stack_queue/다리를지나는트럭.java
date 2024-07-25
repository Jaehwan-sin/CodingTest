package org.test.programmers.stack_queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {

    // 문제 - 다리를 지나는 트럭

    // 트럭 여러 대가 강을 가로지르는 일차선 다리를 정해진 순으로 건너려 합니다.
    // 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아내야 합니다.
    // 다리에는 트럭이 최대 bridge_length대 올라갈 수 있으며, 다리는 weight 이하까지의 무게를 견딜 수 있습니다.
    // 단, 다리에 완전히 오르지 않은 트럭의 무게는 무시합니다.
    // 예를 들어, 트럭 2대가 올라갈 수 있고 무게를 10kg까지 견디는 다리가 있습니다.
    // 무게가 [7, 4, 5, 6]kg인 트럭이 순서대로 최단 시간 안에 다리를 건너려면 다음과 같이 건너야 합니다.
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0; // 다리를 건너는 데 걸린 시간
        int current_weight = 0; // 현재 다리 위에 있는 트럭들의 무게 합
        Queue<Integer> bridge = new LinkedList<>(); // 다리 위의 트럭들을 관리할 큐

        // 각 트럭에 대해 처리
        for (int truck : truck_weights) {
            while (true) {
                // 다리에 올라간 트럭 수가 다리 길이와 같으면 트럭이 다리를 다 건넜다는 의미
                if (bridge.size() == bridge_length) {
                    current_weight -= bridge.poll(); // 다리에서 트럭을 내리고 무게를 갱신
                }

                // 현재 트럭을 다리에 올릴 수 있는지 확인
                if (current_weight + truck <= weight) {
                    bridge.add(truck); // 트럭을 다리에 올림
                    current_weight += truck; // 현재 무게를 갱신
                    time++; // 시간을 증가
                    break; // 다음 트럭으로 넘어가기 위해 루프 탈출
                } else {
                    // 무게 초과로 트럭을 올릴 수 없을 때는 시간을 1초 추가하고
                    // 다리에 0을 추가하여 트럭이 지나가도록 함
                    bridge.add(0); // 무게 초과이므로 빈 공간을 추가
                    time++; // 시간을 증가
                }
            }
        }

        // 마지막 트럭이 다리를 완전히 건너는 시간 추가
        time += bridge_length;

        return time;
    }
}
