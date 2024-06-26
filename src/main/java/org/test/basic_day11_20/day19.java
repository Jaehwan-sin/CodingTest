package org.test.basic_day11_20;

import java.util.*;

public class day19 {

    // 임의의 문자열이 주어졌을 때 문자 "a", "b", "c"를 구분자로 사용해 문자열을 나누고자 합니다.
    // 예를 들어 주어진 문자열이 "baconlettucetomato"라면 나눠진 문자열 목록은 ["onlettu", "etom", "to"] 가 됩니다.
    // 문자열 myStr이 주어졌을 때 위 예시와 같이 "a", "b", "c"를 사용해 나눠진 문자열을 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
    // 단, 두 구분자 사이에 다른 문자가 없을 경우에는 아무것도 저장하지 않으며, return할 배열이 빈 배열이라면 ["EMPTY"]를 return 합니다.
    public String[] solution(String myStr) {
        List<String> answer = new ArrayList<>();
        
        myStr = myStr.replace("a"," ");
        myStr = myStr.replace("b"," ");
        myStr = myStr.replace("c"," ");
        String[] list = myStr.split(" ");
        
        for (String i : list)
            if (!i.equals(""))
                answer.add(i);
        
        if (answer.size()==0) answer.add("EMPTY");
        
        return answer.toArray(new String[0]);
    }

    // 아무 원소도 들어있지 않은 빈 배열 X가 있습니다. 
    // 양의 정수 배열 arr가 매개변수로 주어질 때,
    // arr의 앞에서부터 차례대로 원소를 보면서 원소가 a라면 X의 맨 뒤에 a를 a번 추가하는 일을 반복한 뒤의 배열 X를 return 하는 solution 함수를 작성해 주세요.
    public int[] solution2 (int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr) {
            for (int i = 0; i < num; i++) {
                list.add(num);
            }
        }
        
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    // 아무 원소도 들어있지 않은 빈 배열 X가 있습니다. 
    // 길이가 같은 정수 배열 arr과 boolean 배열 flag가 매개변수로 주어질 때, 
    // flag를 차례대로 순회하며 flag[i]가 true라면 X의 뒤에 arr[i]를 arr[i] × 2 번 추가하고, 
    // flag[i]가 false라면 X에서 마지막 arr[i]개의 원소를 제거한 뒤 X를 return 하는 solution 함수를 작성해 주세요.
    public int[] solution3 (int[] arr, boolean[] flag) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    list.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    if (!list.isEmpty()) {
                        list.remove(list.size() -1);
                    }
                }
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    // 0과 1로만 이루어진 정수 배열 arr가 주어집니다. arr를 이용해 새로운 배열 stk을 만드려고 합니다.
    // i의 초기값을 0으로 설정하고 i가 arr의 길이보다 작으면 다음을 반복합니다.
    // 만약 stk이 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다.
    // stk에 원소가 있고, stk의 마지막 원소가 arr[i]와 같으면 stk의 마지막 원소를 stk에서 제거하고 i에 1을 더합니다.
    // stk에 원소가 있는데 stk의 마지막 원소가 arr[i]와 다르면 stk의 맨 마지막에 arr[i]를 추가하고 i에 1을 더합니다.
    // 위 작업을 마친 후 만들어진 stk을 return 하는 solution 함수를 완성해 주세요.
    // 단, 만약 빈 배열을 return 해야한다면 [-1]을 return 합니다.
    public int[] solution4 (int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (list.isEmpty()) {
                list.add(arr[i]);
            } else if (list.get(list.size() -1) == arr[i]) {
                list.remove(list.size() -1);
            } else {
                list.add(arr[i]);
            }
        }

        if (list.isEmpty()) {
            list.add(-1);
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    // 랜덤으로 서로 다른 k개의 수를 저장한 배열을 만드려고 합니다. 
    // 적절한 방법이 떠오르지 않기 때문에 일정한 범위 내에서 무작위로 수를 뽑은 후, 지금까지 나온적이 없는 수이면 배열 맨 뒤에 추가하는 방식으로 만들기로 합니다.
    // 이미 어떤 수가 무작위로 주어질지 알고 있다고 가정하고, 실제 만들어질 길이 k의 배열을 예상해봅시다.
    // 정수 배열 arr가 주어집니다. 문제에서의 무작위의 수는 arr에 저장된 순서대로 주어질 예정이라고 했을 때, 완성될 배열을 return 하는 solution 함수를 완성해 주세요.
    // 단, 완성될 배열의 길이가 k보다 작으면 나머지 값을 전부 -1로 채워서 return 합니다.
    public int[] solution5 (int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        int[] answer=new int[k];
        
        int count=0;
        for(int i=0; i<arr.length; i++) {
            if(!set.contains(arr[i])) {
                set.add(arr[i]);
                answer[count]=arr[i];
                count++;
            }
            if(count==k) {
                break;
            }
        }
        for(int i=count; i<k; i++) {
            answer[i]=-1;
        }
        return answer;
    }
}
