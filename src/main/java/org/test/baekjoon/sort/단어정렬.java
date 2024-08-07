package org.test.baekjoon.sort;

import java.util.*;

public class 단어정렬 {

    // 문제 - 단어 정렬

    // 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
    // 1. 길이가 짧은 것부터
    // 2. 길이가 같으면 사전 순으로
    // 단, 중복된 단어는 하나만 남기고 제거해야 한다. 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt(); 
        if (N <= 0) {
            System.out.println("");
            return;
        }

        String[] arr = new String[N];

        in.nextLine(); // 개행 버림

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String s1, String s2) {
                // 단어 길이가 같을 경우
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                // 그 외의 경우
                else {
                    return s1.length() - s2.length();
                }
            }
        });

        StringBuilder sb = new StringBuilder();

        sb.append(arr[0]).append('\n');

        for (int i = 1; i < N; i++) {
            // 중복되지 않는 단어만 출력
            if (!arr[i].equals(arr[i - 1])) {
                sb.append(arr[i]).append('\n');
            }
        }

        System.out.println(sb);
    }
}
