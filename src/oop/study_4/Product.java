package oop.study_4;

//변수:
//
//id: 제품의 고유 식별자 (UUID 사용)
//name: 제품 이름
//price: 제품 가격
//quantity: 재고 수량

//메서드:
//
//Product(String name, double price, int quantity): 생성자. 제품의 이름, 가격, 재고 수량을 초기화합니다. ID는 자동 생성됩니다.
//getId(): 제품의 ID를 반환합니다.
//getName(): 제품의 이름을 반환합니다.
//setName(String name): 제품의 이름을 설정합니다.
//getPrice(): 제품의 가격을 반환합니다.
//setPrice(double price): 제품의 가격을 설정합니다.
//getQuantity(): 재고 수량을 반환합니다.
//setQuantity(int quantity): 재고 수량을 설정합니다.
//toString(): 제품의 정보를 포맷된 문자열로 반환합니다.
public class Product {
    static int nextId = 1; // 다음에 할당할 ID를 추적하는 정적 변수
    private int id; // 제품의 고유 ID
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.id = nextId++; // 제품이 생성될 때마다 고유 ID 부여
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
