package org.test.programmers.greedy;

public class JoyStick {

    // 문제 - 조이스틱

    // 조이스틱으로 알파벳 이름을 완성하세요. 맨 처음엔 A로만 이루어져 있습니다.
    // ex) 완성해야 하는 이름이 세 글자면 AAA, 네 글자면 AAAA
    // 조이스틱을 각 방향으로 움직이면 아래와 같습니다.
    //▲ - 다음 알파벳
    //▼ - 이전 알파벳 (A에서 아래쪽으로 이동하면 Z로) 
    //◀ - 커서를 왼쪽으로 이동 (첫 번째 위치에서 왼쪽으로 이동하면 마지막 문자에 커서)
    //▶ - 커서를 오른쪽으로 이동 (마지막 위치에서 오른쪽으로 이동하면 첫 번째 문자에 커서)
    // 예를 들어 아래의 방법으로 "JAZ"를 만들 수 있습니다.
    // - 첫 번째 위치에서 조이스틱을 위로 9번 조작하여 J를 완성합니다.
    // - 조이스틱을 왼쪽으로 1번 조작하여 커서를 마지막 문자 위치로 이동시킵니다.
    // - 마지막 위치에서 조이스틱을 아래로 1번 조작하여 Z를 완성합니다.
    // 따라서 11번 이동시켜 "JAZ"를 만들 수 있고, 이때가 최소 이동입니다.
    // 만들고자 하는 이름 name이 매개변수로 주어질 때, 이름에 대해 조이스틱 조작 횟수의 최솟값을 return 하도록 solution 함수를 만드세요.
    public int solution(String name) {
        int answer = 0; // 조이스틱 조작 횟수
        int len = name.length();
        int move = name.length() - 1; // 기본 최소 좌우이동 횟수 (좌, 우 커서)

        // 해당 커서 알파벳 변경 최솟값 (위, 아래 커서)
        for (int i = 0; i < len; i++) {
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

            // 연속된 'A'가 끝나는 지점 찾기
            int next = i + 1;
            while(next < len && name.charAt(next) == 'A') {
                next++;
            }

            // 좌우이동 최소 횟수 구하기 (순서대로 가기 vs 뒤로 돌아가기)
            move = Math.min(move, (i * 2) + len - next);
            move = Math.min(move, (len - next) * 2 + i);
        }
        answer += move;

        return answer;
    }
}
