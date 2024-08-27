package ch.ch08;

public class SmartPhone extends ElectronicDevice {
    String model;
    String color;

    void call() {
        System.out.println("전화 연결을 시도합니다");
    }

    @Override
    void showDeviceState() {
        super.showDeviceState();
    }
}
