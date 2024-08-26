package Ex06.생성자보충;
class Car3 {
    String color;
    int speed;

    // 생성자
    Car3(String color, int speed) {
        this.color = color;  // 색상 초기화
        this.speed = speed;  // 속도 초기화
        System.out.println("생성자 호출");
    }
}

public class Ex062001 {
    public static void main(String[] args) {
        // Car 객체 생성
        Car3 myCar = new Car3("Red", 100);

        // 생성자 호출이 자동으로 이루어짐
        System.out.println("Car color: " + myCar.color);
        System.out.println("Car speed: " + myCar.speed);
    }
}

