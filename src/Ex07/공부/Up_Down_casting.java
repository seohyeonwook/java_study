//package Ex07.공부;
//
//public class Up_Down_casting {
//
//
//    업캐스팅(Upcasting) 예시:
//    업캐스팅은 자식 클래스의 객체를 부모 클래스 타입으로 참조하는 것을 의미합니다. 이는 암묵적으로 형변환이 가능하며,
//    부모 클래스에 선언된 멤버(메서드, 변수)들만 접근할 수 있습니다.
//
//    java
//    코드 복사
//    class Animal {
//        public void sound() {
//            System.out.println("Some sound");
//        }
//    }
//
//    class Dog extends Animal {
//        public void sound() {
//            System.out.println("Bark");
//        }
//
//        public void wagTail() {
//            System.out.println("Wagging tail");
//        }
//    }
//
//    public class Main {
//        public static void main(String[] args) {
//            Dog dog = new Dog();  // Dog 객체 생성
//            Animal animal = dog;  // 업캐스팅: Dog 타입의 객체를 Animal 타입으로 참조
//
//            animal.sound(); // 출력: "Bark"
//            // animal.wagTail(); // 오류: Animal 타입은 wagTail() 메서드를 알지 못함
//        }
//    }
//    Dog 객체가 Animal 타입으로 업캐스팅되면서 sound() 메서드는 호출할 수 있지만,
//    wagTail() 메서드는 Animal 클래스에 없기 때문에 호출할 수 없습니다.
//
//
//    다운캐스팅(Downcasting) 예시:
//    다운캐스팅은 부모 클래스 타입의 객체를 자식 클래스 타입으로 다시 변환하는 것을 의미합니다.
//    이는 명시적으로 형변환을 해야 하며, 자식 클래스에만 있는 멤버에 접근할 수 있게 됩니다.
//    다운캐스팅 시 객체의 타입이 실제로 맞지 않으면 ClassCastException이 발생할 수 있습니다.
//
//            java
//    코드 복사
//    class Animal {
//        public void sound() {
//            System.out.println("Some sound");
//        }
//    }
//
//    class Dog extends Animal {
//        public void sound() {
//            System.out.println("Bark");
//        }
//
//        public void wagTail() {
//            System.out.println("Wagging tail");
//        }
//    }
//
//    public class Main {
//        public static void main(String[] args) {
//            Animal animal = new Dog(); // 업캐스팅
//            Dog dog = (Dog) animal;    // 다운캐스팅
//
//            dog.sound();  // 출력: "Bark"
//            dog.wagTail(); // 출력: "Wagging tail"
//        }
//    }
//    여기서 Animal animal = new Dog();으로 업캐스팅된 animal 객체를 다시 Dog 타입으로 다운캐스팅하여, Dog 클래스의 메서드인 wagTail()을 호출할 수 있게 됩니다.
//    업캐스팅과 다운캐스팅의 관계:
//    업캐스팅은 자식 클래스 객체를 부모 클래스 타입으로 변환하며, 부모 클래스의 멤버만 접근 가능하게 합니다.
//    다운캐스팅은 업캐스팅된 객체를 다시 자식 클래스 타입으로 변환하여 자식 클래스의 멤버에 접근할 수 있게 합니다.
//    다운캐스팅을 하기 위해서는 먼저 업캐스팅이 이루어져야 합니다. 업캐스팅 없이 다운캐스팅은 의미가 없기 때문에, 업캐스팅이 먼저 발생한 후에 다운캐스팅이 이루어집니다.
//}
