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

    // 머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다.
    // 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을 최대 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다.
    // 문자열 배열 babbling이 매개변수로 주어질 때,
    // 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.
    public int solution(String[] babbling) {
        int answer = 0;
        String[] check= {"aya", "ye", "woo", "ma"};

        for(String b : babbling) {                  //babbling 에 있는 String 을 하나씩 꺼내옴
            for(String c : check) {                 //check 에 있는 String 을 하나씩 꺼내옴
                b=b.replace(c, " ");                //b 에 c 가 있으면 일단 전부 공백으로 변경(나머지를 구분 하기위해)
            }
            if(b.replaceAll(" ", "").equals("")) {  //공백처리한 b 에 있는 공백을 없에고 남은게 아무것도 없으면
                answer++;                           //answer에 카운트+1
            }
        }
        return answer;
    }

    // 머쓱이는 프로그래머스에 로그인하려고 합니다.
    // 머쓱이가 입력한 아이디와 패스워드가 담긴 배열 id_pw와 회원들의 정보가 담긴 2차원 배열 db가 주어질 때,
    // 다음과 같이 로그인 성공, 실패에 따른 메시지를 return하도록 solution 함수를 완성해주세요.
    // 아이디와 비밀번호가 모두 일치하는 회원정보가 있으면 "login"을 return합니다.
    // 로그인이 실패했을 때 아이디가 일치하는 회원이 없다면 “fail”를, 아이디는 일치하지만 비밀번호가 일치하는 회원이 없다면 “wrong pw”를 return 합니다.
    public String solution(String[] id_pw, String[][] db) {
        for(int i = 0; i<db.length; i++) {
            if(id_pw[0].equals(db[i][0])) {
                if(id_pw[1].equals(db[i][1])) {
                    return "login";
                } else {
                    return "wrong pw";
                }
            }
        }
        return "fail";
    }
}
