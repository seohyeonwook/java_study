public class Ex0409 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            // 2중 for 문 은 괄호안에 for가 다 돌고 다시 밖에 for 가 다시 돈다 ****중요**이것만 이해하면 됨
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("----------------------");
        //별 10칸에 5줄을 만드려면 제일 쉬운방법은
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        //for문 사용해 보자
        System.out.println("----------------------");
        for(int i = 1; i <= 5; i++) {
            System.out.println("**********");
        }
        System.out.println("----------------------");
        //for문 응용 해보자 (2중)
        for(int j = 1; j <= 5; j++){
            for(int i = 1; i <= 10; i++) {
                System.out.print("*");
            }
            System.out.println(); // 항상 기억하자 순서대로 내려온다
        }
        System.out.println("----------------------");

        for(int i = 2; i <= 9; i++ ) { // 안쪽 for문을 9번 반복한다
            for(int j = 1; j <= 9; j++) {
                System.out.println( i + "*" + j + "=" + i*j);
            }
            System.out.println();
        }
    }
}
