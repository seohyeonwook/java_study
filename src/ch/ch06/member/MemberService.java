package ch.ch06.member;

import java.util.Scanner;

public class MemberService {
    boolean addMember() {
        String code = null;
        String name = null;
        String age = null;
        String address = null;

        System.out.println("<<<<회원등록>>>>");

        code = inputValue("회원코드");
        if("exit".equalsIgnoreCase(code)) { // 만약 코드를 입력했는데 그게 exit면 false로 리턴
            return false;
        }
        name = inputValue("이름");
        if("exit".equalsIgnoreCase(name)){
            return false;
        }
        age = inputValue("나이");
        if("exit".equalsIgnoreCase(age)){
            return false;
        }
        address = inputValue("주소");
        if("exit".equalsIgnoreCase(address)){
            return false;
        }
        Member member = new Member(code, name, Integer.parseInt(age), address);
        MemberRepository memberRepository = new MemberRepository();
        return memberRepository.insert(member) > 0 ; //
    }

    String inputValue(String label) {
        Scanner scanner = new Scanner(System.in);
        String value = null;
        while(true) {
            System.out.println( label + "(입력 취소: exit) >>>");
            value = scanner.nextLine();
            if(!value.isBlank()) {
                break;// 공백이아니면 break;
            }
        }
        return value;
    }
}
