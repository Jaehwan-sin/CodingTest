package org.test.basic_day21_25;

import java.math.BigInteger;
import java.util.ArrayList;

public class day22 {

    // 정수로 이루어진 문자열 n_str이 주어질 때,
    // n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return하도록 solution 함수를 완성해주세요.
    public String solution(String n_str) {
        return ""+Integer.parseInt(n_str);
    }

    // 0 이상의 두 정수가 문자열 a, b로 주어질 때, a + b의 값을 문자열로 return 하는 solution 함수를 작성해 주세요.
    public String solution(String a, String b) {
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        BigInteger sum = numA.add(numB);

        String answer = sum.toString();

        return answer;
    }

    // 정수 n이 주어질 때, n을 문자열로 변환하여 return하도록 solution 함수를 완성해주세요.
    public String solution(int n) {
        return Integer.toString(n);
    }

    // 정수 배열 arr과 delete_list가 있습니다.
    // arr의 원소 중 delete_list의 원소를 모두 삭제하고 남은 원소들은 기존의 arr에 있던 순서를 유지한 배열을 return 하는 solution 함수를 작성해 주세요.
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();

        // arr의 요소를 list에 추가
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        // delete_list의 요소를 list에서 제거
        for (int i = 0; i < delete_list.length; i++) {
            list.remove(Integer.valueOf(delete_list[i]));
        }

        // 결과를 int 배열로 변환하여 반환
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    // 부분 문자열이란 문자열에서 연속된 일부분에 해당하는 문자열을 의미합니다.
    // 예를 들어, 문자열 "ana", "ban", "anana", "banana", "n"는 모두 문자열 "banana"의 부분 문자열이지만, "aaa", "bnana", "wxyz"는 모두 "banana"의 부분 문자열이 아닙니다.
    // 문자열 my_string과 target이 매개변수로 주어질 때, target이 문자열 my_string의 부분 문자열이라면 1을, 아니라면 0을 return 하는 solution 함수를 작성해 주세요.
    public int solution5 (String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
    }
}
