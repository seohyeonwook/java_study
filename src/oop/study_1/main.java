package oop.study_1;

public class main {
    public static void main(String[] args) {
        Order order = new Order(0.10); // 10% 할인율

        Product laptop = new Product("Laptop", 1200.00);
        Product mouse = new Product("Mouse", 25.00);
        Product keyboard = new Product("Keyboard", 75.00);

        order.addProduct(laptop);
        order.addProduct(mouse);
        order.addProduct(keyboard);

        order.printOrderDetails();

    }
}
