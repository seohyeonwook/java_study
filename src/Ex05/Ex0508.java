package Ex05;

public class Ex0508 {
    public static void main(String[] args) {
        // 문자열 = 여러개 문자 나열 String 클래스는 char[] 와 메서드 기능을 결합한것
        // String 클래스 = char[] + 메서드(기능)
        String a = "a";
        String b = "b";

        System.out.println(a+b);

        String str = "basdfsaf";

        char ch = str.charAt(3);// 문자열 해당 위치에 있는 문자 반환
        System.out.println(ch);

        int c = str.length();// 문자열 길이를 반환
        System.out.println(c);

        String tmp = str.substring(1,4);// 해방범위 문자열을 반환 마지막 4는 출력안됨 그래서 1,4면 1~3까지 나옴
        String tmp2 = str.substring(1);// to 생략하면 1부터 끝까지
        System.out.println(tmp);




    }
}
