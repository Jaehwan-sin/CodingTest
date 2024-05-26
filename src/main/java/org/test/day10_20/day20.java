package org.test.day10_20;

import java.util.Arrays;

public class day20 {

    // 2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다.
    // 직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때,
    // 직사각형의 넓이를 return 하도록 solution 함수를 완성해보세요.
    public int solution(int[][] dots) {
        int answer = 0;
        int w = 0; // 길이
        int h = 0; // 높이
        int x = dots[0][0];
        int y = dots[0][1];

        for (int i = 1; i < dots.length; i++) {
            if (x != dots[i][0]) {
                w = Math.abs(x - dots[i][0]); // -값이 있을 수 있으므로 절대값 사용
            }
            if (y != dots[i][1]) {
                h = Math.abs(y - dots[i][1]);
            }
        }
        answer = w * h;
        return answer;
    }

    // 머쓱이는 RPG게임을 하고 있습니다.
    // 게임에는 up, down, left, right 방향키가 있으며 각 키를 누르면 위, 아래, 왼쪽, 오른쪽으로 한 칸씩 이동합니다.
    // 예를 들어 [0,0]에서 up을 누른다면 캐릭터의 좌표는 [0, 1],
    // down을 누른다면 [0, -1], left를 누른다면 [-1, 0],
    // right를 누른다면 [1, 0]입니다.
    // 머쓱이가 입력한 방향키의 배열 keyinput와 맵의 크기 board이 매개변수로 주어집니다.
    // 캐릭터는 항상 [0,0]에서 시작할 때 키 입력이 모두 끝난 뒤에 캐릭터의 좌표 [x, y]를 return하도록 solution 함수를 완성해주세요.
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;

        int xLimit = (board[0] - 1) / 2;
        int yLimit = (board[1] - 1) / 2;

        for (String key : keyinput) {
            switch (key) {
                case "up":
                    if (y < yLimit) y++;
                    break;
                case "down":
                    if (y > -yLimit) y--;
                    break;
                case "left":
                    if (x > -xLimit) x--;
                    break;
                case "right":
                    if (x < xLimit) x++;
                    break;
            }
        }

        int[] answer = new int[]{x,y};
        return answer;

    }

    // 정수 배열 numbers가 매개변수로 주어집니다.
    // numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
    public int solution3 (int[] numbers) {
        int answer = Integer.MIN_VALUE;

        // 가능한 조합의 두 쌍을 조합해 곱을 다 계산해서 맥스값 구하기
        for (int i = 0; i < numbers.length;  i++) {
            for (int j = i+1; j < numbers.length; j++) {
                int product = numbers[i] * numbers[j];
                if (product > answer) {
                    answer = product;
                }
            }
        }

        return answer;
    }
    // 정렬을 이용한 풀이
    public int solution3_1 (int[] numbers) {
        int answer = 0;

        // 배열 정렬
        Arrays.sort(numbers);

        // 가장 작은 두 수의 곱과 가장 큰 두 수의 곱 중 최댓값 계산
        int edge1 = numbers[0]*numbers[1];
        int edge2 = numbers[numbers.length-2]*numbers[numbers.length-1];

        answer = Math.max(edge1,edge2);
        return answer;
    }

    // 한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다.
    // 다항식을 계산할 때는 동류항끼리 계산해 정리합니다.
    // 덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때,
    // 동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요.
    // 같은 식이라면 가장 짧은 수식을 return 합니다.
    public String solution4 (String polynomial) {
        String answer = "";

        // 문제에 변수는 x만 존재하고 항이랑 연산기호 사이에는 항상 공백이 존재한다.
        String[] strArr = polynomial.split(" \\+ ");

        // count[0]은 x 계수 합, count[1]은 상수 합
        int[] count = new int[2];

        for(String str : strArr){
            if(str.contains("x")){
                str = str.replace("x", ""); // x를 제거하고 상수만 남긴다.
                count[0] += str.equals("") ? 1 : Integer.parseInt(str); // x는 1로 처리하여 계산
            }else{
                count[1] += Integer.parseInt(str); // 상수 계산
            }
        }

        // x의 계수가 0이 아닌 경우
        if(count[0] > 0){
            answer += count[0] == 1 ? "x" : count[0] + "x";
        }

        // 상수가 0이 아닌 경우
        if(answer.length() > 0 && count[1] > 0){
            answer += " + ";
        }

        if(count[1] > 0){
            answer += count[1];
        }

        return answer;
    }
}
