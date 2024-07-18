package org.test.programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class 정수내림차순 {

    // 문제 - 정수 내림차순 정렬하기
    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr); // 오름차순 정렬

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]); // 문자 하나씩 합치기
        }

        return Long.parseLong(sb.reverse().toString());

    }
}
