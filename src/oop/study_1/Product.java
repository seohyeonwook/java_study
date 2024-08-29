package oop.study_1;

//필드: 제품의 이름(name)과 가격(price)을 저장합니다.
//생성자: 이름과 가격을 초기화합니다.
//        메소드:
//getName과 setName: 이름을 가져오거나 설정합니다.
//getPrice와 setPrice: 가격을 가져오거나 설정합니다.
//        toString: 제품 정보를 문자열로 반환합니다.
public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
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

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
