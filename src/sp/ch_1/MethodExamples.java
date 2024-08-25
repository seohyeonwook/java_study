package sp.ch_1;

public class MethodExamples {// 매개변수 와 리턴
    public static void main(String[] args) {
        char ch = 'A';
        int decode = toUnicode(ch);// 1. 매개변수 담아서 호출하고 리턴받은 값을 decode에 저장
        System.out.println(decode);

        System.out.println("------------------------------------");

        int myInt1 = 10;
        int myInt2 = 5;
        int result = sumAndMultiplyFour(myInt1,myInt2); // 값을 담아야 하기때문에 리턴이 필요하다 라고 생각하자
        System.out.println(result);

        System.out.println("------------------------------------");

        String res = sayHello();
        System.out.println(res);

        System.out.println("------------------------------------");

        printHello("안녕하세요"); // 매개변수는 있지만 반환값이 없을 경우 리턴값을 담을 변수가 따로 필요없다

        System.out.println("------------------------------------");

        printHi();


    }
    static int toUnicode(char ch) { // 1. int 로 호출 했으니까 반환값 int 로해서 return에서 char 형변환
        return (int)ch;
    }

    static int sumAndMultiplyFour(int a, int b) {
        return ( a + b ) * 4; // 괄호 먼저 계산
    }

    static String sayHello() {
        return "Hello";
    }

    static void printHello(String str) {
        System.out.printf("함수안 에서 실행 합니다 %s\n",str);
    }

    static void printHi() {
        System.out.println("HI");
    }


}
