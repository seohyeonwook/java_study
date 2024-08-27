package Ex07;// 추상 메서드 - 몸통 {} 구현부가 없는 미완성 메서드
                // 클래스 앞에 abstaract붙이고 메서드 앞에 붙인다
                // 참조변수는 몸통이 아니다 리모컨이다
// 추상화/ 다형성/ 인터페이스는 sp에서 확인하자

public abstract class Ex0713 {
    abstract void play(int pos); // 메소드는 선언부 + 구현부인데 선언부만 가지고있다
    // 미완성 설계도 이기 때문에  - new 불가
    // 대신 다른클래스 작성하는데 도움을 준다
    // 추상클래스 상속 받아서 몸통(구현) 을 만들어준다

    public static void main(String[] args) {
        System.out.println();
    }

}

class Study extends Ex0713 { // 상속을 통해 추상메서드릉 완성해야 인스턴스 생성가능
    void play (int pos) { // 메서드가 완성되었기때문에 abstract 안붙임
        int a = 2;
    }

}
