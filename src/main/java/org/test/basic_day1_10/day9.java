package org.test.basic_day1_10;

import java.util.ArrayList;

public class day9 {

    // 문자열 배열 intStrs와 정수 k, s, l가 주어집니다. intStrs의 원소는 숫자로 이루어져 있습니다.
    // 배열 intStrs의 각 원소마다 s번 인덱스에서 시작하는 길이 l짜리 부분 문자열을 잘라내 정수로 변환합니다.
    // 이때 변환한 정수값이 k보다 큰 값들을 담은 배열을 return 하는 solution 함수를 완성해 주세요.
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < intStrs.length; i++) {
            String substring = intStrs[i].substring(s,s + l);
            int value = Integer.parseInt(substring);
            if (value > k) {
                result.add(value);
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }

    // 길이가 같은 문자열 배열 my_strings와 이차원 정수 배열 parts가 매개변수로 주어집니다.
    // parts[i]는 [s, e] 형태로, my_string[i]의 인덱스 s부터 인덱스 e까지의 부분 문자열을 의미합니다.
    // 각 my_strings의 원소의 parts에 해당하는 부분 문자열을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        return answer;
    }

    // 문자열 my_string과 정수 n이 매개변수로 주어질 때,
    // my_string의 뒤의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
    public String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }
    
    // 어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다.
    // 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
    // 문자열 my_string과 is_suffix가 주어질 때,
    // is_suffix가 my_string의 접미사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.
    public int solution(String my_string, String is_suffix) {
        if (my_string.endsWith(is_suffix)) {
            return 1;
        } else {
            return 0;
        }
    }
}
