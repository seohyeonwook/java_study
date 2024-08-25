package sp.ch_4;

// 시나리오 참고
// 1. 캐시어는 아메리카노가 얼마인지 확인한다.
// 2. 캐시어는 아메리카노 가격을 답변해준다.
// 3. 캐시어는 자신의 매상에 돈을 더한다.
// 4. 캐시어는 아메리카노 주문을 알린다.
// 5. 캐시어는 아메리카노 커피 를 포장한다.
// 6. 캐시어는 아메리카노 커피 준비 완료를 알린다.
// 가격표
// [가격표] 아메리카노 : 5천원, 카페라떼: 6천원, 카페모카: 6500원, 카푸치노: 6000원
public class Cashier {

    private long salesAmount; // iv

    // 행위

    public long checkCoffeePrice(String coffeeName) { // 2. 캐시어는 아메리카노가 얼마인지 확인
        long price; // lv
        switch (coffeeName) {
            case "아메리카노":
                price = 5000;
                break;
            case "카페라떼":
                price = 6000;
                break;
            case "카페모카":
                price = 6500;
                break;
            case "카푸치노":
                price = 6000;
                break;
            default:
                price = 0;
                break;
        }
        return price;
    }

    public void replayCoffeePrice(String coffeeName, long price ) { // 3. 가격을 답변해준다
        if( price == 0 ) {
            System.out.println("캐시어: 죄송합니다 손님 말씀하신 메뉴: " + coffeeName+ "는 저희 가게 없습니다");
        }
        System.out.println("캐시어: 말씀하신 커피" + coffeeName+ "은 가격이" + price + "원 입니다.");

    }
    public void addAmount(long money) { // 6. 캐시어는 자신의 매상에 돈을 더한다
        this.salesAmount += money;
    }

    public void sayOrder(String coffeeName) { // 7. 주문확인을 알린다
        System.out.println("캐시어: 커피 "+ coffeeName + "주문이 들어왔습니다.");
    }

    // getter setter생성
    public long getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(long salesAmount) {
        this.salesAmount = salesAmount;
    }


}
