package ch.ch06;

public class User {
    String username;
    String password;
    private String name;
    private String email;

    public User(String username, String password, String name, String email) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
    }

    void showInfo() {
        System.out.println("username: "+ username);
        System.out.println("password: "+ password);
        System.out.println("name: "+ name);
        System.out.println("email: "+ email);

    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
