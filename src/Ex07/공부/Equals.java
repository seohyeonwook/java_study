//package Ex07.공부;
//
//public class Equals {
//    public Product findProductById(int id) {
//        for( Product product: products ) {
//            if(product.equals(id)) {  // ID는 int 타입이므로 == 사용
//                return product;
//            }
//        }
//        return null;
//    }
//    // equals오류뜬다
//    // 하지만 study_3에 Library 에 똑같은 기능을하는
//
//    public Book findBookByIsbn(String isbn) {
//        for(Book book : books) {
//            if(book.getIsbn().equals(isbn)) {  // ISBN은 String 타입이므로 equals() 사용 가능
//                return book;
//            }
//        }
//        return null;
//    }
//    // 이건 equals를 사용 했지만 작동이 된다 그럼 왜 안되는가??
//
//
//    equals() 메서드를 사용할 때 중요한 것은 비교하는 두 값의 타입이 맞아야 한다는 점입니다.
//    아래에서 왜 book.getIsbn().equals(isbn)은 작동하고,
//    왜 product.equals(id)는 작동하지 않는지 자세히 설명드리겠습니다.
//
//            1. equals() 메서드와 타입 비교
//
//    equals() 메서드의 기본 원리:
//    equals() 메서드는 두 객체가 동일한 타입이면서 동일한 값을 갖는지 비교할 때 사용됩니다.
//
//            2. findBookByIsbn()에서의 동작
//
//    isbn은 String 타입:
//            book.getIsbn()의 반환 타입은 String이고, 메서드 매개변수로 전달된 isbn도 String입니다.
//    String 클래스는 equals() 메서드를 잘 정의하고 있어서 두 문자열을 올바르게 비교할 수 있습니다.
//
//            3. findProductById()에서의 문제
//
//    equals() 사용 시 타입 불일치 문제:
//            product.equals(id)는 Product 객체와 int 타입의 ID를 비교하려고 시도하는데,
//    이 둘은 타입이 다르기 때문에 비교할 수 없습니다.
//    Product 클래스의 equals() 메서드는 Product 객체를 비교하도록 정의되어 있습니다.
//            → product.getId() 메서드를 사용하여 int 값으로 비교해야 합니다.
//
//    요약
//    equals()는 타입이 동일해야 사용 가능: String 타입끼리의 비교는 가능하지만, Product 객체와 int 타입의 비교는 불가능합니다.
//    정수 비교는 == 연산자 사용: 객체의 고유한 ID를 비교할 때는 해당 객체의 ID를 가져와서 == 연산자로 비교해야 합니다.
//
//            eg) 그럼 만약 id의 자료형을 String으로 바꾸면 equals 사용 가능해?
//
//    네, 맞습니다. 만약 id의 자료형을 String으로 바꾸면 equals() 메서드를 사용하여 두 String 값을 비교할 수 있습니다.
//    이는 String 클래스가 equals() 메서드를 적절하게 구현하여 두 문자열이 동일한지 비교할 수 있기 때문입니다.
//
//    하지만 !!! 그렇게 되면
//    public Product(String name, double price, int quantity) {
//        this.id = String.valueOf(nextId++); // ID를 String으로 설정
//        this.name = name;
//        this.price = price;
//        this.quantity = quantity;
//    }
//    이렇게 String을 int로 바꿔 줘야한다
//}
