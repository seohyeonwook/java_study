package sp.ch_3;

public class Teacher {
    String schoolName;
    Subject subject; // 객체를 변수로 지정한다 Subject타고 들어가면 변수 2개 지정 되어있음
    public String name;
    public String gender;

    void teach(Student student, String subjectName) {
        String studentName = student.name;

        System.out.printf("선생: %s학생에게 %s과목을 가르치고 있습니다.\n",studentName,subjectName);
    }

    public Teacher(String schoolName,  String gender, String SubjectName, String SubjectCode) {
        this.schoolName = schoolName; // 변수 초기화
        this.gender = gender;
        Subject newsubject = new Subject();// 이렇게 객체 만들어줘야함
        newsubject.subjectName = SubjectName; // 객체 를 변수로 불러오는건 바로하면 안된다 생성자를 만들어줘야함
        newsubject.subjectCode = SubjectCode;


        subject = newsubject; // 이유 - 위 코드는 Subject 클래스에 newsubject 객체랑 연결한거다
                                // Teacher 에 있는 subject이랑은 연결 안되어있으니 연결해주자
    }

}
