package oop.study_1;

//필드: 제품 목록(products)과 할인율(discountRate)을 저장합니다.
//생성자: 제품 목록을 초기화하고, 할인율을 설정합니다.
//메소드:
//addProduct: 제품을 주문에 추가합니다.
//calculateTotal: 총 금액을 계산하고 할인율을 적용합니다.
//printOrderDetails: 주문의 상세 정보와 할인 적용 후 총 금액을 출력합니다.

import java.util.ArrayList;
import java.util.List;

//Product 객체를 저장하는 List를 사용하여 여러 제품을 관리합니다.
//addProduct 메소드로 제품을 추가하고, calculateTotal 메소드로 총 금액을 계산하며, 할인율을 적용합니다.
//printOrderDetails 메소드를 사용하여 주문 상세 정보와 할인 적용 후 총 금액을 출력합니다.
public class Order {
    private List<Product> products;
    // product에 변수들은 private 인데 어떻게 리스트로 가지고 올 수 있나 = 객체를 참조만 하기때문에

    // 그러나 객체 지향 프로그래밍에서는 객체를 통해 서로 다른 클래스 간에 상호작용을 할 수 있습니다.
    // 객체가 다른 객체를 참조하는 방식으로 간접적으로 데이터를 공유할 수 있습니다.
    //Order 클래스는 Product 객체를 참조할 수 있지만,
    // Product 클래스의 private 필드에 직접 접근하지는 않습니다.
    // 대신 Product 클래스의 공식적인 메소드(getter와 setter)를 사용하여 데이터를 조작합니다.
    // Order 클래스는 Product 객체의 참조를 가지고 있으며, 이를 통해 제품의 가격을 읽거나 수정할 수 있습니다.
    private double discountRate;

    public Order(double discountRate) { // 생성자
        this.products = new ArrayList<>();
        this.discountRate = discountRate;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        double total = 0.0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total - (total * discountRate);
    }

    public void printOrderDetails() {
        System.out.println("Order Details:");
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.printf("Total after %.2f%% discount: %.2f\n", discountRate * 100, calculateTotal());
    }
}
