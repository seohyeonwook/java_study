package ch02;

public class Variable {
    public static void main(String[] args) {
        int date = 20231229; //int 라고 하는 공간을 마련해 / date - 공간의 이름 / = 대입을 해라
                             // 변수(date)가 주소(20231129)를 가르키고 있다

        double date2= date;
        int date3 = (int) date2;// 실수는 정수를 포함하지만 정수는 실수를 포함하지 못함
        // 그렇기 때문에 형변환 명을 ()적어줘야함
        // 문자 -> 정수 -> 실수   // 문자도 아스키코드로 인해서 정수로 표현 가능하기때문에

        char a ='1'; // 문자 1
        int b = a;   // 정수보다 하위라서 형변환 가능
        double c = b;// 업캐스팅

        System.out.println(date + 1);
        System.out.println(date + 2);
        System.out.println(date2 + 1);
        System.out.println(20231229 + 4);
        System.out.println(20231229 + 5);
        System.out.println(20231229 + 6);
        System.out.println(20231229 + 7);
    }
}
