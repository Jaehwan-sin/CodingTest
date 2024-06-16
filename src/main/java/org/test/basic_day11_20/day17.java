package org.test.basic_day11_20;

import java.util.ArrayList;

public class day17 {

    // 문자열 myString과 pat가 주어집니다.
    // myString의 부분 문자열중 pat로 끝나는 가장 긴 부분 문자열을 찾아서 return 하는 solution 함수를 완성해 주세요.
    public String solution(String myString, String pat) {
        int i = myString.lastIndexOf(pat);
        return myString.substring(0, i) + pat;
    }

    // 문자열 myString과 pat이 주어집니다.
    // myString에서 pat이 등장하는 횟수를 return 하는 solution 함수를 완성해 주세요.
    public int solution2 (String myString, String pat) {
        int index = 0;
        int count = 0;

        while ((index = myString.indexOf(pat, index)) != -1) {
            count++;
            index++;
        }

        return count;
    }

    // 문자열 배열 strArr가 주어집니다.
    // 배열 내의 문자열 중 "ad"라는 부분 문자열을 포함하고 있는 모든 문자열을 제거하고
    // 남은 문자열을 순서를 유지하여 배열로 return 하는 solution 함수를 완성해 주세요.
    public String[] solution(String[] strArr) {
        ArrayList<String> result = new ArrayList<>();
        for (String str : strArr) {
            if (!str.contains("ad")) {
                result.add(str);
            }
        }

        String[] resultArr = result.toArray(new String[0]);

        return resultArr;
    }

    // 단어가 공백 한 개로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때,
    // my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
    public String[] solution4 (String my_string) {
        return my_string.split(" ");
    }

    // 단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때,
    // my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
    public String[] solution5 (String my_string) {
        return my_string.trim().split("\\s+");
    }
}
