package Ex06;// static 메서드는 인스턴스 변수(iv)를 사용할 수 없다

class TestClass2 {
    int iv; //인스턴스 변수 - 객체생성후 사용가능
    static int cv; //클래스 변수 - cv는 언제나 사용가능

    void instanceMethod() { //인스턴스 메서드 - 객체 생성해야 호출 가능
        System.out.println(iv); // 인스턴스 변수를 사용할 수 있다 - 사용 가능
        System.out.println(cv); // 클래스 변수를 사용할 수 있다 - 사용가능
    }
}

public class Ex0618 {
    public static void main(String[] args) { //static메서드 - 객체 생성없이 호출가능
//        System.out.println(iv); // 에러 @@ 인스턴스 변수를 사용할 수 없다 - 사용 불가 xxx
//                                   메서드도 똑같다 static메서드에서는 인스턴트 메서드 호출 안된다 (iv)있는지 없는지모르니까
//        System.out.println(cv); // 클래스 변수는 사용할 수 있다 - 사용 가능

    }
}
