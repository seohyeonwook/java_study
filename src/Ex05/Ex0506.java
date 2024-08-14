package Ex05;

import java.util.Arrays;

public class Ex0506 {
    public static void main(String[] args) {
        String [] name = new String[3]; //3개의 문자열을 담을 수 있는 배열을 생성한다
        // 참조형이라 기본은 null이 들어간다
        String [] a = {"kim", "park","wook"};
        System.out.println(Arrays.toString(a));

        for(int i = 0; i < 10; i++) { //랜덤 뽑기
            int tmp = (int)(Math.random()*3);
            System.out.println(a[tmp]);
        }
    }
}
