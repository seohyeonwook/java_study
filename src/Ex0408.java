public class Ex0408 {
    public static void main(String[] args) {
        int sum = 0; // 합계 저장하기위한 변수 선언
        for(int i = 1; i <= 5; i++) {
            sum += i; //sum = sum + i;
            System.out.println(sum); // 어쨋든 괄호 안에 5번 돈다. 그게 반복문
            System.out.printf("1부터 %2d 까지의 합: %2d%n", i, sum);
        }
    }
}
