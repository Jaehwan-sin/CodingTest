package org.test.day21_25;

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
    public int solution2 (int[][] dots) {
        // 점의 좌표를 변수에 저장
        int x1 = dots[0][0];
        int y1 = dots[0][1];
        int x2 = dots[1][0];
        int y2 = dots[1][1];
        int x3 = dots[2][0];
        int y3 = dots[2][1];
        int x4 = dots[3][0];
        int y4 = dots[3][1];
        int answer = 0;

        // 나올 수 있는 두 쌍의 조합을 계산한다.
        double slope1 = (double) (y2 - y1) / (x2 - x1);
        double slope2 = (double) (y4 - y3) / (x4 - x3);
        if (slope1 == slope2) answer = 1;

        slope1 = (double) (y3 - y1) / (x3 - x1);
        slope2 = (double) (y2 - y4) / (x2 - x4);
        if (slope1 == slope2) answer = 1;

        slope1 = (double) (y4 - y1) / (x4 - x1);
        slope2 = (double) (y2 - y3) / (x2 - x3);
        if (slope1 == slope2) answer = 1;

        return answer;
    }

    // 선분 3개가 평행하게 놓여 있습니다. 세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]] 형태로 들어있는 2차원 배열 lines가 매개변수로 주어질 때,
    // 두 개 이상의 선분이 겹치는 부분의 길이를 return 하도록 solution 함수를 완성해보세요.
    // lines가 [[0, 2], [-3, -1], [-2, 1]]일 때 그림으로 나타내면 다음과 같습니다.
    // 선분이 두 개 이상 겹친 곳은 [-2, -1], [0, 1]로 길이 2만큼 겹쳐있습니다.
    public int solution(int[][] lines) {
        // -100부터 100까지의 범위를 커버하기 위해 201 크기의 배열 사용
        int[] arr = new int[201];

        for (int i = 0; i < lines.length; i++) {
            for (int j = i + 1; j < lines.length; j++) {
                int start1 = lines[i][0];
                int end1 = lines[i][1];
                int start2 = lines[j][0];
                int end2 = lines[j][1];

                // 겹치는 부분을 찾기 위한 시작과 끝 계산
                int overlapStart = Math.max(start1, start2);
                int overlapEnd = Math.min(end1, end2);

                // 겹치는 부분이 있는 경우 arr 배열에 표시
                if (overlapStart < overlapEnd) {
                    for (int k = overlapStart; k < overlapEnd; k++) {
                        // 인덱스 보정: -100을 0으로 맞추기 위해 100을 더함
                        arr[k + 100] = 1;
                    }
                }
            }
        }

        // 겹치는 부분의 길이를 계산
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                answer++;
            }
        }

        return answer;

    }

    // 소수점 아래 숫자가 계속되지 않고 유한개인 소수를 유한소수라고 합니다.
    // 분수를 소수로 고칠 때 유한소수로 나타낼 수 있는 분수인지 판별하려고 합니다.
    // 유한소수가 되기 위한 분수의 조건은 다음과 같습니다.
    // 기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야 합니다.
    // 두 정수 a와 b가 매개변수로 주어질 때, a/b가 유한소수이면 1을, 무한소수라면 2를 return하도록 solution 함수를 완성해주세요.
    public int solution(int a, int b) {
        int finalB = b / GCD(a, b);

        while( finalB != 1) {
            if(finalB % 2 == 0) {
                finalB /= 2;
            }else if (finalB % 5 == 0) {
                finalB /= 5;
            }else {
                return 2;
            }
        } 

        return 1;
    }
    // 유클리드 호제법 - 두 수의 최대 공약수 구하기
    private int GCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }
}
