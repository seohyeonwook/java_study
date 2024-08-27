package ch.ch07;

public class ArrayMain01 {
    public static void main(String[] args) {
        // int[] array  =   new--- (생성자 new)
        // 자료형  변수  대입   값
        //int[] []배열 - 정수배열 자료형만 들어가야함
        //배열을 만들때는 무조건new가 들어감 new = 생성 = 힙메모리 할당 = 메모리 공간 빌리는것(동적 메모리 할당)
        //동적 ㅁㅔ모리 -> 빌려서 쓰고 줄게
        //배열은 크기를 조절할수 없다 -> 새로만들고 옮기면 된다(1)
        //자료형에는 다 배열이 들어간다 배열안에도 배열이있다
        // 배열(Array) 사용이유 : !순서대로! 데이터를 묶어서 사용하기 위해서
        // 비슷한 변수명이라도 메모리에 순서없이 저장하기때문

        int num1 = 10;
        int num2 = 20;
        int [] numArray = new int [3];
        System.out.println(numArray);// 배열은 0부터 시작 3이면 0,1,2
                                        // [3]이라고 해서 0,1,2가 나오는게 아님 주소값이 나옴

        numArray[0] = 10 ; // 첫번째 에 10저장
        System.out.println(numArray[0]);  // 출력
                                            // Array출력은 그냥이랑 다르다 모양 확인하자



    }
}
