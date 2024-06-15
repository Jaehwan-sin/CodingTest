package org.test.basic_day11_20;

import java.util.Arrays;

public class day15 {

    // 정수 배열 arr가 주어집니다.
    // arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고,
    // 50보다 작은 홀수라면 2를 곱합니다.
    // 그 결과인 정수 배열을 return 하는 solution 함수를 완성해 주세요.
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) { // 50보다 크거나 같은 짝수
                answer[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 != 0) { // 50보다 작은 홀수
                answer[i] = arr[i] * 2;
            } else { // 나머지 경우
                answer[i] = arr[i];
            }
        }

        return answer;
    }

    // 정수 배열 arr가 주어집니다. arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고,
    // 50보다 작은 홀수라면 2를 곱하고 다시 1을 더합니다.
    // 이러한 작업을 x번 반복한 결과인 배열을 arr(x)라고 표현했을 때,
    // arr(x) = arr(x + 1)인 x가 항상 존재합니다.
    // 이러한 x 중 가장 작은 값을 return 하는 solution 함수를 완성해 주세요.
    // 단, 두 배열에 대한 "="는 두 배열의 크기가 서로 같으며, 같은 인덱스의 원소가 각각 서로 같음을 의미합니다.
    public int solution2 (int[] arr) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        int count = 0;

        while (true) {

            for(int i=0; i<arr.length; i++){
                if(arr[i]>=50 && arr[i]%2==0){
                    arr[i] /= 2;
                }else if(arr[i]<50 && arr[i]%2!=0){
                    arr[i] = arr[i] * 2 + 1;
                }
            }

            if (Arrays.equals(arr, answer)) {
                break;
            }
            answer = Arrays.copyOf(arr, arr.length);

            count++;
        }
        return count;
    }

    // 정수가 있을 때, 짝수라면 반으로 나누고,
    // 홀수라면 1을 뺀 뒤 반으로 나누면, 마지막엔 1이 됩니다.
    // 예를 들어 10이 있다면 다음과 같은 과정으로 1이 됩니다.
    // 10 / 2 = 5
    // (5 - 1) / 2 = 2
    // 2 / 2 = 1
    // 위와 같이 3번의 나누기 연산으로 1이 되었습니다.
    // 정수들이 담긴 리스트 num_list가 주어질 때,
    // num_list의 모든 원소를 1로 만들기 위해서 필요한 나누기 연산의 횟수를 return하도록 solution 함수를 완성해주세요.
    public int solution3 (int[] num_list) {
        int count = 0;

        for (int i = 0; i < num_list.length; i++) {
            while (num_list[i] > 1) {  // 각 숫자가 1보다 클 때만 반복
                if (num_list[i] % 2 == 0) {  // 짝수일 경우
                    num_list[i] /= 2;
                } else {  // 홀수일 경우
                    num_list[i] = (num_list[i] - 1) / 2;
                }
                count++;
            }
        }

        return count;
    }

    // 정수가 담긴 리스트 num_list가 주어질 때,
    // 리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을 10 이하이면 모든 원소의 곱을 return하도록 solution 함수를 완성해주세요.

    // 알파벳으로 이루어진 문자열 myString과 pat이 주어집니다.
    // myString의 연속된 부분 문자열 중 pat이 존재하면 1을 그렇지 않으면 0을 return 하는 solution 함수를 완성해 주세요.
    // 단, 알파벳 대문자와 소문자는 구분하지 않습니다.
}
