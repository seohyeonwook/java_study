package Ex07;// 다형성 - 조상타입 참조 변수로 자손 타입 객체를 다루는 것
                // Tv t = new SmartTv(); 이렇게 생성자와 타입이 서로 불일치해도 된다
                // 조상과 자손인 관계에서만
                // Tv(조상) t = new SmartTv(자손)();
                //  참조변수 = 객체

public class Ex0710 {
//     Tv t = new SmartTv(); 조상이 참조변수면 가능 = > 멤버 개수가 조상이 5개고 자손이 2개면 5개 밖에 사용못함
//     SmartTv st = new Tv(); 이건 아예안됨
public static void main(String args[]) {
    Car car = new Car(); // 부모
    FireEngine fe = new FireEngine(); // 자식


    fe.water();
    car = new FireEngine();    // car = (Car)fe;에서 형변환이 생략됨 // 업캐스팅
    // 1. fe가 car가 되었다고 생각하자
//		car.water(); // car에는 water가 없다
    car.stop();
    fe = (FireEngine)car; // 자손타입 ← 조상타입. 형변환 생략 불가  // 다운 캐스팅
    // 2. fe 에다 car넣는 이유는 단순하다 업캐스팅을 했기때문에 지금 fe는 car인 상태이다 그걸 다시
    //    FireEngine으로 형변환해서 fe로 되돌리는거라고 생각하자
    fe.water();
}

}
class Car {
    String color;
    int door;

    void drive() { 	// 운전하는 기능
        System.out.println("drive, Brrrr~");
    }

    void stop() {  	// 멈추는 기능
        System.out.println("stop!!!");
    }
}

class FireEngine extends Car {	// 소방차
    void water() {	// 물을 뿌리는 기능
        System.out.println("water!!!");
    }
}

