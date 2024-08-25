package Ex06;// 변수의 초기화
// 지역변수 (lv)는 수동 초기화 해야함 (우리가 직접 초기화)
// 멤버변수 (iv, cv)는 자동 초기화 된다 ( 0으로 )

public class Ex0624 {
    public static void main(String[] args) {

    }

    class InitTest {
        int x; // 인스턴스 변수 - 자동 초기화
        int y = x;

        void method1() {
            int i; // 지역변수 - 수동 초기화 => int i = 0;
//            int j = i; // 에러 나는 이유 - 지역변수를 초기화 하지 않고 사용
        }
    }

    // 멤버 변수 의 초기화 - 안해도 자동으로 0으로 초기화 된다
    // 클래스 변수 초기화 시점: 클래스가 처음 로딩 될 때 단 한번
    // 인스턴스 변수 초기화 시점 : 인스턴스가 생성될 때 마다

    // 1. 간단(=) 초기화
    class Engine {
        int door = 4; // 기본형 변수 초기화
        Engine e =new Engine(); // 참조형 변수의 초기화 - 참조형은 객체를(new Engine) 만들어서 e에 넣어줘야한다

    }
    // 2.복잡 초기화
    // cv -클래스 초기화 블럭: static{}
    // iv -생성자 초기화


}
