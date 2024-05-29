package org.test.day21_30;

import java.util.Arrays;

public class day23 {

    // 정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다.
    // 이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다.
    // 정수가 담긴 배열 numlist와 정수 n이 주어질 때
    // numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        double[] order = new double[numlist.length];

        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] - n < 0)
                // n을 뺏을 때 음수 값인 경우, +0.5를 해서 같은 거리에 있는 양수 값보다 정렬을 했을 시 뒤로 밀리도록 함
                order[i] = ((int)Math.abs(numlist[i] - n)) + 0.5;
            else
                order[i] = numlist[i] - n;
        }

        Arrays.sort(order); // 오름차순 정렬

        for(int i = 0; i < numlist.length; i++) {
            if(order[i] % 1 != 0) answer[i] = n - (int)order[i];
            else answer[i] = (int)order[i] + n;
        }

        return answer;
    }

    // 영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다.
    // 영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때,
    // 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.
    public int[] solution(int[][] score) {
        float[] average = new float[score.length];
        for(int i = 0; i < score.length; i++) {
            average[i] = (float)((score[i][0] + score[i][1]) / 2.0);
        }

        int[] answer = new int[score.length];
        for(int j = 0; j < score.length; j++) {
            int order = 1;
            for(int k = 0; k < score.length; k++) {
                if(average[j] < average[k]) order++;
                answer[j] = order;
            }
        }

        return answer;
    }
}
