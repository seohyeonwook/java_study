package ch.ch05;

public class If01 {
    public static void main(String[] args) {
        // 조건문 연산의 결과가 true false값만 온다
        int i = 3;
        if( i > 3) {
            System.out.println("i가 3보다 큽니다");
            System.out.println("if문 종료");
        } else if ( i == 3) {
            System.out.println("i가 3입니다");
        } else  {
            System.out.println("i가 3보다 작습니다");
        }
    }
}
