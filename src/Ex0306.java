public class Ex0306 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;
        byte c = (byte) (a*b);// byte 의 범위를 넘어가기 때문에 출력 안됨
        // byte c = a*b 안되는 이유는 int형으로 자동 변환 되기 때문에
        System.out.println(c);
    }
}
