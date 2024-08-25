package sp.ch_4;

// 손님 현금: 5만원
// 매상 : 100만원
public class CoffeeShopSituation { // 여기서 실행 - 실행클래스 나머지는 일반 클래스
    public static void main(String[] args) {
        // 인스턴스화
        Customer customer = new Customer(); // Customer 객체 생성
        customer.setCashAmount(50_000); // setter만듬 - privae으로 접근제한 걸어둬서
        // 손님 현금: 5만원 설정

        Cashier cashier = new Cashier(); // Cashier 객체 생성
        cashier.setSalesAmount(1_000_000);
        // 매상 : 100만원 설정

        Barista barista = new Barista(); // Barista 객체 생성
        Coffee coffee = new Coffee(); // Coffee 객체 생성


        // String coffeeName = "아메리카노";  // String coffeeName = "아메리카노";: 단순 변수에 문자열 저장.
        // "아메리카노"라는 값을 직접 변수에 저장하는 것이고, coffee 객체와는 관계가 없습니다.

        coffee.setCoffeeName("아메리카노"); // coffee.setCoffeeName("아메리카노");: 객체의 속성 변경.
        String coffeeName = coffee.getCoffeeName();
        // coffee 객체의 상태(coffeeName)를 변경하고, 그 값을 다시 가져와 coffeeName 변수에 저장

        boolean isTakeOut = true;

        // 로직 시작
        customer.askCoffee(coffeeName); // 1. 손님은 캐시어에게 아메리카노가 얼마인지 물어본다

        long price = cashier.checkCoffeePrice(coffeeName); // 2. 캐시어는 아메리카노가 얼마인지 확인
        cashier.replayCoffeePrice(coffeeName, price); // 3. 가격을 답변해준다

        long cash = customer.withDrawCash(price); // 4. 손님은 자신의 현금에서 돈을빼서
        customer.orderCoffee(coffeeName, isTakeOut); // 5. 아메리카노를 테이크아웃으로 주문한다

        cashier.addAmount(cash); // 6. 캐시어는 자신의 매상에 돈을 더한다
        cashier.sayOrder(coffeeName); // 7. 주문확인을 알린다

        barista.noticeOrder(coffeeName); // 8. 바리스타는 주문 확인을 하고

        Coffee coffee1 = barista.makeUpCoffee( coffee ); // 9. 아메리카노 커피 만든다
        barista.sayCoffeeReady(coffee1); // 10. 커피 완성을 알린다

        }


    }



//그러니까 coffee.setCoffeeName("아메리카노");가
// setCoffeeName을 아메리카노로 바꾸는거 맞지 근데 왜 다른곳에서 사용을 못한다는거야?

//ChatGPT의 말:
//ChatGPT
//네, 맞습니다. coffee.setCoffeeName("아메리카노");는 coffee 객체의 coffeeName 속성을 "아메리카노"로 설정하는 것입니다.
//
//하지만 이 속성을 다른 곳에서 사용하려면, coffee.getCoffeeName()이라는 메서드를 호출해서 coffee 객체에 저장된 값을 가져와야 합니다.
//
//만약, 특정 메서드나 로직에서 "아메리카노"라는 값을 직접 변수로 사용하려면, 그 값을 담을 변수가 필요합니다.
// 예를 들어, 다른 메서드에 "아메리카노"라는 문자열을 전달하거나 비교하고 싶다면, !!!!변수로 정의!!!!!해야 합니다.
//
//        java

//coffee.setCoffeeName("아메리카노"); // coffee 객체에 "아메리카노" 저장
//
//// 이 값은 아래처럼 직접 꺼내서 사용할 수 있음
//String coffeeName = coffee.getCoffeeName(); // "아메리카노" 값을 변수로 가져옴
//customer.askCoffee(coffeeName); // 이제 다른 메서드에 전달

//결론:
//        coffee.setCoffeeName("아메리카노");는 coffee 객체의 속성을 설정합니다.
//다른 곳에서 이 값을 쓰려면, coffee.getCoffeeName()으로 값을 꺼내거나, 따로 변수를 만들어야 합니다.
// 그렇지 않으면 직접 사용하지 못합니다.