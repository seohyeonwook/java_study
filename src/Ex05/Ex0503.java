package Ex05;

import java.util.Arrays;

public class Ex0503 {
    public static void main(String[] args) {
        // 배열의 초기화 (배열의 값을 저장하는것)
        int[] score = new int[5];
//        int[] score ={ 50, 60, 70, 80, 90 }; // 이렇게 만든다

        // 배열의 출력 - 배열의 이름으로는 출력이 안된다 하지만 char은 된다
        // 배열을 출력하고 싶으면 for문을 쓰거나 arrays를 사용한다

        int[] iAtt = { 100, 95, 80, 70,}; //출력하고 싶어서 프린트를 써도 안나온다
        System.out.println(iAtt);// [I@4232이렇게 이상하게 뜸 출력하고싶으면

        for(int i= 0; i < iAtt.length; i++) {
            System.out.println(iAtt[i]);
            // 1번 for문 사용
        }
        System.out.println("---");

        System.out.println(Arrays.toString(iAtt)); // ctrl + shift + o 누르면 자동으로 import
        // 2번 Arrays 사용 Arrays = 클래스 toString = Arrays 클래스에 있는 메서드



    }
}
