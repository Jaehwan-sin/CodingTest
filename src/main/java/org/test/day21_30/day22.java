package org.test.day21_30;

import java.util.ArrayList;
import java.util.Arrays;

public class day22 {

    // 3x 마을 사람들은 3을 저주의 숫자라고 생각하기 때문에 3의 배수와 숫자 3을 사용하지 않습니다.
    // 3x 마을 사람들의 숫자는 다음과 같습니다.
    // 10진법 1 2 3 4 5 6 7 8 9 10
    // 3x 1 2 4 5 7 8 10 11 14 16
    public int solution(int n) {
        int answer = 0;

        // 매개변수로 들어온 n까지 for문을 돌림
        for (int i = 0; i < n; i++) {
            answer++;
            // 3의 배수거나 "3"을 포함하고 있으면
            while (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                answer++; // answer에 더해주고 리턴한다.
            }
        }
        return answer;
        }

    // 점 네 개의 좌표를 담은 이차원 배열  dots가 다음과 같이 매개변수로 주어집니다.
    // [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]
    // 주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1을 없으면 0을 return 하도록 solution 함수를 완성해보세요.
    public int solution(int[][] dots) {

        return answer;
    }
    }
