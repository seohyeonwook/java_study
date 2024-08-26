package Ex07;

// 제품을 구매하는 고객 클래스
class Buyer1 {
    int money = 1000;  // 초기 소유 금액
    int bonusPoint = 0; // 초기 보너스 점수

    // 제품을 구매하는 메서드
    void buy(Product p) {
        if (money < p.price) { // 돈이 부족하면
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return; // 메서드를 종료
        }

        money -= p.price;            // 가진 돈에서 제품 가격을 뺀다
        bonusPoint += p.bonusPoint;  // 보너스 점수를 추가한다
        System.out.println(p + "을/를 구입하셨습니다."); // 구매한 제품 정보 출력
    }
}

public class Ex0712copy {
    public static void main(String[] args) {
        Buyer1 buyer = new Buyer1(); // Buyer 객체 생성

        // Tv1 객체를 생성하고 구매
        buyer.buy(new Tv1());

        // Computer 객체를 생성하고 구매
        Product computerProduct = new Computer();
        buyer.buy(computerProduct);

        // 또 다른 Computer 객체를 생성하고 구매
        Computer computer = new Computer();
        buyer.buy(computer);

        // 현재 남은 돈과 보너스 점수 출력
        System.out.println("현재 남은 돈은 " + buyer.money + "만원입니다.");
        System.out.println("현재 보너스점수는 " + buyer.bonusPoint + "점입니다.");
    }
}

// 기본 제품 클래스
class Product2 {
    int price;         // 제품 가격
    int bonusPoint;    // 보너스 점수

    // 생성자
    Product2(int price) {
        this.price = price;
        bonusPoint = (int)(price / 10.0); // 보너스 점수는 가격의 10%
    }

    // 제품을 문자열로 표현
    public String toString() {
        return "Product";
    }
}

// Tv1 클래스, Product를 상속
class Tv13 extends Product {
    Tv13() {
        super(100); // Tv1 가격을 100으로 설정
    }

    // Tv1을 문자열로 표현
    public String toString() {
        return "Tv";
    }
}

// Computer 클래스, Product를 상속
class Computer12 extends Product {
    Computer12() {
        super(200); // Computer 가격을 200으로 설정
    }

    // Computer를 문자열로 표현
    public String toString() {
        return "Computer";
    }
}

