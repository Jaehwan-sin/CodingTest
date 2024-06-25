package org.test.basic_day21_25;

public class day25 {

    // 양의 정수 n이 매개변수로 주어집니다.
    // n × n 배열에 1부터 n2 까지 정수를 인덱스 [0][0]부터 시계방향 나선형으로 배치한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int value = 1; // 채워야 할 정수 값
        int row = 0; // 현재 행 위치
        int col = 0; // 현재 열 위치
        int direction = 0; // 이동 방향 (0: 오른쪽, 1: 아래, 2: 왼쪽, 3: 위)

        while (value <= n * n) { // 모든 정수 값을 배열에 채우면 종료
            answer[row][col] = value++; // 현재 위치에 값을 채우고 다음 값으로 이동

            // 다음 이동할 위치 계산
            if (direction == 0) { // 오른쪽 방향으로 이동
                if (col == n - 1 || answer[row][col + 1] != 0) {
                    direction = 1;
                    row++;
                } else {
                    col++;
                }
            } else if (direction == 1) { // 아래쪽 방향으로 이동
                if (row == n - 1 || answer[row + 1][col] != 0) {
                    direction = 2;
                    col--;
                } else {
                    row++;
                }
            } else if (direction == 2) { // 왼쪽 방향으로 이동
                if (col == 0 || answer[row][col - 1] != 0) {
                    direction = 3;
                    row--;
                } else {
                    col--;
                }
            } else if (direction == 3) { // 위쪽 방향으로 이동
                if (row == 0 || answer[row - 1][col] != 0) {
                    direction = 0;
                    col++;
                } else {
                    row--;
                }
            }
        }

        return answer;
    }

    // n × n 크기의 이차원 배열 arr이 매개변수로 주어질 때,
    // arr이 다음을 만족하면 1을 아니라면 0을 return 하는 solution 함수를 작성해 주세요.
    // 0 ≤ i, j < n인 정수 i, j에 대하여 arr[i][j] = arr[j][i]
    public int solution(int[][] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != arr[j][i]) {
                    return 0;
                }
            }
        }

        return 1;
    }

    // 이차원 정수 배열 arr이 매개변수로 주어집니다.
    // arr의 행의 수가 더 많다면 열의 수가 행의 수와 같아지도록 각 행의 끝에 0을 추가하고,
    // 열의 수가 더 많다면 행의 수가 열의 수와 같아지도록 각 열의 끝에 0을 추가한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.
    public int[][] solution4 (int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        if (rows > cols) {
            // 행이 더 많을 경우
            int[][] answer = new int[rows][rows];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < rows; j++) {
                    if (j < cols) {
                        answer[i][j] = arr[i][j];
                    } else {
                        answer[i][j] = 0;
                    }
                }
            }
            return answer;
        } else if (cols > rows) {
            // 열이 더 많을 경우
            int[][] answer = new int[cols][cols];
            for (int i = 0; i < cols; i++) {
                for (int j = 0; j < cols; j++) {
                    if (i < rows) {
                        answer[i][j] = arr[i][j];
                    } else {
                        answer[i][j] = 0;
                    }
                }
            }
            return answer;
        } else {
            // 행과 열이 같을 경우
            return arr;
        }
    }

    // 2차원 정수 배열 board와 정수 k가 주어집니다.
    // i + j <= k를 만족하는 모든 (i, j)에 대한 board[i][j]의 합을 return 하는 solution 함수를 완성해 주세요.
    public int solution(int[][] board, int k) {
        int answer = 0;
        for(int i =0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++) {
                if(i+j <= k) {
                    answer += board[i][j];
                }
            }
        }
        return answer;
    }
}
