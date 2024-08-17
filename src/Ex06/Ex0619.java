package Ex06;// 오버로딩 - 한 클래스 안에 같은 이름의 메서드 여러 개 정의하는 것
                // 성립 조건 - 1. 메서드 이름이 같아야한다.
//                           2. 매개변수의 개수 또는 타입이 달라야 한다.
//                           3. 반환 타입은 영향 없다.
public class Ex0619 {
    public static void main(String[] args) {
        MyMath3 mm = new MyMath3();
        System.out.println("mm.add(3, 3) 결과:"    + mm.add(3,3));
        System.out.println("mm.add(3L, 3) 결과: "  + mm.add(3L,3));
        System.out.println("mm.add(3, 3L) 결과: "  + mm.add(3,3L));
        System.out.println("mm.add(3L, 3L) 결과: " + mm.add(3L,3L));

        int[] a = {100, 200, 300};
        System.out.println("mm.add(a) 결과: " + mm.add(a));
    }
                }

class MyMath3 {
    int add(int a, int b) {
        System.out.print("int add(int a, int b) - ");
        return a+b;
    }

    long add(int a, long b) {
        System.out.print("long add(int a, long b) - ");
        return a+b;
    }

    long add(long a, int b) {
        System.out.print("long add(long a, int b) - ");
        return a+b;
    }

    long add(long a, long b) {
        System.out.print("long add(long a, long b) - ");
        return a+b;
    }

    int add(int[] a) {		// 배열의 모든 요소의 합을 결과로 돌려준다.
        System.out.print("int add(int[] a) - ");
        int result = 0;
        for(int i=0; i < a.length;i++)
            result += a[i];

        return result;
    }
}
// 0617에 서 한번 더 공부
//클래스와 객체
//클래스는 설계도와 같아. 예를 들어, MyMath3라는 클래스를 만든 건 어떤 계산을 할 수 있는 설계도를 만든 거야.
//객체는 그 설계도를 바탕으로 만들어진 실제 물건이야. 예를 들어, MyMath3 mm = new MyMath3();에서 mm이 객체야.

//인스턴스 변수와 메서드
//인스턴스 변수는 객체가 가지고 있는 데이터야. 예를 들어, TV 클래스라면 채널 번호, 전원 상태 같은 게 인스턴스 변수가 될 수 있어.
//메서드는 객체가 할 수 있는 행동이야. TV 클래스에서는 채널을 올리기, 전원 켜기 같은 게 메서드야.

//이 코드에서는?
//MyMath3 클래스에는 인스턴스 변수(데이터)가 없어. 대신, add라는 여러 가지 계산을 할 수 있는 메서드들이 있어.
//이 클래스는 상태를 유지할 필요가 없어서 인스턴스 변수가 없는 거야. 그냥 계산하고 끝내면 되니까!
//그래서 mm.add(3, 3)처럼 객체 mm를 통해 메서드를 호출해서 계산만 하면 돼.

//결론
//인스턴스 변수가 없는 클래스도 괜찮아! 클래스가 할 일이 메서드를 통해 무언가 계산하거나 작업을 하는 것뿐이라면, 인스턴스 변수가 필요 없을 수 있어.
//만약 클래스가 어떤 상태(예: TV의 채널 번호)를 유지해야 한다면, 그때 인스턴스 변수를 사용해.
//이 코드에서는 단순히 여러 가지 덧셈을 처리하는 클래스니까 인스턴스 변수가 필요 없는 거야.


