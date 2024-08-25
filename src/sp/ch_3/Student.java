package sp.ch_3;

public class Student {
    String schoolName;
    int classYear; // 몇 학년
    int classroomNumbers; // 몇 반
    int studentNumber; // 몇 번
    String name;
    String gender;

    void study(Teacher teacher, String subjectName) {
        String teacherName = teacher.name;
        System.out.printf("학생: 저는 %s선생님에게 %s과목을 배웁니다.\n",teacherName,subjectName);

    }
    // 오버로딩 안하면 기본 생성자 만들 필요없음
    Student(String schoolName, int classYear, int classroomNumbers, int studentNumber, String name, String gender) {
        this.schoolName = schoolName;
        this.classYear = classYear;
        this.classroomNumbers = classroomNumbers;
        this.studentNumber = studentNumber;
        this.name = name;
        this.gender = gender;

    }

    @Override
    public String toString() {
        return "Student{" +
                "schoolName='" + schoolName + '\'' +
                ", classYear=" + classYear +
                ", classroomNumbers=" + classroomNumbers +
                ", studentNumber=" + studentNumber +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
