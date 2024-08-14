package Ex05;

import java.util.Arrays;

public class Ex0509 {
    public static void main(String[] args) {
        int[] arr ={0,1,2,3,4};
        int[][] arr2 ={
                {1,3,4,5},
                {23,4,5,}
        };
        System.out.println(Arrays.toString(arr)); // 1차원 배열
        System.out.println(Arrays.deepToString(arr2)); //2차원 배열
//        System.out.println(Arrays.equals(arr,arr2);   equals 할때는 둘다 배열이여야하고 둘다 차원과 타입이 일치하여야한다

    }
}
