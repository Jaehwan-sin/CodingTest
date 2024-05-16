package org.test.day0_10;

public class day10 {

    // x 좌표와 y 좌표가 모두 양수이면 제1사분면에 속합니다.
    // x 좌표가 음수, y 좌표가 양수이면 제2사분면에 속합니다.
    // x 좌표와 y 좌표가 모두 음수이면 제3사분면에 속합니다.
    // x 좌표가 양수, y 좌표가 음수이면 제4사분면에 속합니다.
    // x 좌표 (x, y)를 차례대로 담은 정수 배열 dot이 매개변수로 주어집니다.
    //  좌표 dot이 사분면 중 어디에 속하는지 1, 2, 3, 4 중 하나를 return 하도록 solution 함수를 완성해주세요.
    public int solution(int[] dot) {
        int answer = 0;

        if (dot[0] > 0 && dot[1] > 0) {
            answer = 1;
        } else if (dot[0] < 0 && dot[1] > 0) {
            answer = 2;
        } else if (dot[0] < 0 && dot[1] < 0) {
            answer = 3;
        } else {
            answer = 4;
        }

        return answer;
    }

    // 정수 배열 num_list와 정수 n이 매개변수로 주어집니다.
    // num_list를 다음 설명과 같이 2차원 배열로 바꿔 return하도록 solution 함수를 완성해주세요.
    // num_list가 [1, 2, 3, 4, 5, 6, 7, 8] 로 길이가 8이고 n이 2이므로 num_list를 2 * 4 배열로 다음과 같이 변경합니다.
    // 2차원으로 바꿀 때에는 num_list의 원소들을 앞에서부터 n개씩 나눠 2차원 배열로 변경합니다.
    public int[][] solution2 (int[] num_list, int n) {
        int numRows = num_list.length / n;
        int[][] answer = new int[numRows][n];
        int index = 0;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[index++];
            }
        }

        return answer;
    }
}
