package sp.ch_4;

// 시나리오 참고
// 1. 바리스타 는 아메리카노 주문 확인을 알린다.
// 2. 바리스타는 물 500ml와 원두 30g 로 아메리카노 커피 만든다
// 3. 바리스타는 아메리카노 커피 완성을 알린다
public class Barista {
    // iv - 없음 - 바리스타 시나리오는 행위(메서드)만 있음

    // 행위
    public void noticeOrder(String coffeeName) { // 8. 바리스타는 주문 확인을 하고
        System.out.println("바리스타: 커피주문 확인했습니다 커피: "+ coffeeName );
    }
    public Coffee makeUpCoffee (Coffee coffee){ // 9. 아메리카노 커피 만든다
        coffee.getCoffeeName();
        coffee.setWaterQuantity(500);
        coffee.setCoffeeBeanQuantity(30);
        return coffee;
    }

    public void sayCoffeeReady(Coffee coffee) { // 10. 커피 완성을 알린다
        String coffeeName = coffee.getCoffeeName();
        System.out.println("바리스타: 커피 제작이 완료되었습니다. 커피: " +coffeeName);
    }


}
