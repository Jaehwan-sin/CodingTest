package org.test.day0_10;

import java.util.ArrayList;
import java.util.List;

public class day5 {

    // 머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
    // 구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
    public int solution(int price) {
        int answer = 0;

        if (price >= 500000) {
            answer = (int)(price * 0.8); // 20% 할인
        } else if (price >= 300000) {
            answer = (int)(price * 0.9); // 10% 할인
        } else if (price >= 100000) {
            answer = (int)(price * 0.95); // 5% 할인
        } else {
            answer = price; // 할인 없음
        }

        return answer;
    }

    // 머쓱이는 추운 날에도 아이스 아메리카노만 마십니다.
    // 아이스 아메리카노는 한잔에 5,500원입니다.
    // 머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때,
    // 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
    public int[] solution2 (int money) {
        List<Integer> answerList = new ArrayList<>();

        int count = money / 5500;
        int remainder = money % 5500;

        answerList.add(count);
        answerList.add(remainder);

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    // 머쓱이는 선생님이 몇 년도에 태어났는지 궁금해졌습니다.
    // 2022년 기준 선생님의 나이 age가 주어질 때,
    // 선생님의 출생 연도를 return 하는 solution 함수를 완성해주세요
    public int solution3 (int age) {
        int years = 2022;
        int answer = years - age + 1;
        return answer;
    }

    // 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
    // num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
    public int[] solution(int[] num_list) {
        int[] reversedArray = new int[num_list.length];

        for (int i = 0; i < num_list.length; i++) {
            reversedArray[i] = num_list[num_list.length - 1 - i];
        }

        return reversedArray;
    }
}
