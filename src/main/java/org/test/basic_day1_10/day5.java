package org.test.basic_day1_10;

public class day5 {

    // 문자열 code가 주어집니다.
    // code를 앞에서부터 읽으면서 만약 문자가 "1"이면 mode를 바꿉니다. mode에 따라 code를 읽어가면서 문자열 ret을 만들어냅니다.
    // mode는 0과 1이 있으며, idx를 0 부터 code의 길이 - 1 까지 1씩 키워나가면서 code[idx]의 값에 따라 다음과 같이 행동합니다.
    // mode가 0일 때
    // code[idx]가 "1"이 아니면 idx가 짝수일 때만 ret의 맨 뒤에 code[idx]를 추가합니다.
    // code[idx]가 "1"이면 mode를 0에서 1로 바꿉니다.
    // mode가 1일 때
    // code[idx]가 "1"이 아니면 idx가 홀수일 때만 ret의 맨 뒤에 code[idx]를 추가합니다.
    // code[idx]가 "1"이면 mode를 1에서 0으로 바꿉니다.
    // 문자열 code를 통해 만들어진 문자열 ret를 return 하는 solution 함수를 완성해 주세요.
    // 단, 시작할 때 mode는 0이며, return 하려는 ret가 만약 빈 문자열이라면 대신 "EMPTY"를 return 합니다.
    public String solution (String code) {
        String answer = "";
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1' && mode == 0) {
                mode = 1;
            } else if (code.charAt(i) == '1' && mode == 1) {
                mode = 0;
            }

            if (mode == 0) {
                if (code.charAt(i) != '1' && i % 2 == 0) {
                    answer += code.charAt(i);
                } else if (mode == 1) {
                    if (code.charAt(i) != '1' && i % 2 != 0) {
                        answer += code.charAt(i);
                    }
                }
            }

            if (answer.isEmpty()) {
                return "EMPTY";
            }

        }
        return answer;

    }

    // 두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다.
    // 첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때,
    // 이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.
    public int solution2 (int a, int d, boolean[] included) {
        int answer = 0;

        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                answer += a + (i * d);
            }
        }

        return answer;
    }

    // 1부터 6까지 숫자가 적힌 주사위가 세 개 있습니다. 세 주사위를 굴렸을 때 나온 숫자를 각각 a, b, c라고 했을 때 얻는 점수는 다음과 같습니다.
    // 세 숫자가 모두 다르다면 a + b + c 점을 얻습니다.
    // 세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면 (a + b + c) × (a2 + b2 + c2 )점을 얻습니다.
    // 세 숫자가 모두 같다면 (a + b + c) × (a2 + b2 + c2 ) × (a3 + b3 + c3 )점을 얻습니다.
    // 세 정수 a, b, c가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
    public int solution3 (int a, int b, int c) {
        int answer = 0;

        if (a != b && a != c && b != c) {
            answer = a+b+c;
        } else if (a == b && a != c || a == c && a != b || b == c && a != c) {
            answer = (a + b + c) * (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        } else  {
            answer = (a + b + c) * (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        }

        return answer;
    }

    // 정수가 담긴 리스트 num_list가 주어질 때,
    // 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mul = 1;

        for(int i = 0; i<num_list.length;i++){
            sum+=num_list[i];
            mul*=num_list[i];
        }
        if(sum * sum > mul){
            answer = 1;
        }

        return answer;
    }
}
