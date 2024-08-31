package oop.study_2;

public class Q1 {
//    니가 방금 짜준 코드 몇개 물어볼게 쉽게 대답해
//
//1.
//    private List<User> users;  이부분은 User에 있는 변수들을 List로 받아오는 거야?? 그럼 이 안에private String username;
//    private int password;
//    private  String name;
//    private String email;
//    이것들이 있는거야?
//            2.
//    public UserManager() { //
//        this.users = new ArrayList<>();
//    } 이거  this.users = new ArrayList<>(); 이부분 이해가 안가 설명해줘
//3.
//    public User findUser(String username) {
//        for(User user : users) {
//            if(user.getUsername().equals(username)) {
//                return user;
//            }
//        }
//        return null;
//    } 이거 반환 형식 UserManager으로 해도 되는거 아니야?
//
//            -----------------------------------------------------------------------------------------------------------------
//
//            1. private List<User> users; 이 부분은 User에 있는 변수들을 List로 받아오는 거야??
//    그럼 이 안에 private String username; private int password; private String name; private String email;
//    이거들이 있는거야?
//
//    설명:
//
//    private List<User> users;는 User 객체들을 저장하는 리스트입니다.
//    이 리스트는 User 타입의 객체들만 포함할 수 있습니다.
//    List<User>에는 User 클래스의 모든 인스턴스가 저장됩니다.
//    User 클래스의 필드(예: username, password, name, email)는 리스트 안의 각 User 객체에 대해 존재합니다.
//    즉, 리스트 자체에는 User 객체만 들어있고, 각 User 객체는 username, password, name, email 등의 필드를 갖고 있습니다.
//
//            2. public UserManager() { this.users = new ArrayList<>(); } 이거 this.users = new ArrayList<>(); 이 부분 이해가 안가 설명해줘
//
//    설명:
//
//            this.users = new ArrayList<>();는
//    UserManager 클래스의 users 리스트를 초기화하는 코드입니다.
//            new ArrayList<>()는 빈 ArrayList 객체를 생성합니다.
//    ArrayList는 Java에서 제공하는 List의 구현 클래스입니다.
//            this.users는 UserManager 클래스의 필드인 users를 가리킵니다.
//    따라서, 이 코드는 users 필드를 빈 ArrayList로 초기화하여 나중에 User 객체들을 이 리스트에 추가할 수 있도록 준비하는 것입니다.
//
// 3. public User findUser(String username) { for(User user : users) { if(user.getUsername().equals(username)) { return user; } } return null; }
//    이거 반환 형식 UserManager으로 해도 되는 거 아니야?
//
//    설명:
//
//    findUser 메서드는 User 객체를 반환합니다. 이 메서드는 주어진 username에 해당하는 User 객체를 users 리스트에서 찾아서 반환합니다.
//    반환 형식이 User인 이유는 메서드가 User 객체를 반환하기 때문입니다.
//            즉, 이 메서드는 UserManager 클래스 자체를 반환하지 않고, User 객체를 찾는 것이 목적입니다.
//    만약 반환 형식이 UserManager였다면, 이 메서드는 UserManager 객체를 반환해야 합니다.
//    그러나 이 메서드는 특정 User 객체를 찾기 위한 것이므로, User 타입으로 반환하는 것이 맞습니다.
}
