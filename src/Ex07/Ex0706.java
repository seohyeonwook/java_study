package Ex07; // import문 - 클래스를 사용할때 패키지이름을 생략할 수 있다

import java.util.Date;

// new 하면 위에 import생기는것
                // 컴파일러에게 클래스가 속한 패키지를 알려준다
                // 원래는 java.util.Date today = new java.util.Date(); 이렇게해야하는데
                // 패키지 이름 생략 시켜줌 ctrl + shift + o 가 단축어
public class Ex0706 {
    Date today = new Date();
}
