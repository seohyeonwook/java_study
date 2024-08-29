package oop.study_2;

//변수
//users: User 객체들을 저장하는 리스트입니다. 사용자의 목록을 관리하는데 사용됩니다.

//메서드
//생성자: UserManager 객체를 생성할 때 users 리스트를 초기화합니다.
//addUser: 새로운 User 객체를 리스트에 추가합니다.
//removeUser: username을 사용하여 리스트에서 사용자 객체를 삭제합니다. 사용자 삭제 성공 여부를 반환합니다.
//findUser: username을 사용하여 리스트에서 특정 User 객체를 검색합니다. 사용자가 존재하면 해당 객체를 반환하고, 존재하지 않으면 null을 반환합니다.
//printAllUsers: 리스트에 있는 모든 사용자 정보를 출력합니다

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users; //

    public UserManager() { //
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    //removeUser: username을 사용하여 리스트에서 사용자 객체를 삭제합니다. 사용자 삭제 성공 여부를 반환합니다.
    public boolean removeUser (String username) {
        for(User user : users) {
            if(user.getUsername().equals(username)) {
                users.remove(user);
                return true;
            }

        }
        return false;
    }

    //findUser: username을 사용하여 리스트에서 특정 User 객체를 검색합니다. 사용자가 존재하면 해당 객체를 반환하고, 존재하지 않으면 null을 반환합니다.
    public User findUser(String username) {
        for(User user : users) {
            if(user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
    //printAllUsers: 리스트에 있는 모든 사용자 정보를 출력합니다
    public void printAllUsers() {
        for(User user : users) {
            System.out.println(user);
        }
    }


}
