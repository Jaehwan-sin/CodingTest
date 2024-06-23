package org.test.basic_day21_25;

public class day23 {

    // 어떤 문자열 A가 다른 문자열 B안에 속하면 A를 B의 부분 문자열이라고 합니다. 예를 들어 문자열 "abc"는 문자열 "aabcc"의 부분 문자열입니다.
    // 문자열 str1과 str2가 주어질 때, str1이 str2의 부분 문자열이라면 1을 부분 문자열이 아니라면 0을 return하도록 solution 함수를 완성해주세요.
    public int solution(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
    }

    // 문자열들이 담긴 리스트가 주어졌을 때, 모든 문자열들을 순서대로 합친 문자열을 꼬리 문자열이라고 합니다.
    // 꼬리 문자열을 만들 때 특정 문자열을 포함한 문자열은 제외시키려고 합니다.
    // 예를 들어 문자열 리스트 ["abc", "def", "ghi"]가 있고 문자열 "ef"를 포함한 문자열은 제외하고 꼬리 문자열을 만들면 "abcghi"가 됩니다.
    // 문자열 리스트 str_list와 제외하려는 문자열 ex가 주어질 때, str_list에서 ex를 포함한 문자열을 제외하고 만든 꼬리 문자열을 return하도록 solution 함수를 완성해주세요.
    public String solution(String[] str_list, String ex) {
        String answer = "";

        for (int i = 0; i < str_list.length; i++) {
            if (!str_list[i].contains(ex)) {
                answer += str_list[i];
            }
        }

        return answer;
    }

    // 정수 리스트 num_list와 찾으려는 정수 n이 주어질 때,
    // num_list안에 n이 있으면 1을 없으면 0을 return하도록 solution 함수를 완성해주세요.
    public int solution(int[] num_list, int n) {
        int answer = 0;

        for(int i = 0; i < num_list.length; i++){
            if (num_list[i] == n){
                answer = 1;
            }
        }

        return answer;
    }

    // 1부터 6까지 숫자가 적힌 주사위가 두 개 있습니다. 두 주사위를 굴렸을 때 나온 숫자를 각각 a, b라고 했을 때 얻는 점수는 다음과 같습니다.
    // a와 b가 모두 홀수라면 a2 + b2 점을 얻습니다.
    // a와 b 중 하나만 홀수라면 2 × (a + b) 점을 얻습니다.
    // a와 b 모두 홀수가 아니라면 |a - b| 점을 얻습니다.
    // 두 정수 a와 b가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
    public int solution(int a, int b) {
        int answer = 0;

        if (a % 2 == 1 && b % 2 == 1){
            answer = a * a + b * b;
        }
        else if (a % 2 == 1 || b % 2 == 1){
            answer = 2 * (a + b);
        }
        else answer = Math.abs(a-b);

        return answer;
    }

    // 정수 배열 date1과 date2가 주어집니다.
    // 두 배열은 각각 날짜를 나타내며 [year, month, day] 꼴로 주어집니다.
    // 각 배열에서 year는 연도를, month는 월을, day는 날짜를 나타냅니다.
    // 만약 date1이 date2보다 앞서는 날짜라면 1을, 아니면 0을 return 하는 solution 함수를 완성해 주세요.
    public int solution(int[] date1, int[] date2) {
        int answer = 0;

        for (int i = 0; i < date1.length; i++) {
            if (date1[i] < date2[i]) {
                answer = 1;
                break;
            } else if (date1[i] > date2[i]) {
                answer = 0;
                break;
            }
        }

        return answer;
    }
}
