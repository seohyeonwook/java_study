package sp.ch_4;

// 시나리오 참고
// 1. 손님은 캐시어에게 아메리카노 가격 물어본다.
// 2. 손님은 자신의 현금 에서 돈을 뺀다.
// 3. 손님은 아메리카노를 테이크 아웃 으로 주문한다.
// 4. 손님은 아메리카노 커피 를 마신다.
// 5. 손님은 자신의 기분이 좋아진다
public class Customer { // 일반 클래스

    // iv
    private long cashAmount;
    private String myFeeling;

    public void askCoffee(String coffeeName) { // 1. 손님은 캐시어에게 아메리카노가 얼마인지 물어본다
        System.out.println("손님 : 커피 " + coffeeName + "얼마 인가요??");
    }

    public long withDrawCash( long amount ) { // 4. 손님은 자신의 현금에서 돈을빼서
        this.cashAmount -= amount;
        return amount;
    }

    public void orderCoffee( String coffeeName , boolean isWrappedUp ) { // 5. 아메리카노를 테이크아웃으로 주문한다
        System.out.println("손님: 커피 " + coffeeName + "을 주문할게요" +
                "단, 포장 여부는 " + isWrappedUp +"으로 부탁드려요");
    }


    // getter setter 생성
    public long getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(long cashAmount) {
        this.cashAmount = cashAmount;
    }

    public String getMyFeeling() {
        return myFeeling;
    }

    public void setMyFeeling(String myFeeling) {
        this.myFeeling = myFeeling;
    }

    // 생성자 생성 - 매개변수 없으면 자동 생성 돼서 안만들어도 된다


}
