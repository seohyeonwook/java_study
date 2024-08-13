package Ex05;

public class Ex0501 {
    public static void main(String[] args) {
        // 배열 - 같은 타입의 여러변수를 하나의 묶음으로 다루는 것
        int[] score = new int[5]; // 같은 타입만 저장된다
        System.out.println(score);
        // 배열도 변수처럼 선언과 생성

        int[] a; // 선언(참조변수)
        a= new int[5]; // 생성(저장공간 5개)
        int[] b = new int[5]; // 선언과 생성
        // 배열의 인덱스 - 각 요소에 자동으로 붙는 일련 번호 0 번부터 시작 [5]면 0,1,2,3,4까지
        b[3] = 100;
        System.out.println(b[3]);
    }
}
