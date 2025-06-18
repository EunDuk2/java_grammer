package C02ClassBasic;

import java.util.*;

public class C03Class {
    public static void main(String[] args) {
//        System.out.println(MyCalculator.sum(10, 20));

//        // A 부서의 매출
//        // 20원 매출 발생
//        System.out.println(MyCalculator.sumAcc(20));
//        // 30원 매출 발생
//        System.out.println(MyCalculator.sumAcc(30));
//        // 40원 매출 발생
//        System.out.println(MyCalculator.sumAcc(40));
//        // 누적합 : 90원
//
//        // B 부서의 매출
//        // 10원 매출
//
//        // 20원 매출

        // 객체를 활용한 매출 계산
        // A회사 매출 : 10원, 20원
        MyCalculatorInstance mi1 = new MyCalculatorInstance();
//        MyCalculatorInstance.sumAcc() : static이 없으므로 호출 불가 -> 객체로 만들어서 호출해야 함
        mi1.sumAcc(10);
        System.out.println(mi1.total);
        mi1.sumAcc(20);
        System.out.println(mi1);

        // B회사 매출 : 10원, 20원
        MyCalculatorInstance mi2 = new MyCalculatorInstance();
        mi2.sumAcc(10);
        System.out.println(mi2.total);
        mi2.sumAcc(20);
        System.out.println(mi2.total);

        System.out.println(MyCalculatorInstance.total_count);

        // 자료구조에서 객체 사용 예시
        // 배열
        String[] arr1 = {"hello", "java", "python"};
        Arrays.sort(arr1); // 클래스 메서드
        System.out.println(arr1.length);

        // 리스트
        List<String> myList = new ArrayList<>();
        Collections.sort(myList); // 클래스 메서드
        myList.sort(Comparator.naturalOrder()); // 객체 메서드
    }
}

class MyCalculator {
    // static이 붙어있으면 클래스변수, static이 붙어 있지 않으면 객체 변수
    static int total = 0;

    // 클래스 메서드는 객체의 상태와 상관없는 독립적인 로직 수행 시에 사용 가능
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sumAcc(int a) {
        total += a;
        return total;
    }
}

class MyCalculatorInstance {
    int total = 0;

    // 클래스 변수는 모든 인스턴스(객체) 간에 상태 공유 목적으로 주로 사용
    static int total_count = 0;

    // class를 만들면 아래와 같은 클래스명의 이름을 가진 메서드(생성자)가 기본으로 만들어짐.
    // 생성자의 주된 목적은 객체 생성 시 실행되면서 객체 변수를 초기화하기 위한 목적으로 주로 사용.
    public MyCalculatorInstance() {
        total_count++;
    }

    // 클래스 메서드는 객체의 상태와 상관없는 독립적인 로직 수행시에 사용 가능
    public static int sum(int a, int b) {
        return a + b;
    }

    public void sumAcc(int total) {
        // this는 객체 그 자신을 의미
        // 일반적으로, 매개변수와 객체변수를 구분 짓기 위해 사용. (ex) 매개변수명도 total, 객체 변수명도 total인 경우
        this.total += total;
    }
}



