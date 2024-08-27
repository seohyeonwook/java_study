package ch.ch08; //상속

public class ElectronicDevice {
    boolean powerState;

    void setPowerOn() {
        powerState = true;
    }

    void setPowerOff() {
        powerState = false;
    }

    void showDeviceState() {
        System.out.println("전원상태: " +((powerState) ? "켜짐" : "꺼짐" ));
                                // 삼항 연산자  조건식 ? 참일 때의 값 : 거짓일 때의 값;
    }
    // 1개의 변수와 3개의 메소드
}
