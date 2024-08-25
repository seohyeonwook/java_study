package Ex07; // (메소드) 오버라이딩 - 상속받은 조상의 메소드를 자신에 맞게 변경하는 것
                // override - 덮어쓰다
                // 선언부는 바꾸지 못하고 메소드 내용(구현부)만 변경 가능
                // 조건 - 선언부가 조상클래스의 메서드와 일치해야 한다. (반환타입,메서드이름,매개변수목록)
                //       접근제어자를 조상클래스의 메서드보다 좁은범위로 변경할 수 없다
//                         (public, protected, defalt, private)
                //       예외는 조상 클래스의 메서드 보다 많이 선언할 수 없다.

class Point3 {
    int x;
    int y;
    String getLocation() {
        return "x :"+ x + ",y: " + y;
    }

}
class Point3D3 extends Point3 {
    int z;

    @Override // 조상의 getLocation()을 오버라이딩
    String getLocation() {
        return "x :"+ x + ",y: " + y +", z:" + z;
    }
}
public class Ex0703 {
    public static void main(String[] args) {
        Point3D3 point3D3 = new Point3D3();
        point3D3.x = 3;
        point3D3.y = 6;
        point3D3.z = 4;

        System.out.println(point3D3.getLocation()); // 오버라이딩 없으면 z 안뜬다  x 와 y만

    }
}
