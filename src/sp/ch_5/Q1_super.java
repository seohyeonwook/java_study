//package sp.ch_5;
//
//public class Q1_super {
//    super();를 생략할 수 있는지 여부는 자식 클래스의 생성자와 부모 클래스의 생성자 정의에 따라 다릅니다.
//    자바에서는 자식 클래스의 생성자에서 부모 클래스의 생성자를 명시적으로 호출하지 않으면,
//    자바 컴파일러가 자동으로 부모 클래스의 기본 생성자(super();)를 호출합니다.
//
//
//    부모 클래스에 기본 생성자만 있는 경우 - 생략 가능
//
//    부모 클래스에 매개변수가 없는 기본 생성자만 있을 경우, 자식 클래스의 생성자에서 super();를 생략해도 문제가 없습니다.
//    컴파일러가 자동으로 부모 클래스의 기본 생성자를 호출합니다.
//
//            java
//    코드 복사
//    public class Customer {
//        public Customer() {
//            // 기본 생성자
//        }
//    }
//
//    public class GoldCustomer extends Customer {
//        public GoldCustomer(String name) {
//            // `super();` 생략 가능
//            this.setName(name);
//            this.customerID = "Customer" + Customer.serialNums++;
//            this.customerGrade = "GOLD";
//            this.discountRatio = 0.03;
//            this.bonusPointRatio = 0.03;
//        }
//    }
//
//    부모 클래스에 매개변수가 있는 생성자만 있는 경우 - 호출 필수
//
//    부모 클래스에 매개변수가 있는 생성자만 정의되어 있고 기본 생성자가 없는 경우,
//    자식 클래스에서 super()를 명시적으로 호출해야 합니다.
//    기본 생성자가 없기 때문에 컴파일 에러가 발생합니다.
//
//            java
//    코드 복사
//    public class Customer {
//        public Customer(int value) {
//            // 매개변수 있는 생성자
//        }
//    }
//
//    public class GoldCustomer extends Customer {
//        public GoldCustomer(String name) {
//            super(10); // 부모의 매개변수 있는 생성자를 호출해야 함
//            this.setName(name);
//            this.customerID = "Customer" + Customer.serialNums++;
//            this.customerGrade = "GOLD";
//            this.discountRatio = 0.03;
//            this.bonusPointRatio = 0.03;
//        }
//    }
//
//    부모 클래스에 기본 생성자와 매개변수 있는 생성자가 모두 있는 경우 - 생략 가능
//
//    부모 클래스에 기본 생성자와 매개변수 있는 생성자가 모두 있을 때,
//    자식 클래스의 생성자에서 명시적으로 super();를 호출할 수 있으며,
//    기본 생성자를 자동으로 호출할 수도 있습니다.
//            super();를 생략할 경우, 기본 생성자가 호출됩니다.
//
//            java
//    코드 복사
//    public class Customer {
//        public Customer() {
//            // 기본 생성자
//        }
//
//        public Customer(int value) {
//            // 매개변수 있는 생성자
//        }
//    }
//
//    public class GoldCustomer extends Customer {
//        public GoldCustomer(String name) {
//            // `super();` 생략 가능, 기본 생성자 호출
//            this.setName(name);
//            this.customerID = "Customer" + Customer.serialNums++;
//            this.customerGrade = "GOLD";
//            this.discountRatio = 0.03;
//            this.bonusPointRatio = 0.03;
//        }
//    }
//    요약
//    부모 클래스에 기본 생성자만 있는 경우: 자식 클래스에서 super();를 생략해도 기본 생성자가 자동 호출됩니다.
//    부모 클래스에 매개변수 있는 생성자만 있는 경우: 자식 클래스에서 매개변수 있는 생성자를 명시적으로 호출해야 합니다.
//    부모 클래스에 기본 생성자와 매개변수 있는 생성자가 모두 있는 경우: super();를 생략해도 기본 생성자가 자동 호출되며, 필요에 따라 super(매개변수);로 매개변수 있는 생성자를 호출할 수 있습니다.
//super();를 생략할 수 있는 경우도 있지만, 명시적으로 호출하는 것이 코드를 더 명확하게 해주는 경우가 많습니다.
//}
