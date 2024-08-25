package Ex07.Ex0701;

class Tv { // 부모 멤버 5개
    boolean power; // 전원상태(on/off)
    int channel;	// 채널

    void power() {
        power = !power; }
    void channelUp() {
        ++channel;      }
    void channelDown() {
        --channel;      }
}
class SmartTv extends Tv {  // 부모멤버 5개 + 자식멤버 2개  = 5개의 멤버 자기꺼처럼 사용 가능
    // CaptionTv는 Tv에 캡션(자막)을 보여주는 기능을 추가
    boolean caption;     // 캡션상태(on/off)
    void displayCaption(String text) {
        if (caption) {   // 캡션 상태가 on(true)일 때만 text를 보여 준다.
            System.out.println(text);
        }
    }
}
public class Ex0701 {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();

        stv.channel = 10; // 조상 클래스로부터 상속받은 멤버
        stv.channelUp();  // 조상 클래스로부터 상속받은 멤버
        System.out.println(stv.channel);

        System.out.println(stv.caption);
        stv.displayCaption("boolean 기본값 false");
        stv.caption = true; // 캡션을 true로 바꾼다
        stv.displayCaption("boolean 기본값 true로 바꿈");

    }
}
//SmartTv는 메인 메서드에서 new해서 사용이 가능한건 알겠는데 Tv클래스는 메인메서드에서new한게 없잖아

//ChatGPT의 말:
//ChatGPT
//SmartTv 클래스가 Tv 클래스를 상속받았기 때문에, SmartTv를 new 하면 자동으로
// Tv 클래스도 함께 사용 가능해집니다.
//
//이걸 쉽게 설명하면:
//
//        1. 상속이란?
            //상속은 자식 클래스가 부모 클래스의 내용을 물려받는 것과 같아요.
            // 부모 클래스는 자식 클래스가 태어날 때 자동으로 그 안에 들어가요.

//        2. Tv와 SmartTv의 관계
            //SmartTv는 Tv의 자식이에요. 그래서 SmartTv를 만들면, 그 안에 Tv의 모든 기능도 자동으로 포함돼요.
            //Tv 클래스는 전원 상태를 관리하거나 채널을 변경하는 기능이 있어요.
            //SmartTv는 이런 Tv의 기능에 자막을 보여주는 기능을 추가한 거예요.

//3. SmartTv를 new 하면?
//SmartTv stv = new SmartTv(); 이렇게 하면 SmartTv 안에 있는 Tv의 기능도 함께 준비돼요.
//그래서 stv.channel = 10;처럼 Tv의 기능을 SmartTv로 사용할 수 있는 거예요.

//        4. 정리
//SmartTv를 만들 때(new SmartTv()) Tv도 함께 준비돼서 Tv의 기능을 바로 쓸 수 있는 거예요.
// 그래서 Tv를 따로 new 할 필요가 없어요.
//        이렇게 해서, SmartTv를 만들면서 Tv도 함께 사용하는 겁니다.
//        Tv 클래스는 SmartTv의 일부로 포함되어 있어, SmartTv를 만들면
//        Tv의 기능도 자동으로 사용할 수 있는 거예요.
//
//
//
//
//
//나의 말:
//그럼 반대로 Tv를 new하면 SmartTv new안해도 돼?

//ChatGPT의 말:
//ChatGPT

//아니요, 반대로는 안 돼요.
//
//Tv 클래스는 SmartTv의 부모 클래스이지만,
// 부모 클래스는 자식 클래스의 내용을 알지 못해요.
// 그래서 Tv를 new 하면 Tv 클래스의 기능만 사용할 수 있고, SmartTv의 기능은 사용할 수 없어요.
//

//예를 들어 볼게요:
//java
//코드 복사
//Tv tv = new Tv();
//이렇게 하면 Tv의 전원 상태나 채널 관련 기능만 사용할 수 있어요.
// 하지만 Tv는 자막을 표시하는 caption 기능이 없기 때문에, SmartTv의 자막 기능은 사용할 수 없어요.
//

//        반면에:
//java
//코드 복사
//SmartTv stv = new SmartTv();
//이렇게 하면 SmartTv와 Tv의 모든 기능을 다 사용할 수 있어요.
// SmartTv는 Tv를 상속받았기 때문에, Tv의 기능도 포함하고, 자막 기능 같은 추가 기능도 가지고 있어요.
//
//결론:
//SmartTv를 new 하면 Tv의 기능도 포함되지만,
//Tv를 new 하면 SmartTv의 기능은 포함되지 않아요.
