//package Ex07.공부;
//
//public class Collection_Prame {
//    자바의 컬렉션 프레임워크에서 자주 사용하는 List, Set, Map은 각각 데이터 관리 방식이 다른 자료구조입니다.
//    이 세 가지를 쉽게 설명하고, 각각의 예제를 보여드릴게요.
//
//1. List
//    설명: List는 순서가 있는 데이터의 모음입니다. 중복된 값을 허용하며,
//    인덱스를 사용하여 특정 위치의 요소에 접근할 수 있습니다.
//    예시: ArrayList, LinkedList 등이 있습니다.
//
//            List 예제 (ArrayList)
//
//import java.util.ArrayList;
//import java.util.List;
//
//    public class ListExample {
//        public static void main(String[] args) {
//            // ArrayList 사용: 순서가 있고 중복된 값 허용
//            List<String> fruits = new ArrayList<>();
//            fruits.add("Apple");
//            fruits.add("Banana");
//            fruits.add("Apple");  // 중복 허용
//
//            // 요소 출력
//            for (String fruit : fruits) {
//                System.out.println(fruit);
//            }
//        }
//    }
//    출력:
//    Apple
//            Banana
//    Apple
//
//
//2. Set
//    설명: Set은 중복을 허용하지 않는 데이터의 모음입니다. 순서가 없기 때문에 인덱스를 사용할 수 없고,
//    같은 값을 여러 번 넣을 수 없습니다.
//            예시: HashSet, TreeSet 등이 있습니다.
//
//            Set 예제 (HashSet)
//
//import java.util.HashSet;
//import java.util.Set;
//
//    public class SetExample {
//        public static void main(String[] args) {
//            // HashSet 사용: 중복된 값 허용 안 함, 순서 없음
//            Set<String> fruits = new HashSet<>();
//            fruits.add("Apple");
//            fruits.add("Banana");
//            fruits.add("Apple");  // 중복된 값 추가 시도
//
//            // 요소 출력
//            for (String fruit : fruits) {
//                System.out.println(fruit);
//            }
//        }
//    }
//    출력 (순서가 다를 수 있음):
//    Apple
//            Banana
//
//
//3. Map
//    설명: Map은 키(Key)와 값(Value)의 쌍으로 데이터를 저장합니다. 키는 중복될 수 없고,
//    각 키는 하나의 값에만 연결됩니다. 키를 사용하여 값을 빠르게 찾을 수 있습니다.
//            예시: HashMap, TreeMap 등이 있습니다.
//
//            Map 예제 (HashMap)
//
//import java.util.HashMap;
//import java.util.Map;
//
//    public class MapExample {
//        public static void main(String[] args) {
//            // HashMap 사용: 키와 값을 쌍으로 저장
//            Map<String, Integer> fruits = new HashMap<>();
//            fruits.put("Apple", 3);   // 키: "Apple", 값: 3
//            fruits.put("Banana", 2);  // 키: "Banana", 값: 2
//            fruits.put("Apple", 5);   // "Apple" 키의 값 덮어쓰기
//
//            // 요소 출력
//            for (String key : fruits.keySet()) {
//                System.out.println(key + ": " + fruits.get(key));
//            }
//        }
//    }
//    출력:
//    makefile
//    코드 복사
//    Apple: 5
//    Banana: 2
//    요약
//    List: 순서가 있고, 중복된 데이터를 허용하며 인덱스를 사용하여 접근 가능.
//    Set: 순서가 없고, 중복을 허용하지 않으며, 인덱스를 사용할 수 없음.
//            Map: 키와 값의 쌍으로 데이터를 저장하며, 키는 중복되지 않음.
//    이 자료구조들은 각기 다른 상황에서 데이터 관리에 유용하며, 상황에 맞게 적절히 선택하여 사용할 수 있습니다!
//}
