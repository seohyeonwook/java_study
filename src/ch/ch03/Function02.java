package ch.ch03;

public class Function02 { // 함수 = 호출을 하면


    public static void main(String[] args) { //void가 들어가면 리턴이 없다
        fx01();
        fx02(33,"서현욱"); // 매개변수 순서대로 넣어야 함
        int num = fx03();
        System.out.println(num);
        System.out.println();
        System.out.println(fx04("서현욱", 34));
    }

    public static void fx01() { // 매개변수 x ,리턴 x
        // 타입에 맞게 입력해야 호출이 된다 ()안에 매개변수가 없기때문에 빈공간
        System.out.println("fx01 함수 실행");
        System.out.println();
    }

    public static void fx02(int age, String name) { // 매개변수 o, 리턴 x
        //이름( 매개변수 - 인트랑 문자열을 가지는 함수)
        System.out.println("fx02 함수 실행");
        System.out.println("나이 : " + age);
        System.out.println("이름 : " + name);
        System.out.println();
    }

    public static int fx03() { // 매개변수 x , 리턴 o
        System.out.println("fx03 함수 실행");
        return 100;
    }

    public static String fx04(String name, int age) {
        return name + "," + age;
    }

}
