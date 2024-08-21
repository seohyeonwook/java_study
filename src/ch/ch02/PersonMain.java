package ch02;

public class PersonMain {
    public static void main(String[] args) {
        //Person p; // p라는 변수를 만들었고 자료형이 Person 이다 int a = 10; 정수가 들어가는것 처럼
        // person에는 person자료형이 들어가야한다 근데 컴퓨터에는 person이 존재하지 않는다
        // 그래서 새로운 변수를 만들어줘야한

        Person p = new Person(); // 이렇게 새로운 형태를 만들자 변수 뒤에(p).을 찍으면 해당 주소공간으로 들어간다고 생각
        p.name = "서현욱"; // 이렇게 각각의 값을 넣고 나면 이름과 나이가 하나로 묶였다
        p.age = 31;

        Person p2 = new Person(); // 이런 형식을 주소 참조라고 하고 참조자료형이라고 부른다
        p2.name =  "서연욱";
        p2.age = 30;


        System.out.println(p);

    }
}
