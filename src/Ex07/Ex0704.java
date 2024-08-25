package Ex07; // 참조변수 super = this와 비슷하다
                // 객체 자신을 가리키는 참조변수. 인스턴스 메서드(생성자)내에서만 존재
                // super = 조상의 멤버를 자신의 멤버와 구별할 때 사용
                // this = lv와 iv구별에 사용

public class Ex0704 {
    public static void main(String args[]) {
        Child c = new Child();
        c.method();
        System.out.println("---------------");
        Child2 c2 =new Child2();
        c2.method();

    }
}

class Parent{ // 부모와 자식 둘다 x라는 변수를 가지고 있는데 구분하자
    int x = 10; // super
}

class Child extends Parent {
    int x = 20; // this

    void method() {
        System.out.println("x= " + x);
        System.out.println("this.x= "+ this.x);
        System.out.println("super.x= "+ super.x);
    }
}

class Parent2 {
    int x = 10; // super와 this둘다 가능 = 자식에 똑같은 변수 이름없다
}

class Child2 extends Parent2 {
    void method() {
        System.out.println("x= " + x);
        System.out.println("this.x= "+ this.x);
        System.out.println("super.x= "+ super.x);
    }
}

