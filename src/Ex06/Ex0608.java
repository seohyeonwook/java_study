package Ex06;
    // 변수의 종류 - 선언위치에따라 (3)가지로 나뉜다

public class Ex0608 { // 클래스 안에는 영역이 두가지가 있다
    // 클래스 영역 - 선언문만 가능하다
    // int iv; - 인스턴스 변수 (1) - 객체 = iv 묶어둔것 - 객체가 생성되어야지만 사용가능하다
    // static int cv; - 클래스 변수(static변수, 공유변수) (2) - iv앞에다 static붙인거다
    public static void main(String[] args) {
        // 메서드 영역 - 메서드 선언(정의)만 가능하다

        // int lv = 0; - 지역 변수 (3) - 메서드 종료시 제거 안에서만 적용 가능


        // static을 언제 붙여야 할까?? 속성(멤버 변수) 중에서 공통속성에 static을 붙인다.
        class Card {
            // ex) -
            // 인스턴스 변수( 개별 속성 ) 무늬  - String kind;                -- iv
            //                        숫자 - int number;
            // 클래스 변수 ( 공통 속성 ) 폭 - static int width = 100;        -- cv
            //                        높이 - static int height = 250;
            // 0609 에 예제문제로 풀어둠
        }

    }
}
