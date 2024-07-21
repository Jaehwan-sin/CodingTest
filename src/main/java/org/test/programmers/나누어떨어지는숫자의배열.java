package org.test.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 나누어떨어지는숫자의배열 {

    // 문제 - 나누어 떨어지는 숫자 배열

    // array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
    // divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
    public int[] solution(int[] arr, int divisor) {
        List<Integer> resultList = new ArrayList<>();

        // arr 배열에 담긴 값 중 divisior로 나누어 떨어지는 걸 resultList에 추가
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                resultList.add(arr[i]);
            }
        }

        // 비어있다면 -1 리턴
        if (resultList.isEmpty()) {
            return new int[] {-1};
        }

        // resultList를 배열로 변환 후 오름차순 후 리턴
        int[] resultArray = resultList.stream().mapToInt(i -> i).toArray();
        Arrays.sort(resultArray);
        return resultArray;
    }
}
