package Ex07;// 람다식 - 함수(메서드) 를 간단한 식으로 표현하는 바업
            // 익명객체 - 반환타입과 이름 x



public class Ex0717 {
    public static void main(String[] args) {

    }
    // 1. 메서드의 이름과 반환타입을 제거하고 -> 를 블록{} 앞에 추가한다
    int max(int a , int b) {
        return a > b ? a: b;
        // 이걸 1 - 1
    }
//    (int a, int b) -> return a > b? a: b;  // 이렇게 1 - 2

    // 2. 반환값이 있는경우 식이나 값만 적고 return문 생략 가능(끝에 ; 안붙임)
    //  (int a, int b) -> return a > b? a: b;( 1 - 2 )  ->> (int a, int b) -> a > b ? a : b // 1 - 3

    // 3. 매개변수의 타입이 추론 가능하면 생략가능 ( 대부분의 경우 생략가능)
    // (int a, int b) -> a > b ? a : b // ( 1 - 3 )  ->> ( a,  b) -> a > b ? a : b // 1 - 4 !!
}
