package Ex05;

import java.util.Arrays;

public class Ex0507 {
    public static void main(String[] args) {
        //2차원 배열
        int[][] score = new int[4][3]; // 4행 3열
        int[][] score1 = {
                {1, 2, 3},
                {4, 5, 6}
        };// 2차원 배열의 생성과 초기화
        for (int i = 0; i < score1.length; i++) { // score1의 length는  2 (0~1)
            for (int j = 0; j < score1[i].length; j++) { // 스코어 i는 0에 {1,2,3} 1에 {4,5,6}이 length는 3
                System.out.print(score1[i][j] + " "); //  2 * 3 만큼 돈다
             }
            System.out.println(); // 한 행이 끝나면 줄 바꿈
        }

    }

}
