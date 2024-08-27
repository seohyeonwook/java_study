package ch.ch08;

public class ElectronicDeviceMain {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        Computer computer =new Computer();



        computer.showDeviceState();
        smartPhone.setPowerOn();
        smartPhone.showDeviceState();

    }
}
