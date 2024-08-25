package Ex07; // 제어자 -클래스와 클래스의 멤버(멤버 변수 ,메서드)에
                    // 부가적인 의미 부여 - 형용사라고 생각하자 (명사를 꾸며준다)
                    // 접근제어자 - public, protected, (default), private
                    //              접근제어자는 하나만 붙일 수 있다
                    // 그외 - static, final, abstract 등등

public class Ex0707 {
    // 하나의 대상에 여러 제어자를 같이 사용가능( 접근 제어자는 하나만)
    public static final int WIDTH = 200;
    // 순서는 상관없지만 접근제어자를 제일 앞에 쓴다

    public static void main(String[] args) {
        System.out.println("WIDTH: " +WIDTH);
    }
    // static - 클래스의 , 공통적인   - 멤버변수 와 메서드에 붙일 수 있다

    //          멤버 변수 - 모든 인스턴스에 공통적으로 사용되는 클래스 변수(cv) 가 된다
    //          클래스 변수는 인스턴스를 생성하지 않고도 사용 가능하다.
    //          클래스가 메모리에 로드될 때 생성된다.

    //          메서드- 인스턴스를 생성하지 않고도 호출이가능한 static메서드가 된다.
    //                  static메서드 내에서는 인스턴스멤버들을 직접 사용할 수 없다
    //                  = iv멤버들은 객체를 만들고 나서야 사용 할 수 있으니까

}
class StaticTest {
    static int width = 200; // iv앞에 붙으면 cv 된다

    // = 간단 초기화(명시적)
    static {
        //static변수의 복잡한 초기화 수행 // 클래스초기화 블럭 - 복잡 초기화
    }
    static int max( int a, int b ) { // 클래스 메서드 (static메서드)
        return a > b ? a: b;  // iv 사용 불가 , 인스턴스 메소드 사용 불가 - 인스턴스 멤버
    }
}


