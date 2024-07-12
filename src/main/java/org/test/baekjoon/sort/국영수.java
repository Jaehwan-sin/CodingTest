package org.test.baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 국영수 {

    // 문제 - 국영수

    // 도현이네 반 학생 N명의 이름과 국어, 영어, 수학 점수가 주어진다. 이때, 다음과 같은 조건으로 학생의 성적을 정렬하는 프로그램을 작성하시오.
    // 국어 점수가 감소하는 순서로
    // 국어 점수가 같으면 영어 점수가 증가하는 순서로
    // 국어 점수와 영어 점수가 같으면 수학 점수가 감소하는 순서로
    // 모든 점수가 같으면 이름이 사전 순으로 증가하는 순서로 (단, 아스키 코드에서 대문자는 소문자보다 작으므로 사전순으로 앞에 온다.)
    public class Main {

        // 학생 클래스 정의
        static class Student {
            String name;
            int kor;
            int eng;
            int math;

            // 생성자 정의
            public Student(String name, int kor, int eng, int math) {
                this.name = name;
                this.kor = kor;
                this.eng = eng;
                this.math = math;
            }
        }

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;

            // 학생 목록 저장할 List 생성, 학생 수 입력받을 n 생성
            ArrayList<Student> studentList = new ArrayList<>();
            int n = Integer.parseInt(br.readLine());

            // 입력된 학생 수만큼 반복하여 학생 정보 입력
            while (n-- > 0) {
                st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                int kor = Integer.parseInt(st.nextToken());
                int eng = Integer.parseInt(st.nextToken());
                int math = Integer.parseInt(st.nextToken());

                studentList.add(new Student(name, kor, eng, math));
            }

            // 학생 목록 정렬을 위해 정렬 기준을 지정한다.
            Collections.sort(studentList, new Comparator<Student>() {
                @Override
                public int compare(Student s1, Student s2) {

                    if (s1.kor == s2.kor) {
                        if (s1.eng == s2.eng) {
                            if (s1.math == s2.math) {
                                return s1.name.compareTo(s2.name);
                            }
                            return s2.math - s1.math;
                        }
                        return s1.eng - s2.eng;
                    }
                    return s2.kor - s1.kor;
                }
            });

            // 정렬된 학생 목록에서 이름을 하나씩 StringBuilder에 추가
            StringBuilder sb = new StringBuilder();
            for (Student student : studentList) {
                sb.append(student.name).append('\n');
            }

            System.out.println(sb);
        }
    }
}
