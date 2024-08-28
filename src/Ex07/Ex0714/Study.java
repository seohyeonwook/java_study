package Ex07.Ex0714;

public class Study {
    private String sub;
    private int age;
    private String name;

    public Study(String sub, int age, String name) {
        System.out.println("생성자는 호출없이 자동실행 되는가?");
        this.sub = sub;
        this.age = age;
        this.name = name;
    }


    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
