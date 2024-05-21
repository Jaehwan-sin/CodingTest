package org.test.day10_20;

import java.util.*;

public class day15 {

    // 영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
    // 문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.
    public long solution(String numbers) {
        String[] matchNumbers = {
                "zero", "one", "two"
                , "three", "four", "five"
                , "six", "seven", "eight", "nine"};

        for (int i = 0; i < matchNumbers.length; i++) {
            numbers = numbers.replaceAll(matchNumbers[i], String.valueOf(i));
        }
        return Long.parseLong(numbers);
    }

    // 다른 풀이
    public long solution1 (String numbers) {
        return Long.parseLong(
                numbers.replaceAll("zero", "0")
                        .replaceAll("one", "1")
                        .replaceAll("two", "2")
                        .replaceAll("three", "3")
                        .replaceAll("four", "4")
                        .replaceAll("five", "5")
                        .replaceAll("six", "6")
                        .replaceAll("seven", "7")
                        .replaceAll("eight", "8")
                        .replaceAll("nine", "9")
        );
    }

    // 문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때,
    // my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
    public String solution2 (String my_string, int num1, int num2) {
        String answer = "";

        char[] charArray = my_string.toCharArray();

        // num1과 num2 위치의 문자 교환
        char temp = charArray[num1];
        charArray[num1] = charArray[num2];
        charArray[num2] = temp;

        // 문자 배열을 문자열로 변환
        String result = new String(charArray);

        return result;
    }

    // 문자열 s가 매개변수로 주어집니다.
    // s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
    // 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
    public String solution3 (String s) {
        // 1. 각 문자의 등장 횟수를 센다.
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // 2. 한 번만 등장하는 문자를 필터링한다.
        ArrayList<Character> uniqueChars = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueChars.add(entry.getKey());
            }
        }

        // 3. 필터링된 문자를 사전 순으로 정렬한다.
        Collections.sort(uniqueChars);

        // 4. 정렬된 문자를 결합하여 반환한다.
        StringBuilder result = new StringBuilder();
        for (char c : uniqueChars) {
            result.append(c);
        }

        return result.toString();
    }

    // 정수 n이 매개변수로 주어질 때,
    // n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
    public int[] solution(int n) {
        // 1. n에 대한 약수는 n에 따라 달라지기 때문에 가변적인 담아줄 ArrayList를 생성한다.
        ArrayList<Integer> answer = new ArrayList<>();

        // 2. n의 나머지가 0이면 약수니까 그 조건으로 나눈 값을 ArrayList에 담아준다.
        for (int i = 1; i <= n ; i++) {
            if (n % i == 0) {
                answer.add(i);
            }
        }

        // 3. int[] 타입으로 return 해줘야해서 ArrayList -> [] 로 담아준다.
        int[] num = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            num[i] = answer.get(i);
        }

        return num;
    }
}
