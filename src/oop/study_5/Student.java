package oop.study_5;

import sp.ch_2.Subject;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Student {
    private String id;
    private String name;
    Map<String, Integer> subjects;

    public Student(String name ) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.subjects = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public void addOrUpdateSubject(String subject, int score) {
       subjects.put(subject, score);

   }
   public Integer getScore(String subject) {
        return subjects.get(subject);
   }
   public void removeSubject(String subject) {
        subjects.remove(subject);
        if(subject == null) {
            System.out.println(" 삭제한 과목 : " + subject);
        }
   }
    // 모든 과목과 점수를 출력
    public void printSubjects() {
        System.out.println("Subjects and Scores for " + name + ":");
        // 설명: 학생의 이름과 함께, 과목과 점수를 출력하기 위한 헤더를 출력합니다.
        // name은 Student 클래스의 인스턴스 변수로, 학생의 이름을 나타냅니다.
        for (Map.Entry<String, Integer> entry : subjects.entrySet()) {
            // 설명: subjects는 과목 이름을 키로, 점수를 값으로 갖는 Map<String, Integer> 타입의 맵입니다.
            //subjects.entrySet(): 이 메서드는 맵의 모든 키-값 쌍을 Set 형태로 반환합니다.
            //for (Map.Entry<String, Integer> entry : ...): entrySet()에서 반환된 각 키-값 쌍을 반복합니다.
            // 여기서 entry는 현재 반복에서의 키-값 쌍을 나타냅니다.
            System.out.printf("Subject: %s, Score: %d\n", entry.getKey(), entry.getValue());
            //설명: 각 키-값 쌍에서 키(과목 이름)와 값(점수)을 가져와서 포맷된 문자열로 출력합니다.
        }
   }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
