package org.test.basic_day11_20;

public class day16 {

    // 알파벳으로 이루어진 문자열 myString이 주어집니다.
    // 모든 알파벳을 대문자로 변환하여 return 하는 solution 함수를 완성해 주세요.
    public String solution(String myString) {
        return myString.toUpperCase();
    }

    // 알파벳으로 이루어진 문자열 myString이 주어집니다.
    // 모든 알파벳을 소문자로 변환하여 return 하는 solution 함수를 완성해 주세요.
    public String solution2 (String myString) {
        return myString.toLowerCase();
    }

    // 문자열 배열 strArr가 주어집니다.
    // 모든 원소가 알파벳으로만 이루어져 있을 때,
    // 배열에서 홀수번째 인덱스의 문자열은 모든 문자를 대문자로,
    // 짝수번째 인덱스의 문자열은 모든 문자를 소문자로 바꿔서 반환하는 solution 함수를 완성해 주세요.
    public String[] solution (String[] strArr) {
        String[] answer = new String[strArr.length];

        for(int i=0; i<strArr.length; i++){
            if(i%2==0){
                answer[i] = strArr[i].toLowerCase();
            }else{
                answer[i] = strArr[i].toUpperCase();
            }
        }

        return answer;
    }

    // 문자열 myString이 주어집니다.
    // myString에서 알파벳 "a"가 등장하면 전부 "A"로 변환하고,
    // "A"가 아닌 모든 대문자 알파벳은 소문자 알파벳으로 변환하여 return 하는 solution 함수를 완성하세요.
    public String solution4 (String myString) {
        myString = myString.toLowerCase();
        myString = myString.replaceAll("a", "A");
        return myString;
    }

    // 영소문자로 이루어진 문자열 my_string과 영소문자 1글자로 이루어진 문자열 alp가 매개변수로 주어질 때,
    // my_string에서 alp에 해당하는 모든 글자를 대문자로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
    public String solution5 (String my_string, String alp) {
        String answer = my_string.replace(alp, alp.toUpperCase());
        return answer;
    }
}
