package Ex07;//
            // 다형성 - 업캐스팅 / 다운 캐스팅 / instanceof


class Buyer {	// 고객, 물건을 사는 사람
    int money = 1000;	  // 소유금액
    int bonusPoint = 0; // 보너스점수

    void buy(Product p) { // 조상을 매개변수로 받아 자식 변수 사용할 수 있다
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;            // 가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint;  // 제품의 보너스 점수를 추가한다.
        System.out.println(p.toString() + "을/를 구입하셨습니다.");
    }
}
public class Ex0712 {
    public static void main(String args[]) {
        Buyer b = new Buyer();

        b.buy(new Tv1()); // Tv1 객체를 생성하고, `buy` 메서드를 호출하여 구매합니다.
        // 아래 두줄이랑 같은거임 생성하면서 호출

//        b.buy(new Computer());

//        Product p = new Computer();
//        b.buy(p);

        Computer computer = new Computer();
        b.buy(computer);

        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
    }
}
class Product {
    int price;			// 제품의 가격
    int bonusPoint;	// 제품구매 시 제공하는 보너스점수

    Product(int price) { // 생성자 - 생성자는 객체의 초기화 작업을 담당하며, 객체가 생성될 때 자동으로 호출됩니다.

        this.price = price;
        bonusPoint = (int)(price/10.0);	// 보너스점수는 제품가격의 10%
    }
}

class Tv1 extends Product {
    Tv1() {
        // 조상클래스의 생성자 Product(int price)를 호출한다.
        super(100);		// 조상의 생성자 에 매개변수 넣어서 호출
                                // super 타보면 Product생성자 나옴
                                // 생성자에 100을 넣는거다
        System.out.println("Tv호출");
    }

    // Object클래스의 toString()을 오버라이딩한다.
    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}


