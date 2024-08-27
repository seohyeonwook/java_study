package ch.ch07;

public class PhoneArrayMain {
    public static void main(String[] args) {
        Phone[] phones = {
                new Phone("삼성", "갤럭시"),
                new Phone("애플", "아이폰"),
                new Phone("샤오미", "MiPhone"),
        };
        System.out.println(phones.toString());// 주소값
        System.out.println(phones[0].toString()); // 특정 배열을 골라야하는걸 항상 잊지말자

        for(Phone phone : phones ) {
            System.out.println(phone.toString()); // 향상된 for문
        }
    }
}
