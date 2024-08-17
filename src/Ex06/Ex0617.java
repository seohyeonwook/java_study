package Ex06;// static 메서드(클래스 메서드)와 인스턴스 메서드

// 인스턴스 메서드 - 인스턴스 생성후, 참조변수.메서드이름()으로 호출
//             인스턴스 멤버(iv)와 관련된 작업을 하는 메서드
// static메서드(클래스메서드) - 객체생성 없이 클래스이름.메서드이름()으로 호출 ex) Math.random()
//                       인스턴스 멤버(iv)와 관련 없는 작업을 함

// 결과적으로 iv를 사용 하냐 안하냐로 나뉨 - static메서드와 인스턴스메서드의 차이점( 객체 생성하냐안하냐 )
// static을 언제 붙여야 할까?? - 인스턴스 멤버(iv)을 사용하지 않는 메서드에 static을 붙인다

class MyMath2 {
    long a,b;

    long add() { // 인스턴스 메서드 // 매개변수 없음 - 필요없는 이유는 iv사용하기때문
        return a +b; // iv
    }

    static long add (int a, int b) { // 클래스(static) 메서드 // 매개변수 있음
        return a + b; // lv
    }
}
public class Ex0617 {
    public static void main(String[] args) {
        System.out.println(MyMath2.add(200,199));// 클래스메서드 호출 - 인스턴스(객체)생성 필요없이 바로 호출가능
//                         클래스이름.메서드이름()
        //-----------------------------------------------------------------------------------------------
        MyMath2 mm = new MyMath2(); // 인스턴스 생성
        mm.a = 200L;
        mm.b = 399L;
        System.out.println(mm.add());// 인스턴스 메서드 호출
        //                 참조변수이름.메서드이름()

    }
}
