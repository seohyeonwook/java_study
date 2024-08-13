package Ex05;

public class Ex0505 {
    public static void main(String[] args) {
        // 총합 평균 내기
        int sum = 0;
        float average = 0f; // 변수 초기화

        int[] score = { 100, 88, 55, 22, 44 };

        for(int i=0; i < score.length; i++ ) {
            sum += score[i]; // 합계
        }
        average = sum / (float) score.length; // 합계를 float으로 형변환해서 평균

        System.out.println("총점: " + sum);
        System.out.println("평균: " + average);
    }
}
