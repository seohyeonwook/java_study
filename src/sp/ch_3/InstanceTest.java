package sp.ch_3;

public class InstanceTest {
    public static void main(String[] args) {
        Student student1 = new Student("School", 1, 3, 20, "Bob","Male" );
        Student student2 = new Student("School", 1, 3, 15, "Alice","Female");
        System.out.println(student2);

        Teacher teacher = new Teacher("Tom","Femaile","korean","AB001") ;
        System.out.println(teacher.subject.subjectName);// subject 은 객체를 변수로 쓰는거니까 객체안에 한번 더 들어가서 꺼내와야한다
        System.out.println(teacher.schoolName);
    }
}
