public class Ex0406 {
    public static void main(String[] args) {

        for(int a = 1; a <= 5; a++) {
            System.out.println(a);
        }
        System.out.println("-------------------");

        for(int b = 1; b <= 10; b++) {
            System.out.println(Math.random());
        } // 0.0에서 0.99999 사이에 숫자 10개

        System.out.println("-------------------");
        int num = 0;
        for( int i = 1; i <= 5; i++ ) {
            num = (int) (Math.random() * 6) +1 ;
            System.out.println(num);
//            System.out.println((int)(Math.random()*6)+1); 이거랑 위에랑 같음

        } // 난수 만들기 Math.random() 0.0 ~ 0.99999...의 double값이 들어감
        // 만약 내가 1~3의 정수를 얻고싶으면 * 3(얻고싶은 개별값의 갯수)을 한다 그럼  < 3 이라서 0.0 ~ 2.999..까지나온다
        // 그다음에 형변환 한다 그럼 0 ~ 2 까지가 나온다  => 형변환하면 소수점은 버린다
        // 근데 내가 얻고싶은 값은 1 ~ 3이기 때문에 +1 하면 된다
    }
}
