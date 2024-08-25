package Ex06;

public class Ex0612 {
    public static void main(String[] args) {
        // return- 실행중인 메서드를 종료하고 호출한 곳으로 되돌아간다.
        // 반환타입이 void가 아닌경우 반드시 return문 필요
        int result = max(3 , 6);
        System.out.println(result);

    }

    static int max(int a, int b) { // 만약 이렇게 호출하면 안된다
        if( a > b ) {
            return a;
        } else {
            return b;
        }
    }
    // static 메서드는 인스턴스를 생성하지 않고도 호출할 수 있습니다.
//    Java에서 static으로 선언된 메서드나 변수는 클래스 레벨에 속합니다.
//    즉, 해당 클래스의 인스턴스를 생성하지 않고도 클래스 이름을 통해 직접 접근할 수 있습니다.
//    반면, static이 아닌 메서드나 변수는 객체(instance)에 속하므로,
//    반드시 클래스의 인스턴스를 생성한 후에만 접근할 수 있습니다.


//  @@@@ static을 사용하는 경우
//
//    public class MainClass {
//        public static void main(String[] args) {
//            int result = max(3, 6); // 인스턴스 생성 없이 호출 가능
//            System.out.println("Max value: " + result);
//        }
//
//        public static int max(int a, int b) {
//            return (a > b) ? a : b;
//        }
//    }
// @@@@ static을 사용하지 않는 경우- 스태틱 사용 안하려면 인스턴스 생성해야한다
//
//    public class MainClass {
//        public static void main(String[] args) {
//            MainClass obj = new MainClass(); // 인스턴스 생성 필요
//            int result = obj.max(3, 6); // 인스턴스를 통해 호출
//            System.out.println("Max value: " + result);
//        }
//
//        public int max(int a, int b) { // 인스턴스 메서드
//            return (a > b) ? a : b;
//        }
//    }
}
