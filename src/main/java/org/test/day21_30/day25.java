package org.test.day21_30;

public class day25 {

    // 문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다.
    // 이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때,
    // A를 밀어서 B가 될 수 있다면 밀어야 하는 최소 횟수를 return하고 밀어서 B가 될 수 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
    public int solution(String A, String B) {
        if (A.equals(B)) {
            return 0;
        }

        // 문자열 길이를 확인
        int length = A.length();

        // A를 한 칸씩 밀면서 B와 비교
        for (int i = 1; i < length; i++) {
            A = A.charAt(length - 1) + A.substring(0, length - 1);  // 문자열을 오른쪽으로 한 칸 밀기
            if (A.equals(B)) {
                return i;
            }
        }

        // 모든 경우를 다 확인했는데도 B와 일치하지 않으면 -1을 반환
        return -1;
    }

    // 다른 풀이
    public int solution1_1 (String A, String B) {
        String tempB = B.repeat(3);  // B를 세 번 반복하여 새로운 문자열 생성
        return tempB.indexOf(A);  // 반복된 문자열에서 A의 시작 인덱스를 반환
    }

    // 머쓱이는 큰 종이를 1 x 1 크기로 자르려고 합니다.
    // 예를 들어 2 x 2 크기의 종이를 1 x 1 크기로 자르려면 최소 가위질 세 번이 필요합니다.
    // 정수 M, N이 매개변수로 주어질 때,
    // M x N 크기의 종이를 최소로 가위질 해야하는 횟수를 return 하도록 solution 함수를 완성해보세요.
    public int solution2 (int M, int N) {
        return M * N - 1;
    }

    // 연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다.
    // 두 정수 num과 total이 주어집니다.
    // 연속된 수 num개를 더한 값이 total이 될 때,
    // 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.
    public int[] solution3 (int num, int total) {
        int[] answer = new int[num];

        int x = (2 * total / num - (num - 1)) / 2;
        System.out.println("x = " + x);

        for (int i = 0; i < num; i++) {
            answer[i] = x + i;
        }

        return answer;
    }

    // 등차수열 혹은 등비수열 common이 매개변수로 주어질 때,
    // 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
    public int solution4 (int[] common) {
        int answer = 0;

        int x = common[1] - common[0];
        int y = common[2] - common[1];

        if (x == y) {
            answer = common[common.length - 1] + y;
        } else {
            answer = common[common.length - 1] * common[2] / common[1];
        }

        return answer;
    }
}
