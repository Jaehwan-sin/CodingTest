package org.test.programmers;

import java.util.HashMap;
import java.util.HashSet;

public class 완주하지못한선수 {

    // 문제 - 완주하지 못한 선수

    // 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
    // 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
    // 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
    // 제한사항
    // 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
    // completion의 길이는 participant의 길이보다 1 작습니다.
    // 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
    // 참가자 중에는 동명이인이 있을 수 있습니다.
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> result = new HashMap<>(); // 결과

        // 모든 참가자를 맵에 추가하고 카운트
        for (String name : participant) {
            result.put(name, result.getOrDefault(name, 0) + 1);
        }

        // 완주자를 맵에서 찾아 카운트 감소
        for (String name : completion) {
            result.put(name, result.get(name) - 1);
        }

        // 카운트가 1인 참가자가 완주하지 못한 선수
        for (String name : participant) {
            if (result.get(name) == 1) {
                return name;
            }
        }

        return " ";
    }
}
