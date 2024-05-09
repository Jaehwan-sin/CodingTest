package org.test.day0_10;

import java.util.*;

public class day4 {
    //  머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다.
    //  피자를 나눠먹을 사람의 수 n이 주어질 때,
    //  모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
    public int solution(int n) {
        int answer = 0;

        if (n >= 1 && n <= 100) {
            if (n % 7 == 0) {
                answer = n / 7;
            }
            else {
                answer = n / 7 + 1;
            }
        }
        return answer;
    }

    //    머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다.
    //    피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때,
    //    n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면
    //    최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
    public int solution2(int n) {
        int answer = 0;
        for (int i = 1; i <= 6 * n; i++) {
            if (6 * i % n == 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    // 머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다.
    // 피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때,
    // n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
    public int solution4 (int slice, int n) {

        if (n % slice == 0) {
            return n / slice;
        } else
            return n / slice + 1;
    }

    // 정수 배열 numbers가 매개변수로 주어집니다.
    // numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
    public double solution(int[] numbers) {
        OptionalDouble average = Arrays.stream(numbers).average();
        return average.orElse(0.0);
    }
}
