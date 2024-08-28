package sp.ch_5;

public class GoldCustomer extends Customer{ // 자식
    private double discountRatio; // 구매 할인율

    @Override
    public int calculatePrice(int price) {
        super.calculatePrice(price); // 부모의 메소드를 그대로 사용하려고 할 때 작성됨
        price -= price * discountRatio;
        return price;
    }

    public GoldCustomer(String name) {
        super();// 없어도 기본 생성자 자동 호출 되지만 그냥 붙여주는게 좋다
        this.setCustomerID("Customer" + Customer.serialNums++); // 이러면 serialNums 이 String형으로 자동 형변환
        // 따로 안하고 일반 고객과 공유하기때문에 그냥 Customer 클래스 변수 가지고와서 쓴다

        this.setName(name);// 부모 private 안풀꺼면 setter만들어서 부모 값에 설정

        // getter가 아니라 setter인 이유 - 부모의 name에 내 name을 대입 (설정) 하는거기 때문에 값이 바뀐다

        // 자식 클래스에서 부모 클래스의 private 변수에 값을 설정하려면,
        // setter 메소드를 사용합니다. 반대로,
        // getter 메소드는 변수의 값을 읽어오는 데 사용됩니다.
        this.setCustomerGrade("Gold");
        this.setBonusPoint(0);
        this.discountRatio = 0.03;
        this.setBonusPointRatio(0.03);
    }
    public void printMyInfo() { // ****
        System.out.printf("Customer(customerId= %s,name = %s, customerGrade= %s, bonusPoint = %d \n",
                this.getCustomerID(), this.getName(), this.getCustomerGrade(), this.getBonusPoint());
        // 이건 부모꺼 읽어오는거니까 get
    }
}
