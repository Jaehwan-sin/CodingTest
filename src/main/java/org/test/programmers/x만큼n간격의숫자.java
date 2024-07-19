package org.test.programmers;

import java.util.Arrays;

public class x만큼n간격의숫자 {

    // 문제 - x만틈 간격이 있는 n개의 숫자

    // 함수 solution은 정수 x와 자연수 n을 입력 받아, 
    // x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 
    // 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
    public long[] solution(int x, int n) {
        long[] arr = new long[n]; // 결과 배열은 long형으로 선언

        for (int i = 0; i < n; i++) {
            arr[i] = (long) x * (i + 1); // x부터 시작해 x씩 증가하는 숫자를 계산
        }

        return arr;
    }
}
