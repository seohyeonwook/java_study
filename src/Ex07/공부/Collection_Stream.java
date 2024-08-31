//package Ex07.공부;
//
//public class collection {
//    주요 차이점
//
//    역할과 목적:
//
//    컬렉션 프레임워크는 데이터를 저장하고 관리하기 위한 상자와 같은 역할을 합니다.
//    리스트나 맵 같은 자료구조에 데이터를 넣고, 꺼내서 수정하거나 확인할 수 있어요.
//    Stream API는 데이터를 가공하거나 변형하는 작업 도구와 같아요.
//    데이터를 저장하지 않고, 데이터를 처리하는 다양한 작업(필터링, 변환 등)을 쉽게 할 수 있게 해줍니다.
//
//    사용 방식:
//
//    컬렉션 프레임워크는 데이터를 직접 다루고, 보관하고, 꺼내 쓰는 방식으로 작동해요. for 문을 써서 하나씩 데이터를 처리합니다.
//
//    Stream API는 데이터를 "흐름"처럼 다루며, 데이터를 가공하는 여러 단계를 연결해서 한 번에 처리합니다.
//    데이터를 손대지 않고, 흐름을 따라 작업합니다.
//
//    병렬 처리:
//
//    컬렉션 프레임워크는 보통 한 번에 하나씩 처리해요.
//    Stream API는 쉽게 병렬 처리를 할 수 있어, 여러 데이터를 동시에 처리할 수 있습니다.
//
//            사용 예시
//
//    컬렉션 프레임워크 사용 예시
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//    public class CollectionExample {
//        public static void main(String[] args) {
//            // ArrayList 사용: 데이터를 저장
//            List<String> names = new ArrayList<>();
//            names.add("Alice");
//            names.add("Bob");
//            names.add("Charlie");
//
//            // 데이터를 하나씩 꺼내서 출력
//            for (String name : names) {
//                System.out.println(name);
//            }
//        }
//    }
//    이 예시에서는 ArrayList를 사용해서 이름들을 저장하고, for 문으로 하나씩 꺼내서 출력해요.
//
//    Stream API 사용 예시
//
//import java.util.Arrays;
//import java.util.List;
//
//    public class StreamExample {
//        public static void main(String[] args) {
//            // 리스트 생성
//            List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
//
//            // Stream을 사용하여 'A'로 시작하는 이름만 출력
//            names.stream()
//                    .filter(name -> name.startsWith("A"))  // 'A'로 시작하는 이름만 고르기
//                    .forEach(System.out::println);        // 출력하기
//        }
//    }
//    이 예시에서는 Stream API를 사용해서 A로 시작하는 이름만 고르고 바로 출력해요. 데이터를 저장하지 않고 바로 처리하는 흐름입니다.
//
//    요약
//    컬렉션 프레임워크: 데이터를 담고 직접 관리하는 것.
//    Stream API: 데이터를 다루는 도구로, 쉽게 가공하고 병렬 처리도 가능하게 해줍니다.
//    컬렉션은 데이터를 모아두고, Stream은 그 데이터를 멋지게 가공하는 도구라고 생각하면 쉬워요!
//}
