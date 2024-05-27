package org.test.day11_20;

import java.util.Arrays;

public class day11 {

    // 머쓱이는 직육면체 모양의 상자를 하나 가지고 있는데 이 상자에 정육면체 모양의 주사위를 최대한 많이 채우고 싶습니다.
    // 상자의 가로, 세로, 높이가 저장되어있는 배열 box와 주사위 모서리의 길이 정수 n이 매개변수로 주어졌을 때,
    // 상자에 들어갈 수 있는 주사위의 최대 개수를 return 하도록 solution 함수를 완성해주세요.
    public int solution (int[] box, int n) {
        return (box[0] / n) * (box[1] / n) * (box[2] / n);
    }

    // 약수의 개수가 세 개 이상인 수를 합성수라고 합니다.
    // 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.
    public static int solution2 (int n) {

        int answer = 0;

        for (int i = 0; i <= n; i++) {
            int count = 0; // 약수의 개수 count, 각 수마다 count 초기화
            for (int j = 1; j <= i; j++) {
                count += (i % j == 0) ? 1 : 0; // 나누어 떨어지면 약수니까 count + 1
            }
            answer += (count >= 3) ? 1 : 0; // 약수의 개수가 3개 이상이면 합성수니까 answer + 1
        }
        return answer;

    }

    // 정수 배열 numbers가 매개변수로 주어집니다.
    // numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
    public int solution3 (int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }

    // i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다.
    // 예를들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다. 정수 n이 주어질 때 다음 조건을 만족하는 가장 큰 정수 i를 return 하도록 solution 함수를 완성해주세요.
    // i! ≤ n
    public int solution4 (int n) {
        int answer = 0;
        for (int i = 1; i <= 10; i++) {
            if (n >= factorial(i)) {
                answer = i;
            } else {
                break;
            }
        }
        return answer;
    }

    public static int factorial(int number) {
        if (number > 1) return number * factorial(number - 1);
        return number;
    }
}
