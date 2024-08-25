package sp.ch_1;

public class Scores { // 코드 재활용
    public static void main(String[] args) {

        int studentAClass1 = 50;
        int studentAClass2 = 30;
        int studentAClass3 = 45;

        int studentBClass1 = 60;
        int studentBClass2 = 65;
        int studentBClass3 = 66;

        double averageAClass = calculateAverage(studentAClass1,studentAClass2,studentAClass3);
        System.out.println(averageAClass);

        System.out.println("---------------------------------------");

        double averageBClass = calculateAverage(studentBClass1, studentBClass2, studentBClass3); // 코드 재활용 - 하나의 메서드로 계산 한다
        System.out.println(averageBClass);

        System.out.println("---------------------------------------");

        System.out.printf("A학급 평균점수는 %f , B학급 평균점수는 %f \n", averageAClass,averageBClass);

    }

    static double calculateAverage(int a, int b, int c) {
        int sumAClass = a + b + c;
        return sumAClass/(double)3;
    }
}
