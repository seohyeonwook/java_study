package ch.ch04;

public class Operation03 {
    public static void main(String[] args) {
        /*
           << 연산자 >>

           산술 연산자, 비교 연산자, 논리 연산자, 조건 연산자, 복합 대입 연산자
         */
        /*
            논리연산자

            &&(곱)  - AND 모든 조건이 다 충족 되어야 참
            ||(합)  - OR  모든 조건중에 하나라도 충족되면 참
            !(부정) - NOT

            True(1)
            false(0)

            true && false => false
            true && true => true
            true || false => true 0이아니면 무조건 true
            false || false => false
            !false => true

         */

        System.out.println("논리연산자");
        System.out.println(505 % 5 == 0 && 505 % 50 != 0);
        System.out.println(505 % 5 == 0 || 505 % 50 == 0);
        //System.out.println(!(505 % 5 == 0 || 505 % 50 == 0));
        //항상 반대로 하겠다 전체에 걸어야 적용됨
        int age = 30;
        System.out.println(40 > age && age > 20 );// 잘못 된 표기법 비교대상이 앞으로가야함
        System.out.println( age <40 && age > 20 ); // 이게 맞는거
        System.out.println( age <40 && age > 20 && age != 30 );



    }
}
