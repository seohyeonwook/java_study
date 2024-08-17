package Ex06; //참조형 매개변수
// 참조형 매개변수 - 변수의 값을 읽고 변경 할 수 있다.

class Data2{
    int x;
}
public class Ex0615 { // 스택이 쌓이는 순서를 잘 생각해보자 머리속으로 이미지 그리기
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d);
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(Data2 d) { // 참조형 매개변수 - 값이 복사가 되고 바꿀수있다
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
        // change 메서드가 종료되고 다시 호출된곳으로 돌아갈때 참조형은 바뀐값을 들고간다고 생각하자

    }
}
