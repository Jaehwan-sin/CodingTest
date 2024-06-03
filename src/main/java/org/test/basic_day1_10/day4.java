package org.test.basic_day1_10;

public class day4 {

    // 정수 num과 n이 매개 변수로 주어질 때,
    // num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.
    public int solution (int num, int n) {
        int answer = 0;

        if (num % n == 0) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }

    // 정수 number와 n, m이 주어집니다.
    // number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.
    public int solution2 (int number, int n, int m) {
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }

    // 양의 정수 n이 매개변수로 주어질 때,
    // n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고
    // n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.
    public int solution3 (int n) {
        int answer = 0;

        if (n % 2 == 1) {
            for(int i=1; i<=n; i+=2){
                answer += i;
            }
        } else {
            for(int i=2; i<=n; i+=2){
                answer += i*i;
            }
        }

        return answer;
    }

    // 문자열에 따라 다음과 같이 두 수의 크기를 비교하려고 합니다.
    // 두 수가 n과 m이라면
    // ">", "=" : n >= m
    // "<", "=" : n <= m
    // ">", "!" : n > m
    // "<", "!" : n < m
    // 두 문자열 ineq와 eq가 주어집니다.
    // ineq는 "<"와 ">"중 하나고, eq는 "="와 "!"중 하나입니다.
    // 그리고 두 정수 n과 m이 주어질 때,
    // n과 m이 ineq와 eq의 조건에 맞으면 1을 아니면 0을 return하도록 solution 함수를 완성해주세요.
    public int solution4 (String ineq, String eq, int n, int m) {
        int answer = 0;

        if(ineq.equals(">")  && eq.equals("=") ) {
            answer = n >= m ? 1 : 0;
        } else if (ineq.equals("<") && eq.equals("=")) {
            answer = n <= m ? 1 : 0;
        } else if (ineq.equals(">") && eq.equals("!")) {
            answer = n > m ? 1 : 0;
        } else if (ineq.equals("<") && eq.equals("!")) {
            answer = n < m ? 1 : 0;
        }
 
        return answer;
    }
}
