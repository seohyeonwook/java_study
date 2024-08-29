package oop.study_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager();

        List<Product> products = Arrays.asList(
                new Product("Laptop", 1500.00, 10),
                new Product("Smartphone", 800.00, 25),
                new Product("Headphones", 200.00, 50),
                new Product("wer", 200.00, 32),
                new Product("wwwww", 200.00, 44)
        );

//        inventoryManager.addProduct(products); 이렇게 하면 안됨 List썻으니까 for문 따라온다 생각하자
        for(Product product: products) {
            inventoryManager.addProduct(product);
        }
        inventoryManager.printAllProducts();
        System.out.println();

        // 제품 삭제
        inventoryManager.removeProductById(3);
        inventoryManager.printAllProducts();
        System.out.println();

        // 제품 조회 및 수량 업데이트
        Product foundProduct = inventoryManager.findProductById(4);
        if(foundProduct != null) {
            System.out.println("조회된 제품: " + foundProduct );
            inventoryManager.updateProductQuantity(foundProduct.getId(), 30);
            System.out.println("수량 업데이트 후: " + foundProduct );
        } else {
            System.out.println("해당 Id의 제품이 없습니다");
        }


    }


}
