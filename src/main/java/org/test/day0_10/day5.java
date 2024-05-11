package org.test.day0_10;

import java.util.ArrayList;

public class day5 {
    public String solution(String rsp) {
        String answer = "";
        String[] arr = rsp.split("");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("2")) {
                answer += "0";
            } else if (arr[i].equals("0")) {
                answer += "5";
            } else {
                answer += "2";
            }
        }

        return answer;
    }

    public String solution2 (String my_string) {
        String answer = "";
        String[] arr = my_string.split("");
        System.out.println("arr" + arr);



        return answer;
    }
}
