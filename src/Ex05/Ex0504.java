package Ex05;

import java.util.Arrays;

public class Ex0504 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10]; // 길이가 10인 배열
        int[] iArr2 = new int[10];
        int[] iArr3 = {100, 95, 80, 70, 60}; // 배열 초기화
        char[] chArr = {'a', 'b', 'c', 'd'}; // char 사용

        System.out.println("iArr1 번 문제");
        for( int i = 0; i < iArr1.length; i++ ) {
            iArr1[i] = i + 1; // 1~ 10 의 숫자를 순서대로 배열에 넣는다
        }
        for( int i = 0; i < iArr1.length; i++ ) {
            System.out.print(iArr1[i]+ ",");
        }
        System.out.println();
        System.out.println("iArr2 번 문제");
        for (int i=0; i < iArr2.length ; i++ ) {
            iArr2[i] = (int)(Math.random()*10) + 1; // 1~10의 값을 배열에 저장
            // 랜덤으로 숫자를 넣는데 최대는 10이고 0부터 시작이니까 +1

        }
        System.out.println(Arrays.toString(iArr2));

        System.out.println("iArr3 번 문제");

        System.out.println(iArr3);// 배열을 초기화했어도 그냥 출력하면 안된다
        System.out.println(Arrays.toString(iArr3));

        System.out.println("chArr 문제");
        System.out.println(chArr);
        System.out.println(Arrays.toString(chArr)); // Arrays 사용하면 배열에 담겨져있는 모양으로 나온다
    }
}
