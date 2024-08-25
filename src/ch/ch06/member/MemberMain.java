package ch.ch06.member;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String selectedMenu = null;

        while (true) { // 참일 동안 무한루프
            System.out.println("회원 관리 프로그램");
            System.out.println("1. 회원 등록");
            System.out.println("q. 프로그램 종료");

            System.out.println(" 메뉴 선택 >>> ");
            selectedMenu = scanner.nextLine();

            MemberService memberService = new MemberService();

            if( "1".equals(selectedMenu)) {
                boolean responseData = memberService.addMember();
                if(responseData) {
                    System.out.println("회원 등록 완료");
                } else {
                    System.out.println("회원 등록 취소");
                }

            } else if ("q" .equalsIgnoreCase(selectedMenu)) {
                break;
            } else {
                System.out.println("다시 선택하세요");
            }
            System.out.println();
        }
        System.out.println("<<<프로그램이 종료 되었습니다.>>>>");
    }
}
