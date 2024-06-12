package org.test.basic_day11_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class day12 {

    // 정수 n과 정수 3개가 담긴 리스트 slicer 그리고 정수 여러 개가 담긴 리스트 num_list가 주어집니다. slicer에 담긴 정수를 차례대로 a, b, c라고 할 때, n에 따라 다음과 같이 num_list를 슬라이싱 하려고 합니다.
    // n = 1 : num_list의 0번 인덱스부터 b번 인덱스까지
    // n = 2 : num_list의 a번 인덱스부터 마지막 인덱스까지
    // n = 3 : num_list의 a번 인덱스부터 b번 인덱스까지
    // n = 4 : num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로
    // 올바르게 슬라이싱한 리스트를 return하도록 solution 함수를 완성해주세요.
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        List<Integer> result = new ArrayList<>();

        if (n == 1) {
            for (int i = 0; i <= b; i++) {
                result.add(num_list[i]);
            }
        } else if (n == 2) {
            for (int i = a; i < num_list.length; i++) {
                result.add(num_list[i]);
            }
        } else if (n == 3) {
            for (int i = a; i <= b; i++) {
                result.add(num_list[i]);
            }
        } else {
            for (int i = a; i <= b; i += c) {
                result.add(num_list[i]);
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }

    // 정수 리스트 num_list가 주어질 때,
    // 첫 번째로 나오는 음수의 인덱스를 return하도록 solution 함수를 완성해주세요.
    // 음수가 없다면 -1을 return합니다.
    public int solution2 (int[] num_list) {
        int answer = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                answer = i;
                break;
            } else {
                answer = -1;
            }
        }

        return answer;
    }

    // 정수 배열 arr와 2개의 구간이 담긴 배열 intervals가 주어집니다.
    // intervals는 항상 [[a1, b1], [a2, b2]]의 꼴로 주어지며 각 구간은 닫힌 구간입니다.
    // 닫힌 구간은 양 끝값과 그 사이의 값을 모두 포함하는 구간을 의미합니다.
    // 이때 배열 arr의 첫 번째 구간에 해당하는 배열과 두 번째 구간에 해당하는 배열을
    // 앞뒤로 붙여 새로운 배열을 만들어 return 하는 solution 함수를 완성해 주세요.
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> list = new ArrayList<>();

        int a1 = intervals[0][0];
        int b1 = intervals[0][1];
        int a2 = intervals[1][0];
        int b2 = intervals[1][1];

        for (int i = a1; i <= b1; i++) {
            list.add(arr[i]);
        }

        for (int i = a2; i <= b2 ; i++) {
            list.add(arr[i]);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    // 정수 배열 arr가 주어집니다.
    // 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 return 하는 solution 함수를 완성해 주세요.
    // 단, arr에 2가 없는 경우 [-1]을 return 합니다.
    public int[] solution(int[] arr) {
        // 초기값으로 배열의 길이보다 큰 값을 가진 변수를 설정
        int firstIndex = 100000, lastIndex = 0;

        // 배열을 순회하면서 숫자 2가 나타나는 첫 인덱스와 마지막 인덱스를 찾음
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                firstIndex = Math.min(firstIndex, i);
                lastIndex = Math.max(lastIndex, i);
            }
        }
        // 만약 숫자 2가 배열 안에 존재한다면 해당 부분 배열을 반환
        if (firstIndex <= lastIndex) {
            return Arrays.copyOfRange(arr, firstIndex, lastIndex + 1);
        } else {    //  그렇지 않다면 {-1}을 반환
            return new int[]{-1};
        }
    }

    // 정수 배열 arr와 query가 주어집니다.
    // query를 순회하면서 다음 작업을 반복합니다.
    // 짝수 인덱스에서는 arr에서 query[i]번 인덱스를 제외하고 배열의 query[i]번 인덱스 뒷부분을 잘라서 버립니다.
    // 홀수 인덱스에서는 arr에서 query[i]번 인덱스는 제외하고 배열의 query[i]번 인덱스 앞부분을 잘라서 버립니다.
    // 위 작업을 마친 후 남은 arr의 부분 배열을 return 하는 solution 함수를 완성해 주세요.
    public int[] solution(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length;

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                // 짝수 인덱스: arr에서 query[i] 번 인덱스를 제외하고 그 뒤의 부분을 자름
                end = start + query[i] + 1;
            } else {
                // 홀수 인덱스: arr에서 query[i] 번 인덱스를 제외하고 그 앞의 부분을 자름
                start = start + query[i];
            }
        }

        // 부분 배열 생성
        int[] answer = Arrays.copyOfRange(arr, start, end);

        return answer;
    }
}
