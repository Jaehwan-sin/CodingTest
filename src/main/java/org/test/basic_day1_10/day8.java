package org.test.basic_day1_10;

import java.util.HashMap;
import java.util.Map;

public class day8 {

    // boolean 변수 x1, x2, x3, x4가 매개변수로 주어질 때, 다음의 식의 true/false를 return 하는 solution 함수를 작성해 주세요.
    // (x1 ∨ x2) ∧ (x3 ∨ x4)
    // 입출력 예
    //  x1	x2	x3	x4	result
    //  false	true	true	true	true
    //  true	false	false	false	false
    public boolean solution (boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean result = (x1 || x2) && (x3 || x4);
        return result;
    }

    // 1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
    // 네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
    // 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
    // 주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
    // 어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
    // 네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
    // 네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        // 각 숫자의 빈도를 계산하여 맵에 저장
        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);

        // 모든 숫자가 동일한 경우
        if (map.size() == 1) return a * 1111;

        // 두 종류의 숫자로 이루어진 경우
        if (map.size() == 2) {
            if (map.containsValue(3)) {
                // 한 숫자가 세 번, 다른 숫자가 한 번 나오는 경우
                for (Map.Entry<Integer, Integer> el : map.entrySet())
                    answer += el.getKey() * (el.getValue() == 3 ? 10 : 1);
                return answer * answer;
            }
            // 두 숫자가 각각 두 번 나오는 경우
            int x = (a + b + c + d - 2 * a) / 2;
            return (a + x) * Math.abs(a - x);
        }

        // 세 종류의 숫자로 이루어진 경우
        if (map.size() == 3) {
            answer = 1;
            for (Map.Entry<Integer, Integer> el : map.entrySet())
                if (el.getValue() != 2) answer *= el.getKey();
            return answer;
        }

        // 네 숫자가 모두 다른 경우
        return Math.min(Math.min(a, b), Math.min(c, d));
    }
}
