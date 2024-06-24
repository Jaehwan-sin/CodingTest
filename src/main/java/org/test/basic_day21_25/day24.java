package org.test.basic_day21_25;

import java.util.ArrayList;
import java.util.List;

public class day24 {

    // 팀의 막내인 철수는 아메리카노와 카페 라테만 판매하는 카페에서 팀원들의 커피를 사려고 합니다.
    // 아메리카노와 카페 라테의 가격은 차가운 것과 뜨거운 것 상관없이 각각 4500, 5000원입니다.
    // 각 팀원에게 마실 메뉴를 적어달라고 하였고, 그 중에서 메뉴만 적은 팀원의 것은 차가운 것으로 통일하고 "아무거나"를 적은 팀원의 것은 차가운 아메리카노로 통일하기로 하였습니다.
    // 각 직원이 적은 메뉴가 문자열 배열 order로 주어질 때, 카페에서 결제하게 될 금액을 return 하는 solution 함수를 작성해주세요. order의 원소는 아래의 것들만 들어오고, 각각의 의미는 다음과 같습니다.
    public int solution(String[] order) {
        int americano = 4500;
        int cafelatte = 5000;
        int answer = 0;

        for (int i = 0; i < order.length; i++) {
            if (order[i].contains("americano") || order[i].contains("anything")) {
                answer += americano;
            } else if (order[i].contains("cafelatte")) {
                answer += cafelatte;
            }
        }

        return answer;
    }

    // 직사각형 형태의 그림 파일이 있고, 이 그림 파일은 1 × 1 크기의 정사각형 크기의 픽셀로 이루어져 있습니다.
    // 이 그림 파일을 나타낸 문자열 배열 picture과 정수 k가 매개변수로 주어질 때,
    // 이 그림 파일을 가로 세로로 k배 늘린 그림 파일을 나타내도록 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
    public String[] solution(String[] picture, int k) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < picture.length; i++) {
            String[] enlarge = picture[i].split("");
            String str = "";

            for (int j = 0; j < enlarge.length; j++) {
                str += enlarge[j].repeat(k);
            }

            for (int j = 0; j < k; j++) {
                list.add(str);
            }
        }

        return list.toArray(new String[list.size()]);

    }

    // 정수 배열 arr와 자연수 k가 주어집니다.
    // 만약 k가 홀수라면 arr의 모든 원소에 k를 곱하고, k가 짝수라면 arr의 모든 원소에 k를 더합니다.
    // 이러한 변환을 마친 후의 arr를 return 하는 solution 함수를 완성해 주세요.
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (k % 2 != 0) {
                answer[i] = arr[i]*k;
            } else {
                answer[i] = arr[i]+k;
            }
        }

        return answer;
    }

    // 알파벳 소문자로 이루어진 문자열 myString이 주어집니다.
    // 알파벳 순서에서 "l"보다 앞서는 모든 문자를 "l"로 바꾼 문자열을 return 하는 solution 함수를 완성해 주세요.
    public String solution(String myString) {
        return myString.replaceAll("[a-k]", "l");
    }

    // 정수 n이 매개변수로 주어질 때,
    // 다음과 같은 n × n 크기의 이차원 배열 arr를 return 하는 solution 함수를 작성해 주세요.
    // arr[i][j] (0 ≤ i, j < n)의 값은 i = j라면 1, 아니라면 0입니다.
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for (int i = 0; i < n; i++) {
            answer[i][i] = 1;
        }

        return answer;
    }
}
