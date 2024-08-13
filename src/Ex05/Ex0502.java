package Ex05;

public class Ex0502 {
    public static void main(String[] args) {
        // 배열의 길이 - 매열이름.length
        int[] arr = new int[5]; //길이가 5인 int배열
        int tmp = arr.length; // 값은 5이고 tmp에 5가저장된다
        // 배열은 한번 생성하면 그 길이를 바꿀수 없다
        // 메모리에 연속 공간이 필요한데 내가 한번 빌린곳
        // 뒤에 더 필요하다고 하여도 뒤에공간이 남아있는지없는지 모르니까
        int [] score = new int[5];
        score[3] = 300;
        for (int i = 0; i < score.length; i++) { // 배열 길이가 바뀌어도 아래에서 안바꿔도 되니까
            System.out.println(score[i]);
        }

    }
}
