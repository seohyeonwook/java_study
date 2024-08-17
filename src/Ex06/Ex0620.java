package Ex06;// 생성자 - 인스턴스가 생성될 때마다 호출되는 "인스턴스 초기화 메서드"(iv묶음)
// 생성자 - 이름이 클래스 이름과 같아야 한다 / 리턴값이 없다.(void안붙임)
//          모든 클래스는 반드시 생성자를 가져야 한다.
class Time1 {
    int hour;
    int minute;
    int second;
}
public class Ex0620 {
    public static void main(String[] args) {
        Time1 t = new Time1();
        t.hour = 12; // 이게 초기화
        t.minute = 34;
        // Time1 t = new Time1(12,34); // 근데 저렇게 따로안하고 바로이렇게 넣고싶다 = 생성자 호출
        // 생성자 호출을 하려면 생성자를 추가 해줘야 한다
    }
}
