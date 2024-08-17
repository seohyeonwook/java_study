package Ex06;
// 기본형 매개변수 - 변수의 값을 읽기만 할 수 있다.(변경 불가)(8개)

class Data {
    int x; // 1  변수 선언
}
public class Ex0614 { // 실행 했을때 순서를 잘 보자
    // 기본형 매개변수는 바꿀수 없다 읽기만 가능
    // 지역 변수는 한번 쓰고 사라진다
    public static void main(String[] args) {


        Data d = new Data(); // 1 - 1 객체 생성
        d.x = 10;// 1- 2  생성한 객체에 숫자 10 대입
        System.out.println("main() : x = " + d.x); // 1 -3  출력

        change(d.x); // 2  차례 대로내려가자 change를 호출해서
        System.out.println("After change(d.x)"); // 3 출력
        System.out.println("main() : x = " + d.x); // 4  d.x를 출력한다 (10)
    }

    static void change(int x) {  // 2 -1 이 메서드가 호출된다 기본형 매개변수가 매개변수로 들어가기때문에 읽기만가능
        x = 1000; // 2 -2 여기서 x를 1000으로 바꾸기
        System.out.println("change() : x = " + x); // 2 -3 출력 해서 x =1000이 되지만 지역변수라 사라진다
    }
}
