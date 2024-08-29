package oop.study_2;

//변수
//이 클래스에는 변수는 없으며, 주로 메인 메서드를 포함하여 프로그램의 실행을 담당합니다.

//메서드
//main: 프로그램의 시작점입니다. 여기서 UserManager 객체를 생성하고, User 객체들을 추가하고, 검색 및 삭제 등의 기능을 테스트합니다.

//요약
//User 클래스: 사용자 정보를 저장하고 조작하는 데 필요한 메서드와 변수들을 포함합니다.
//UserManager 클래스: 여러 User 객체를 관리하고, 추가, 삭제, 검색 등의 기능을 제공하는 클래스입니다.
//UserMain 클래스: 프로그램의 실행을 시작하며, UserManager와 User 객체의 기능을 테스트하는 역할을 합니다.

public class UserMain {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        User user1 = new User("서현욱",12313,"서현욱","ㅇㄴㄹㅇ@ㅇㄴㄹㅇㄴ");
        User user2 = new User("ㅇㄹㄴㄹ",12313,"ㅇㄹㄴㄹ","ㅇㄴㄹㅇ@ㅇㄴㄹㅇㄴ");
        User user3 = new User("ㄱㄷㅈㄱㄷㅈ",12313,"ㄱㄷㅈㄱㄷㅈ","ㅇㄴㄹㅇ@ㅇㄴㄹㅇㄴ");

        userManager.addUser(user1);
        userManager.addUser(user2);
        userManager.addUser(user3);

        System.out.println("모든 유저: ");
        userManager.printAllUsers(); // void형식

        System.out.println("유저 찾기: ");
        User foundUser = userManager.findUser("ㄹㅇㄹ"); //
//        System.out.println(foundUser);
        if(foundUser != null) {
            System.out.println(foundUser);
        } else {
            System.out.println("유저 찾지 못했습니다");
        }
        System.out.println("유저 삭제: ");
        boolean removeUser = userManager.removeUser("er");
        System.out.println(" 유저 삭제: " + removeUser);

        userManager.printAllUsers();






    }
}
