package ch.ch08;

public class Computer extends ElectronicDevice { // 상속받아서 일렉트로닉 속성들 사용가능

    String cpu; // 변수 추가
    int ram;

    void playGame() {
        System.out.println("pc게임을 합니다.");
    }

    @Override
    void showDeviceState() {
        System.out.println("컴퓨터");
        super.showDeviceState();
    }
}
