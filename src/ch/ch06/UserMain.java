package ch.ch06;

public class UserMain {
    public static void main(String[] args) {
        User u1 = new User("aaa","231231","서현욱","ㅇㄹㄴ@ㅇㄹㄴㄹㅇㄴ");
        u1.username = "bbbb";
        System.out.println(u1.username);
        u1.showInfo();
        System.out.println();
        System.out.println(u1.toString());
    }
}
