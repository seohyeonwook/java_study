package ch.ch07;

public class ArrayMain02 {
    public static void main(String[] args) {
        String[] names = new String[5];//배열은 책 꽃이를 만든거다
        names[0] = "최수현";
        names[1] = "전주환";
        names[2] = "서창현";
        names[3] = "예홍렬";
        names[4] = "심재원";

        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
