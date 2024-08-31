package oop.study_5;

import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();

        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        Student student3 = new Student("Charlie");

        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.addStudent(student3);

        student1.addOrUpdateSubject("과학" , 86);
        student1.addOrUpdateSubject("수학" , 76);
        student1.addOrUpdateSubject("지리" , 12);

        student2.addOrUpdateSubject("과학" , 12);
        student2.addOrUpdateSubject("수학" , 55);
        student2.addOrUpdateSubject("지리" , 88);

        student3.addOrUpdateSubject("과학" , 32);
        student3.addOrUpdateSubject("수학" , 55);
        student3.addOrUpdateSubject("지리" , 87);

        studentManager.printAllStudents();

        Student foundStudent = studentManager.findStudentById(student1.getId());
        if(foundStudent != null ) {
            foundStudent.printSubjects();
        } else {
            System.out.println("학생 없음");
        }

        studentManager.removeStudentById(student3.getId());

        studentManager.printAllStudents();





    }
}
