package org.test.basic_day11_20;

import java.util.*;

public class day20 {

    // 정수 배열 arr이 매개변수로 주어집니다.
    // arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가하려고 합니다.
    // arr에 최소한의 개수로 0을 추가한 배열을 return 하는 solution 함수를 작성해 주세요.
    public int[] solution(int[] arr) {
        int length = arr.length;
        // 배열의 길이가 2의 거듭 제곱인지 확인
        boolean isPowerOfTwo = (length > 0) && ((length & (length - 1)) == 0);

        // 배열의 길이가 2의 거듭 제곱이 될 때까지 while문으로 0을 추가
        while (!isPowerOfTwo) {
            arr = Arrays.copyOf(arr, length + 1);
            arr[length] = 0;
            length = arr.length;
            isPowerOfTwo = (length & (length - 1)) == 0;
        }

        return arr;
    }

    // 이 문제에서 두 정수 배열의 대소관계를 다음과 같이 정의합니다.
    // 두 배열의 길이가 다르다면, 배열의 길이가 긴 쪽이 더 큽니다.
    // 배열의 길이가 같다면 각 배열에 있는 모든 원소의 합을 비교하여 다르다면 더 큰 쪽이 크고, 같다면 같습니다.
    // 두 정수 배열 arr1과 arr2가 주어질 때,
    // 위에서 정의한 배열의 대소관계에 대하여
    // arr2가 크다면 -1, arr1이 크다면 1, 두 배열이 같다면 0을 return 하는 solution 함수를 작성해 주세요.
    public int solution(int[] arr1, int[] arr2) {
        int sum1 = 0; // arr1의 원소들의 합을 저장할 변수
        int sum2 = 0; // arr2의 원소들의 합을 저장할 변수

        // arr1의 원소들의 합 계산
        for (int num : arr1) {
            sum1 += num;
        }

        // arr2의 원소들의 합 계산
        for (int num : arr2) {
            sum2 += num;
        }

        // 대소관계 비교
        if (arr1.length > arr2.length || (arr1.length == arr2.length && sum1 > sum2)) {
            return 1;
        } else if (arr1.length < arr2.length || (arr1.length == arr2.length && sum1 < sum2)) {
            return -1;
        } else {
            return 0;
        }
    }

    // 문자열 배열 strArr이 주어집니다.
    // strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.
    public int solution(String[] strArr) {
        Map<Integer, Integer> groupCounts = new HashMap<>(); // 각 그룹의 개수를 저장할 맵

        // 문자열 배열의 원소들을 그룹으로 묶고, 그룹별 개수를 계산
        for (String str : strArr) {
            int length = str.length();
            groupCounts.put(length, groupCounts.getOrDefault(length, 0) + 1);
        }

        int maxCount = 0; // 가장 개수가 많은 그룹의 크기

        // 가장 개수가 많은 그룹의 크기 찾기
        for (int count : groupCounts.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        return maxCount;
    }

    // 정수 배열 arr과 정수 n이 매개변수로 주어집니다.
    // arr의 길이가 홀수라면 arr의 모든 짝수 인덱스 위치에 n을 더한 배열을,
    // arr의 길이가 짝수라면 arr의 모든 홀수 인덱스 위치에 n을 더한 배열을 return 하는 solution 함수를 작성해 주세요.
    public int[] solution4 (int[] arr, int n) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr.length % 2 != 0) {  // 배열의 길이가 홀수인 경우
                if (i % 2 == 0) {  // 짝수 인덱스에 n 더하기
                    answer[i] = arr[i] + n;
                } else {
                    answer[i] = arr[i];
                }
            } else {  // 배열의 길이가 짝수인 경우
                if (i % 2 != 0) {  // 홀수 인덱스에 n 더하기
                    answer[i] = arr[i] + n;
                } else {
                    answer[i] = arr[i];
                }
            }
        }

        return answer;
    }

    // 다른 풀이
    public int[] solution4_1  (int[] arr, int n) {
        for (int i = arr.length - 1; i >= 0; i -= 2) {
            arr[i] += n;
        }
        return arr;
    }

    // 정수로 이루어진 리스트 num_list가 주어집니다.
    // num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
    public int[] solution5 (int[] num_list) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(num_list); // 배열 정렬

        // 배열의 인덱스 0번부터 4번까지 list에 추가
        for (int i = 0; i <= 4; i++) {
            list.add(num_list[i]);
        }

        // list에 담긴 값 배열에 추가 후 리턴
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    // 다른 풀이
    public int[] solution5_1 (int[] num_list) {
        Arrays.sort(num_list); // 배열 정렬

        // 배열을 복사(배열, 0번째부터, 5번째까지)
        return Arrays.copyOfRange(num_list, 0, 5);
    }
}
