package ch.ch03;

public class Function01 { // 함수쓰는 목적 1. 자주 재사용 하는것
                          // 2. 코드가 너무 길어져서 기능적으로 분리시기코 싶을때
    public static void main(String[] args) {
        System.out.println(fx1(1,2,3,4,5)); // 각각 abcde에 들어간다 // 함수호출 이라고 부름
        fx2("서현욱");
        fx3();//따로 두고 호출하면 가독성이 높아짐 - 클린코드
    }
    // 함수는 정의한다 / 변수나 상수는 선언한다라고 한다
    // 호출 순서대로 출력 된다
    static int fx1(int a,int b, int c, int d, int e) {
        return a+b+c+d+e;
    }

    static void fx2(String name) {
        System.out.println("이름은 : " + name);
    }

    static void fx3() {
        System.out.println(1+2+3+4/2);
    }
}
