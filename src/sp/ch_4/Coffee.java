package sp.ch_4;

// 시나리오 참고
// - 아메리카노 커피 는 물 500ml 와 원두 30g으로 만들어진다
// - 아메리카노 커피 는 테이크 아웃용으로 포장된다
public class Coffee {

    private String coffeeName;
    private long waterQuantity; // ml 단위
    private long coffeeBeanQuantity; // 원두의 양 g 단위
    private boolean isWrappedUp; // 포장 여부 = isTakeOut

    // getter setter
    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public long getWaterQuantity() {
        return waterQuantity;
    }

    public void setWaterQuantity(long waterQuantity) {
        this.waterQuantity = waterQuantity;
    }

    public long getCoffeeBeanQuantity() {
        return coffeeBeanQuantity;
    }

    public void setCoffeeBeanQuantity(long coffeeBeanQuantity) {
        this.coffeeBeanQuantity = coffeeBeanQuantity;
    }

    public boolean isWrappedUp() {
        return isWrappedUp;
    }

    public void setWrappedUp(boolean wrappedUp) {
        isWrappedUp = wrappedUp;
    }
}
