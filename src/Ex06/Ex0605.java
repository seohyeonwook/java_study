package Ex06;

 class Ex0605 {
     public static void main(String[] args) {
         Tv t1 = new Tv();  // Tv t1; t1 = new Tv();를 한 문장으로 가능
         Tv t2 = new Tv();
         System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
         System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

         t1.channel = 7;    // channel 값을 7으로 한다.
         System.out.println("t1의 channel값을 7로 변경하였습니다."); // 순서대로 위에 서는 아직 0이다 이제 7로 바꿔줌

         t2 = t1; // 이러면 t1과 t2가 모두 t1을 보기때문에 t2은 가비지컬렉터가 된다
         System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
         System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
     }
}
