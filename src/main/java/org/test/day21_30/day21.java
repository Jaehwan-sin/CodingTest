package org.test.day21_30;

import java.util.ArrayList;
import java.util.Arrays;

public class day21 {

    // 문자열 my_string이 매개변수로 주어집니다.
    // my_string은 소문자, 대문자, 자연수로만 구성되어있습니다.
    // my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
    public int solution(String my_string) {
        int answer = 0;

        // 소문자,대문자 영어 a-z 를 다 " " 으로 대체한다.
        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

        // ""을 제외한 다른 글자를 int형변환 후 더한다.
        for (String s : str) {
            if (!s.equals("")) {
                answer += Integer.parseInt(s);
            }
        }
        return answer;
    }

    // 다음 그림과 같이 지뢰가 있는 지역과 지뢰에 인접한 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.
    // image.png
    // 지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재합니다.
    // 지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 return하도록 solution 함수를 완성해주세요.
    public int solution(int[][] board) {
        // 1이 있는 위치를 저장할 리스트
        ArrayList<int[]> list = new ArrayList<>();
        int answer = 0;
        // 상하좌우 및 대각선을 나타나는 배열
        int[] dx = {0,1,-1,0,-1,1,1,-1};
        int[] dy = {1,0,0,-1,-1,1,-1,1};

        // 1이 있는 위치 저장
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 1){
                    int[] temp = {i,j};
                    list.add(temp);
                }
            }
        }

        // 1의 주변 위치를 1로 설정
        for(int a = 0 ; a < list.size(); a++){
            int i = list.get(a)[0];
            int j = list.get(a)[1];
            for(int k = 0 ; k < 8; k++){
                if(dx[k] + i >= 0 && dy[k] + j >= 0 && dx[k] + i <= board.length-1 && dy[k] + j <= board.length-1)
                    board[dx[k] + i][dy[k] + j] = 1;
            }
        }

        // 0의 갯수 세고 answer에 담아 리턴
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 0) answer+=1;
            }
        }
        return answer;
    }

    // 선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
    // 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
    // 삼각형의 두 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다.
    // 나머지 한 변이 될 수 있는 정수의 개수를 return하도록 solution 함수를 완성해주세요.
    public int solution(int[] sides) {
        int answer = 0;

        // 오름차순 정렬
        Arrays.sort(sides);

        // 정렬된 배열의 가장 작은 값을 0번 인덱스에 가장 큰 값을 1번 인덱스에 저장한다.
        int max = sides[1];
        int min = sides[0];

        int high_range = max + min;
        int low_range = max - min;

        answer = high_range - low_range - 1;

        return answer;
    }

    // PROGRAMMERS-962 행성에 불시착한 우주비행사 머쓱이는 외계행성의 언어를 공부하려고 합니다. 알파벳이 담긴 배열 spell과 외계어 사전 dic이 매개변수로 주어집니다. spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic에 존재한다면 1, 존재하지 않는다면 2를 return하도록 solution 함수를 완성해주세요.
}
