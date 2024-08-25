package Ex07;//접근 제어자 - 4개중 한개만 사용가능
            // private - 같은 클래스 내에서만 접근이 가능하다
            // (default) - 같은 패키지 내에서만 접근이 가능하다 - 접근제어자를 아무것도 안붙이면 자동으로
            // protected - 같은 패키지 내에서, 그리고 다른 패키지의 자손클래스에서 접근이 가능하다
            // public - 접근 제한이 전혀 없다

import java.sql.SQLOutput;

public class Ex0708 {
    // 클래스 앞에 붙일수 있는 접근제어자는 2개 뿐이다 public (default)
    // 멤버 에는 4개 다 붙일 수 있다 (iv ,cv , 메서드 )
    public static void main(String[] args) {

        MyParent p = new MyParent();
        // p.pub();  변수는 호출 못한다 메서드만 호출 가능 기본적인것
        p.printMembers(); // 이건 가능 - 메서드를 통한 ! 간접 !접근 이기때문에
                            // printMembers 메서드는 private과 같은 클래스에 정의 되어있기때문에
//        System.out.println(p.prv); // 하지만 이건 직접 접근방식이라 안된다
    }

}

class MyParent{
    private   int prv; // 같은 클래스
              int dft; // 같은 패키지
    protected int prt; // 같은 패키지 + 자손(다른 패키지)
    public    int pub; // 접근제한 없음

    public void printMembers() {
        System.out.println(prv);
        System.out.println(dft);
        System.out.println(prt);
        System.out.println(pub);
    } //같은 클래스 안이라 다 접근 가능
}
