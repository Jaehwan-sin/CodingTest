package org.test.day0_10;

import java.util.*;

public class day3 {
    // 정수 num1, num2가 매개변수로 주어질 때,
    // num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.
    public int solution (int num1, int num2) {
        int answer = num1%num2;
        return answer;
    }

    // 중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
    // 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.
    public int solution2 (int [] array) {
        int answer = 0;

        Arrays.sort(array);
        answer = array[array.length / 2];

        return answer;
    }

    // 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
    // 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요.
    // 최빈값이 여러 개면 -1을 return 합니다.
    public int solution3 (int[] array) {
        int maxCount = 0;
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();

        // getOrDefault : 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드
        // getPrDefault(Object key, V DefaultValue)
        // 매개변수 : 이 메서드는 두개의 매개변수를 허용
        // key : 값을 가져와야 하는 요소의 키
        // defaultValue : 지정된 키로 매핑된 값이 없는 경우 반환되어야 하는 기본값
        // 반환값 : 찾는 key가 존재하면 해당 key에 매핑되어 있는 값을 반환하고, 그렇지 않으면 디폴트 값이 반환

        for(int number : array) {
            int count = map.getOrDefault(number, 0) + 1;

            if(count > maxCount) {
                maxCount = count;
                answer = number;
            }

            else if(count == maxCount) {
                answer = -1;
            }

            map.put(number, count);
        }

        return answer;
    }

    // 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
    public int[] solution4(int n) {
        List<Integer> oddNumbers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                oddNumbers.add(i);
            }
        }

        // List를 int[] 배열로 변환
        int[] result = new int[oddNumbers.size()];
        for (int i = 0; i < oddNumbers.size(); i++) {
            result[i] = oddNumbers.get(i);
        }

        return result;
    }
}
