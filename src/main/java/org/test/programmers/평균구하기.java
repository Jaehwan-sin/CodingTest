package org.test.programmers;

public class 평균구하기 {

    // 문제 - 평균 구하기

    // 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
    public double solution(int[] arr) {
        int sumarr = 0;

        for (int i = 0; i < arr.length; i++) {
            sumarr += arr[i];
        }

        double answer = (double) sumarr / arr.length;
        return answer;
    }
}
