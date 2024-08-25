package sp.ch_2;

public class Student {
    String schoolName;
    int classYear; // 몇 학년
    int classroomNumbers; // 몇 반
    int studentNumber; // 몇 번
    String name;
    String gender;

    void study( Teacher teacher, String subjectName) {
        String teacherName = teacher.name;
        System.out.printf("학생: 저는 %s선생님에게 %s과목을 배웁니다.\n",teacherName,subjectName);

    }
}
