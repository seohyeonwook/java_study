package Ex07; // ArrayList

import java.util.ArrayList;
import java.util.Collections;

public class Ex0716 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10); // 10개짜리에다가
        // ArrayList에는 객체만 저장 가능
        // autoboxing에 의해 기본형이 참조형으로 자동 변환
        list1.add(new Integer(5));
        list1.add(5);//간단히 이렇게 적으면 자동변환 된다 위에꺼랑 똑같다
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3)); // 이것들 순서대로 저장 오브젝트 배열이라 주소값 참조

        ArrayList list2 = new ArrayList(list1.subList(1,4)); // 1부터 4까지 들어가는데 4는 빼고 배열 1,2,3 이 들어간다
        print(list1, list2);


        list2.add("B");
        list2.add("C");
        list2.add(3, "A"); // 인덱스 번호 위치 지정 가능
        print(list1, list2);

        list2.set(3, "AA"); // 바꾼다 A를 AA로 변경
        print(list1, list2);

        list1.remove(5);
        print(list1, list2);

        //  list2에서 list1에 포함된 객체들을 삭제한다.
        for(int i= list2.size()-1; i >= 0; i--) {
            if(list1.contains(list2.get(i)))
                list2.remove(i);
        }
        print(list1, list2);
    } // main의 끝

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1:"+list1);
        System.out.println("list2:"+list2);
        System.out.println();
    }
} // class

