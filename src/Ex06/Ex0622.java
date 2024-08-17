package Ex06;// 매개변수가 있는 생성자
class Car {
    String color;		// 색상
    String gearType;	// 변속기 종류 - auto(자동), manual(수동)
    int door;			// 문의 개수

    Car() {}

    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
}

public class Ex0622 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color    = "black";
        c1.gearType = "nonono";
        c1.door = 4;               // 원래 이렇게 일일이 초기화를 해줘야하지만

        Car c2 = new Car("white", "auto", 4); // 매개변수를 사용하면 한줄로 코드가 간결해진다

        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
    }
}

