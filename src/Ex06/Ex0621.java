package Ex06;// 기본생성자 - 생성자가 하나도 없을 때만, 컴파일러가 기본 생성자 자동 추가
// 모든클래스는 반드시 하나의 생성자가 있어야한다
class Data_1 {
    int value;
    //이 기본 생성자는 클래스의 객체를 생성할 때, 멤버 변수를 초기화하는 역할을 합니다.
    // 생성자 없어서 컴파일러는 자동으로 기본생성자 추가
    // public Car() { } 이거 숨어있다
    // 기본생성자는 매개변수가 없다

}

class Data_2 {
    int value;

    Data_2() {} // 이렇게 기본생성자 추가해줘야함 - 기본생성자
    Data_2(int x) {   // 매개변수가 있는 생성자. - 자동으로 기본생성자 추가 안해줌
        value = x;
    }
}

public class Ex0621 {
    public static void main(String[] args) {
        Data_1 d1 = new Data_1();
        Data_2 d2 = new Data_2(10); // compile error발생
        System.out.println(d1.value);// 0으로 자동초기화


    }
}

