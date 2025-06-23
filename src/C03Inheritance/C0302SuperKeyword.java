package C03Inheritance;

// 부모 클래스를 상속받을 때, 부모클래스에 기본생성자가 없으면 자식클래스에서 상속시 기본적으로 에러 발생
public class C0302SuperKeyword extends SuperParents {
    int a = 10;

    C0302SuperKeyword() {
        // super() : 부모클래스의 생성자를 호출하는 메서드
        super(20);
        this.a = 10;
    }


    public static void main(String[] args) {
        C0302SuperKeyword c2 = new C0302SuperKeyword();
        c2.display();
    }
    public void display() {
        System.out.println("자식의 변수 : " + a); // 10
        System.out.println("부모의 변수 : " + super.a); // 20
    }
}

class SuperParents {
    int a;

    public SuperParents(int a) {
        this.a = a;
    }
//    public SuperParents() {}
}
