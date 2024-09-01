//package Ex07.공부;
//
//public class New_and_Collection {

//    객체 생성 new랑 컬렉션은 같은거야?? 그냥 컬렉션은 new에 리스트를 넣은거라고 생각하면 돼?
//

//    new와 컬렉션은 같은 것이 아니고, 서로 다른 개념이에요. 쉽게 설명해볼게요!
//
//            new 키워드와 컬렉션의 차이

//     new 키워드:
//
//    new는 새로운 객체를 만들 때 사용하는 키워드예요.
//    예를 들어, new ArrayList<>()는 새로운 ArrayList 객체를 메모리에 생성하는 거예요.
//    new는 단순히 객체를 생성하는 도구입니다.


//     컬렉션(Collection):
//
//    컬렉션은 여러 데이터를 모아서 관리할 수 있는 자료구조입니다.
//    대표적인 예로 List, Set, Map이 있어요.
//    컬렉션을 생성할 때 new를 사용해서 그 자료구조의 객체를 만드는 거예요.
//    예를 들어 설명하면


//    List<String> fruitsList = new ArrayList<>();

//      설명
//    new ArrayList<>(): 새로운 ArrayList 객체를 만드는 것.
//    List<String> fruitsList: ArrayList라는 객체를 담을 수 있는 변수를 선언한 것.
//    이 변수가 컬렉션의 역할을 해서, 여러 데이터를 넣고 빼고 할 수 있게 되는 거예요.

//      요약
//      new: 새 객체를 만드는 도구.
//    컬렉션: 데이터를 모아 관리하는 자료구조 (예: 리스트, 셋).
//            new ArrayList<>()는 "새로운 리스트를 만든다"는 뜻으로, new가 리스트를 만드는 과정을 담당합니다.
//    컬렉션은 데이터를 다루는 구조이고, new는 그 구조를 만들 때 쓰이는 키워드라고 생각하면 돼요! new는 생성이고, 컬렉션은 그 생성된 결과물이에요.
//
//
//
//
//
//
//    나의 말:
//    List<String> fruitsList = new ArrayList<>(); 근데 이 컬렉션 자체는 이미 new한걸 포함 한거지??


//    네, 맞아요!
//
//    List<String> fruitsList = new ArrayList<>(); 이 코드에서는 컬렉션을 만드는 과정과 new 키워드를 사용하는 과정이 합쳐진 거예요.
//
//    자세히 설명하자면:
//    List<String> fruitsList;
//
//    fruitsList라는 이름의 변수를 선언하는 부분이에요.
//    이 변수는 List 타입으로, 여러 개의 String을 담을 수 있는 구조를 가리킬 수 있습니다.
//      = new ArrayList<>();
//
//          new ArrayList<>();는 ArrayList라는 객체를 새로 만드는 부분이에요.
//            new 키워드가 실제로 메모리에 새로운 ArrayList 객체를 생성합니다.
//            합쳐서:
//
//    List<String> fruitsList = new ArrayList<>(); 이 전체 코드는:
//    ArrayList라는 새로운 리스트 객체를 만들고(new ArrayList<>()),
//    이 새로운 리스트 객체를 fruitsList라는 변수에 담는 것(=).


//    정리
//      new ArrayList<>(): 이 부분이 실제로 객체를 생성하는 거예요.
//    List<String> fruitsList: 이 부분은 ArrayList 객체를 담을 변수를 정의하는 거고요.
//    따라서, 컬렉션 자체는 new를 사용해서 만들어진 객체를 담은 변수라고 이해하면 돼요.
//    그래서 맞아요, 컬렉션은 new를 포함한 것이고, 그 결과 만들어진 객체를 다루는 거죠!
//}
