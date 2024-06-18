package org.test.basic_day11_20;

import java.util.ArrayList;
import java.util.Arrays;

public class day18 {

    // 문자열 myString이 주어집니다.
    // myString을 문자 "x"를 기준으로 나눴을 때 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
    public int[] solution(String myString) {
        String[] split = myString.split("x", -1);
        int[] answer = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            answer[i] = split[i].length();
        }

        return answer;
    }

    // 문자열 myString이 주어집니다.
    // "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후 사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요.
    // 단, 빈 문자열은 반환할 배열에 넣지 않습니다.
    public String[] solution2 (String myString) {
        String[] splitArr = myString.split("x");
        ArrayList<String> resultList = new ArrayList<>();

        for (String str : splitArr) {
            if (!str.isEmpty()) {
                resultList.add(str);
            }
        }

        String[] resultArr = resultList.toArray(new String[resultList.size()]);
        Arrays.sort(resultArr);

        return resultArr;
    }

    // 문자열 binomial이 매개변수로 주어집니다.
    // binomial은 "a op b" 형태의 이항식이고
    // a와 b는 음이 아닌 정수, op는 '+', '-', '*' 중 하나입니다.
    // 주어진 식을 계산한 정수를 return 하는 solution 함수를 작성해 주세요.
    public int solution3 (String binomial) {
        String[] split = binomial.split(" ");
        int result = 0;

        int a = Integer.parseInt(split[0]);
        String op = split[1];
        int b = Integer.parseInt(split[2]);

        switch (op) {
            case  "+" :
                result = a + b;
                break;
            case  "-" :
                result = a - b;
                break;
            case  "*" :
                result = a * b;
                break;
        }

        return result;
    }

    // 문자 "A"와 "B"로 이루어진 문자열 myString과 pat가 주어집니다.
    // myString의 "A"를 "B"로, "B"를 "A"로 바꾼 문자열의 연속하는 부분 문자열 중 pat이 있으면 1을 아니면 0을 return 하는 solution 함수를 완성하세요.
    public int solution4 (String myString, String pat) {
        StringBuilder sb = new StringBuilder();

        for (char ch : myString.toCharArray()) {
            if (ch == 'A') {
                sb.append('B');
            } else if (ch == 'B') {
                sb.append('A');
            }
        }

        if (sb.toString().contains(pat)) {
            return 1;
        } else {
            return 0;
        }
    }

    // 'm'과 "rn"이 모양이 비슷하게 생긴 점을 활용해 문자열에 장난을 하려고 합니다.
    // 문자열 rny_string이 주어질 때, rny_string의 모든 'm'을 "rn"으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
    public String solution5 (String rny_string) {
        return rny_string.replace("m", "rn");
    }
}
