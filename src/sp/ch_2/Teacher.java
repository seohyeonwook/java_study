package sp.ch_2;

public class Teacher {
    String schoolName;
    Subject subject;
    public String name;
    public String gender;

    void teach(Student student, String subjectName) {
        String studentName = student.name;
        System.out.printf("선생: %s학생에게 %s과목을 가르치고 있습니다.\n",subjectName,subjectName);
    }
}
