package C05AnonymousLambda;

import java.lang.reflect.Member;

public class C01InnerClass {
    public static void main(String[] args) {
        MemberInnerClass m1 = new MemberInnerClass();
        System.out.println(m1.getA());

        MemberInnerClass.StaticInnerClass ms1 = new MemberInnerClass.StaticInnerClass();
        System.out.println(ms1.b);
    }
}

// (일반) 내부 클래스
class MemberInnerClass {
    int a;
    MemberInnerClass() {
        this.a = 10;
    }
    int getA() {
        return this.a;
    }
    // static 내부 클래스 : MemberInnerClass의 static 변수처럼 활용이 된다.
    static class StaticInnerClass {
        int b = 20;
        void display() {
            System.out.println(this.b);
        }
    }
    class InnerClass {
        void display() {
            System.out.println(a);
        }
    }
}

