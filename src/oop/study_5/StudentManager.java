package oop.study_5;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    List<Student> students; // 학생 객체 저장

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }
    public boolean removeStudentById(String id) {
        for( Student student : students) {
            if(student.getId().equals(id)) {
                students.remove(student);
                System.out.println("삭제 완료: "+ student.getName());
                return true;
            }
        }
        return false;
    }
    public Student findStudentById(String id) {
        for( Student student : students ) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }
    public void printAllStudents() {
        for( Student student : students) {
            System.out.println(student);
        }
    }
}
