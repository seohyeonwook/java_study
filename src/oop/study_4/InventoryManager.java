package oop.study_4;

//변수:
//
//products (List<Product>): 제품 목록을 저장하는 리스트.

import java.util.ArrayList;
import java.util.List;

//메서드:
//
//InventoryManager(): 생성자. 빈 제품 리스트를 초기화합니다.
//addProduct(Product product): 제품을 리스트에 추가합니다.
//removeProductById(String id): 주어진 ID에 해당하는 제품을 삭제합니다. 삭제에 성공하면 true를 반환하고, 실패하면 false를 반환합니다.
//findProductById(String id): 주어진 ID에 해당하는 제품을 찾아 반환합니다. 제품이 없으면 null을 반환합니다.
//updateProductQuantity(String id, int quantity): 주어진 ID에 해당하는 제품의 수량을 업데이트합니다. 성공하면 true, 실패하면 false를 반환합니다.
//printAllProducts(): 현재 재고 목록을 출력합니다. 제품이 없을 경우 "현재 재고에 제품이 없습니다."라고 출력합니다.
public class InventoryManager {
    private List<Product> products;

    //InventoryManager(): 생성자. 빈 제품 리스트를 초기화합니다.
    public InventoryManager() {
        this.products = new ArrayList<>();
    }

    //addProduct(Product product): 제품을 리스트에 추가합니다. -
    public void addProduct(Product product){
        products.add(product);
    }
    //removeProductById(String id): 주어진 ID에 해당하는 제품을 삭제합니다. 삭제에 성공하면 true를 반환하고, 실패하면 false를 반환합니다.
    public boolean removeProductById(int id) {
        for(Product product : products) {
            if(product.getId() == id){
                products.remove(product);
                return true;
            }

        }
        return false;
    }
    //findProductById(String id): 주어진 ID에 해당하는 제품을 찾아 반환합니다. 제품이 없으면 null을 반환합니다.
    public Product findProductById(int id) {
        for( Product product: products ) {
//            if(product.equals(id)) { //equals 사용은 맞지 않다
//                equals() 메서드는 객체의 동등성을 비교할 때 사용되며, 정수형 ID를 비교하는 데 적합하지 않습니다.
            if(product.getId() == id){
                return product;
            }
        }
        return null;
    }
    //updateProductQuantity(String id, int quantity): 주어진 ID에 해당하는 제품의 수량을 업데이트합니다. 성공하면 true, 실패하면 false를 반환합니다.
    public boolean updateProductQuantity(int id, int quantity){
        Product product = findProductById(id); // id넣어서 findProductById 호출후 id찾아서 밑에 if문 실행
        if(product != null) {
            product.setQuantity(quantity);
            return true;
        }
        return false;
    }
    //printAllProducts(): 현재 재고 목록을 출력합니다. 제품이 없을 경우 "현재 재고에 제품이 없습니다."라고 출력합니다.
    public void printAllProducts(){//
        for(Product product: products){
            System.out.println(product);
            if( product == null) {
                System.out.println("현재 재고에 제품이 없습니다.");
            }
        }
    }

}
