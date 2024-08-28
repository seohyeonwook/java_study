package sp.ch_5;

public class Customer { //부모 클래스
    static int serialNums = 1;
    private String customerID;
    private String name;
    private String customerGrade; // 등급
    private int bonusPoint;
    private double bonusPointRatio;// 적립율??

    public int calculatePrice(int price) {
        this.bonusPoint += price * bonusPointRatio;
        // this 현재 객체의 보너스 포인트를 나타냄
        // price * bonusPointRatio 곱해서 this.bonusPoint 에 더한다
        return price;


    }
    Customer() { // 그냥 상속 하면 기본생성자 필요하다고 생각하자

    }

    public Customer( String name) {
        this.customerID = "Customer"+ serialNums++;
        // serialNums은 int형이고 customerID은 String형이라 대입안되는데 앞에 ("Customer")
        // 문자열을 달면 자동으로 int가 String으로 변환
        this.name = name;
        this.customerGrade = "SILVER";
        this.bonusPoint = 0;
        this.bonusPointRatio = 0.01;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", name='" + name + '\'' +
                ", customerGrade='" + customerGrade + '\'' +
                ", bonusPoint=" + bonusPoint +
                '}';
    }

    //getter 메소드는 변수의 값을 읽어오는 데 사용됩니다.
    //setter 메소드는 변수의 값을 설정하는 데 사용됩니다.
    // 자식 클래스에서 부모 클래스의 private 변수에 값을 설정하려면,
    // setter 메소드를 사용합니다. 반대로,
    // getter 메소드는 변수의 값을 읽어오는 데 사용됩니다.
    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public double getBonusPointRatio() {
        return bonusPointRatio;
    }

    public void setBonusPointRatio(double bonusPointRatio) {
        this.bonusPointRatio = bonusPointRatio;
    }
}
