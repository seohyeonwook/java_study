package Ex03;

public class Ex0302 {
    public static void main(String[] args) {
        int i = 5;
        int j = 0;

        j= i++;
        System.out.println("j = i++; 실행 후, i=" + i +",j=" +j);
        // 여기서 i++는 후위 증가 연산자입니다. 이 연산자는 현재 i의 값을 먼저 j에 할당한 후, i의 값을 1 증가시킵니다.
        // 즉, j에는 i의 초기 값 5가 할당되고, 이후 i는 6으로 증가합니다.
    }
}
