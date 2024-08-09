import java.util.Scanner;

public class Ex0402 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 하나 입력하세요 .>");
        int input = scanner.nextInt();//화면틀 통해 입력받은 숫자를 input에 저장

        if(input == 0) {
            System.out.println("입력하신 숫자는 0입니다.");
        } else {
            System.out.println("입력하신 숫자는 0이 아닙니다.");
        }
    }
}
