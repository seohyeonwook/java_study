package Ex07; // 단일 상속 - java는 단일상속만을 허용한다
                        // 하나의 부모만 상속 = 조상이 여러개 있으면 그중 하나만 가능

public class Ex0702 {// Object클래스  -
    // 모든 클래스의 조상 -
    // 부모가 없는 클래스는 자동적으로 Object클래스를 상속받게 된다
    // 모든 클래스는 Object클래스에 정의된 11개의 메서드를 상속받는다 eg) toString , equals, hashCode() 등등
    public static void main(String[] args) {
        Circle c = new Circle();
         MyPoint p = new MyPoint(); // 이렇게 생성해야 사용할 수 있음
         c.p.x = 5; // MyPoint 객체를 생성하지 않으면 사용 불가능
        System.out.println();
        System.out.println(c.toString()); // Object클래스에 있는 기본 메서드

    }

}
class MyPoint extends Object{ // 컴파일하면 자동으로 Object 클래스 상속하게 된다
    int x;
    int y;
}

class Circle { // 얘도 안보이지만 Object클래스 상속중
    MyPoint p; // = new MyPoint(); 상속 아니라 포함
    int r;

    Circle() {
        p = new MyPoint();
    }

}


