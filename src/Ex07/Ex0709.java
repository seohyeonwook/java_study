package Ex07;// 캡슐화와 접근제어자
                // 접근제어자(캡슐화) 사용 이유 - 외부로부터 데이터를 보호하기 위해서
                // 예를 들어 public이면 누구나 다 와서 멤버 변수에 직접 접근해서
                // 데이터 보호가 안된다
                // private int hour; -iv 를 만들고 직접접근 막고
//                  public메서드를 만들어서 메서드로 간접 접근하게끔
                // get set 사용 하는 법 알아야함 private은 get set필수


class Time {
    int hour;
    private int minute;
    int second;

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
}

public class Ex0709 {
    public static void main(String[] args) {
        Time t = new Time();
        t.hour = 100;
        System.out.println(t.hour);

//        t.minute = 100; // 직접 접근불가
        t.setMinute(100);
        System.out.println(t.getMinute()); // set get 사용해서 수정하고 가져오기

    }

}
