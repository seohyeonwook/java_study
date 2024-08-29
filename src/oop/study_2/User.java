package oop.study_2;

//변수
//username: 사용자의 고유 이름을 저장합니다. 모든 사용자 객체는 고유한 username을 가져야 합니다.
//password: 사용자의 비밀번호를 저장합니다. 로그인 시 비밀번호 검증에 사용됩니다.
//name: 사용자의 실제 이름을 저장합니다.
//email: 사용자의 이메일 주소를 저장합니다. 이메일은 사용자와의 연락 또는 계정 확인에 사용될 수 있습니다.

//메서드
//생성자: User 객체를 생성할 때 username, password, name, email을 초기화합니다.
//getters and setters: 각 변수의 값을 가져오거나 수정하는 메서드입니다.
//getUsername: username을 반환합니다.
//setUsername: username을 설정합니다.
//getPassword: password를 반환합니다.
//setPassword: password를 설정합니다.
//getName: name을 반환합니다.
//setName: name을 설정합니다.
//getEmail: email을 반환합니다.
//setEmail: email을 설정합니다.
//showInfo: 사용자의 모든 정보를 출력합니다.
//toString: User 객체의 문자열 표현을 반환합니다. 객체를 출력할 때 사용됩니다.
public class User {
    // 변수
    private String username;
    private int password;
    private  String name;
    private String email;

    // 생성자
    public User(String username, int password, String name, String email) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
    }

    // 게터 세터


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // showInfo
    public void showInfo() {
        System.out.println("username" + username);
        System.out.println("password" + password);
        System.out.println("name" + name);
        System.out.println("email" + email);
    }

    // toString
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password=" + password +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
