package C03Inheritance.Protected;
// 같은 패키지내의 클래스가 아닌경우에는 import필요
// 패키지 바로 하위의 모든 class는 * 로 가능. 다만, 패키지내의 패키지 안의 class는  *로 import 불가능
import C03Inheritance.C04ProtectedClass;

public class ProtectedTest extends C04ProtectedClass {
    public static void main(String[] args) {
        ProtectedTest p1 = new ProtectedTest();

        // public 접근제어자는 프로젝트 전역에서 접근 가능
        p1.st1 = "hello python";
        // 패키지가 달라졌으므로 default변수는 접근 불가
//        p1.st3 = "hello python";
        // 상속 관계가 있을 경우, 패키지가 달라도 protected 변수에 접근 가능
        p1.st4 = "hello python1";

        C04ProtectedClass p2 = new C04ProtectedClass();
        // p2는 부모클래스의 객체이므로, 상속관계가 있는 객체가 아니므로, protected변수에 접근 불가
        // p2.st4 = "hello python";
    }
}
