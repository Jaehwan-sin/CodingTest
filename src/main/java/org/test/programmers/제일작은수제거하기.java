package org.test.programmers;

import java.util.ArrayList;
import java.util.Collections;

public class 제일작은수제거하기 {

    // 문제 - 제일 작은 수 제거하기

    // 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
    // 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
    // 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
    public int[] solution(int[] arr) {
        // 배열이 비어 있는 경우 -1을 반환
        if (arr.length == 0) {
            return new int[] {-1};
        }

        // 가장 작은 수 찾기
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // 가장 작은 수 제거
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                list.add(arr[i]);
            }
        }

        // 빈 배열인 경우 -1 반환
        if (list.size() == 0) {
            return new int[] {-1};
        }

        // ArrayList를 배열로 변환
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
