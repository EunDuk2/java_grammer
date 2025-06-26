package C05AnonymousLambda;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C04StreamApi {
    public static void main(String[] args) {
//        int[] arr = { 20, 10, 4, 12 };
//        // 전통적인 방식의 데이터 접근방법 : 메모리 주소 접근
//        for(int i = 0 ; i < arr.length ; i++) {
//            System.out.println(arr[i]);
//        }
//
//        // 함수형 프로그래밍 방식 : 데이터와 객체 중심이 아닌 입력에 따른 출력만 존재
//        // streamApi : java 에서 함수형 프로그래밍을 지원하는 라이브러리
//        // foreach는 스트림의 각 요소를 하나씩 소모하면서 동작을 수행
//        Arrays.stream(arr).forEach(a -> System.out.println(a));
//
//        // 스트림의 생성 : .stream()
//        List<String> myList = new ArrayList<>();
//        myList.add("HTML");
//        myList.add("css");
//        myList.add("javascript");
//        Stream<String> stream1 = myList.stream();
//        String[] myArr = new String[3];
//        myArr[0] = "HTML";
//        myArr[1] = "css";
//        myArr[2] = "javascript";
//        Stream<String> stream2 = Arrays.stream(myArr);
//
//        // 원시 자료형을 위한 stream 객체가 별도로 존재.
//        int[] intArr = { 10, 20, 30, 40, 50 };
//        IntStream stream3 = Arrays.stream(intArr);

//        // stream 의 중개연산(변환) : filter, map, sorted, distinct
//        int[] intArr = { 10, 10, 30, 40, 50 };
//        // 30보다 작은 값 들의 총합
//        // filter : 특정 기준으로 대상을 filtering 하여 새로운 스트림으로 반환하는 중개 연산 메소드
//        // sum : 스트림의 요소를 하나씩 소모하여 총합을 구하는 메서드
//        // IntStream -> 소모 -> int 값
//        int total = Arrays.stream(intArr).filter(a -> a <= 30).sum();
//        System.out.println(total);
//
//        // map : 기존의 스트림을 조작하여 새로운 스트림을 반환
//        int[] intArr2 = { 10, 10, 30, 40, 50 };
//        int total2 = Arrays.stream(intArr2).map(a -> a * 10).sum();
//        int[] newIntArr = Arrays.stream(intArr2).map(a -> a * 10).toArray();
//        System.out.println(Arrays.toString(newIntArr));
//
//        // distinct : 중복 제거
//        int[] intArr3 = { 10, 10, 30, 40, 50 };
//        int total3 = Arrays.stream(intArr3).distinct().sum();
//        System.out.println(total3);
//
//        // sorted : 정렬된 배열 반환
//        int[] intArr4 = { 10, 10, 30, 40, 50 };
//        int[] newArr4 = Arrays.stream(intArr4).sorted().toArray();
//        System.out.println(Arrays.toString(newArr4));
//
//        // mapToInt : IntStream 형태로 변환해주는 map
//        String[] stArr = {"HTML", "CSS", "JAVA", "PYTHON"};
//        // 모든 문자열 길이의 총합
//        int lengthTotal = Arrays.stream(stArr).mapToInt(a -> a.length()).sum();
//        System.out.println(lengthTotal);

//        int[] arr = {1, 2, 3, 4, 5, 6};
//        // arr 에서 홀수만 담은 배열 생성 후 출력
//        int[] arr1 = Arrays.stream(arr).filter(a -> a % 2 == 1).toArray();
//        System.out.println(Arrays.toString(arr1));
//
//        // arr 에서 홀수만 걸러서 해당 홀수의 제곱값을 담은 배열을 생성 후 출력
//        int[] arr2 = Arrays.stream(arr).filter(a -> a % 2 == 1).map(a -> a*a).toArray();
//        System.out.println(Arrays.toString(arr2));
//
//        // arr 에서 홀수만 거르고, 제곱값을 구하고, 해당 숫자값을 오름차순한 순서로 배열을 생성 후 출력
//        int[] arr3 = Arrays.stream(arr).filter(a -> a % 2 == 1).map(a -> a*a).sorted().toArray();
//        System.out.println(Arrays.toString(arr3));
//
//        // Stream 의 소모 : foreach(출력), sum(합계), reduce(누적연산), findFirst(배열의 첫번째 값), max, min, count
//        int[] intArr = {10, 20, 30, 40};
//        Arrays.stream(intArr).forEach(a -> System.out.println(a));
//        int total = Arrays.stream(intArr).sum();
//        // optional 객체 : 값이 있을 수도 있고, 없을 수도 있음을 명시한 객체 (값을 체크하고 getAsInt()로 가져오는게 좋은 코드)
//        int max = Arrays.stream(intArr).max().getAsInt();
//        int min = Arrays.stream(intArr).min().getAsInt();
//        long count = Arrays.stream(intArr).count(); // 기본 long으로 반환
//
//        // reduce : 누적 연산 -> reduce (초기값, 연산식)
//        int accSum = Arrays.stream(intArr).reduce(0, (a, b) -> a+b);
//        int accMul = Arrays.stream(intArr).reduce(1, (a, b) -> a*b);
//        System.out.println(accMul);
//        String[] stArr = {"hello", "java", "world"};
//        String stAcc = Arrays.stream(stArr).reduce("", (a, b) -> a + b);
//        System.out.println(stAcc);

//        // findFirst : 첫 번째 요소 반환
//        String[] stArr = {"hello", "java", "world"};
//        String firstSt = Arrays.stream(stArr).filter(a -> a.length() >= 5).findFirst().get();
//        System.out.println(firstSt);

        // 주의사항 : 제네릭의 타입 소거
        // 자바의 런타임 시점에 <String>과 같은 제네릭의 타입 소거 발생.
        // 제네릭의 타입 소거로 인해, toArray를 통해 바로 새로운 String 배열을 만드는 것을 불가.
        // int -> IntStream 으로 타입을 알기 때문에 문제 없다.
//        String[] stArr = {"hello", "java", "world"};
//        String[] answer = Arrays.stream(stArr).filter(a -> a.length() >= 5).toArray(a -> new String[a]);
////        System.out.println(Arrays.toString(answer));
//
//        // 메소드 참조 : 하나의 메소드만을 호출하는 경우에 매개변수를 제거한 형식. 클래스명::메서드명
//        Arrays.stream(stArr).forEach(System.out::println);
//        String[] answer2 = Arrays.stream(stArr).filter(a -> a.length() >= 5).toArray(String[]::new);
//
//        // Stream API 실습
//        // List에 Student객체 4개 담기 : {"kim", 20}, {"choi", 32}, {"lee", 35}, {"park", 22}
//        List<Student> list = new ArrayList<>();
//        list.add(new Student("kim", 20));
//        list.add(new Student("choi", 32));
//        list.add(new Student("lee", 35));
//        list.add(new Student("park", 22));
//
//        // 1) 모든 객체의 평균나이
//        double averageAge = list.stream().mapToInt(a -> a.getAge()).average().getAsDouble();
//        System.out.println(averageAge);
//
//        // 2) 가장 나이 어린 사람 찾기
//        Student s = list.stream().sorted((a, b) -> a.getAge() - b.getAge()).findFirst().get();
//        System.out.println(s);
//
//        // 3) 30대 이상인 사람들의 이름만 보아서 새로운 String배열에 담기
//        String[] arr = list.stream().filter(a -> a.getAge() >= 30).map(a -> a.getName()).toArray(String[]::new);
//        System.out.println(Arrays.toString(arr));

        // Optional 객체 : 특정 객체에 값이 없을지도 모른다는 것을 명시적으로 표현
        // String클래스를 Optional로 Wrapping
//        String st1 = null;
//        if(st1 != null) {
//            System.out.println("hello");
//        } else {
//            System.out.println("값이 없습니다.");
//        }
//
//
//        Optional<String> opt1 = Optional.ofNullable(null);
//        if(opt1.isPresent()) {
//            System.out.println(opt1.get().compareTo("hello"));
//        } else {
//            System.out.println("값이 없습니다.");
//        }

        // Optional 객체 생성 방법 3가지.
        Optional<String> opt1 = Optional.empty(); // 비어있는 Optional 객체 생성
        Optional<String> opt2_1 = Optional.ofNullable(null); // 비어있는 Optional 객체 생성
        Optional<String> opt2_2 = Optional.ofNullable("hello"); // 값이 있는 Optional 객체 생성
        Optional<String> opt3 = Optional.of("hello"); // 값이 있는 Optional 객체 생성

        System.out.println(opt1);
        System.out.println(opt1.get());
        // Optional 객체 처리 방법 4가지
        // 방법1. isPresent()로 확인 후에 get()
//        if(opt2_1.isPresent()) {
//            System.out.println(opt2_1);
//        } else {
////            System.out.println(opt2_1.get()); // 에러 발생
//            System.out.println("값이 없습니다.");
//        }
//        // 방법2. orElse() : 값이 있으면 있는 값 return, 없으면 지정한 값 return
//        System.out.println(opt2_1.orElse("값이 없습니다."));
//        System.out.println(opt2_2.orElse("값이 없습니다."));
//        // 방법3. orElseGet() : 값이 있으면 있는 값 return, 없으면 람다함수 실행 (잘 안쓰임)
//        System.out.println(opt2_1.orElseGet(()->new String("hello")));
//
//        // 방법4. orElseThrow : 값이 있으면 있는 값 return, 없으면 지정된 예외 강제 발생 (가장 많이 사용)
//        // 개발에서 사용자에게 적절한 메시지 전달 목적과 의도된 코드중단을 목표로 강제로 예외 발생시키는 경우는 매우 많음
        System.out.println(opt2_1.orElseThrow(() -> new RuntimeException("값이 없습니다."))); // 의도한 예외
////        System.out.println(opt2_1.get()); // 의도하지 않은 예외 발생
//
//        // optional 객체 예시 1
//        List<Student> studentList = new ArrayList<>();
//
//        // 평균 구하기 방법1
//        OptionalDouble age = studentList.stream().mapToInt(a -> a.getAge()).average();
//        if(age.isPresent()) {
//            System.out.println(age.getAsDouble());
//        } else {
////            throw new NoSuchElementException("값이 없습니다");
//        }
//        // 평균 구하기 방법2
//        System.out.println(studentList.stream().mapToInt(a -> a.getAge()).average()
//                .orElseThrow(() -> new NoSuchElementException("값이 없습니다")));

        // optional 객체 예시 2
        List<Student> list = new ArrayList<>();
        list.add(new Student("kim", 20));
        list.add(new Student("choi", 32));
        list.add(new Student("lee", 35));
        list.add(new Student("park", 22));

        System.out.println("조회하고자 하는 student의 index번호를 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        int indexNumber = Integer.parseInt(sc.nextLine());

        // 인덱스 범위가 list안에 있으면 Optional.ofNullable 또는 of, ofEmpty
        Optional<Student> opStudent;
        if(list.size() <= indexNumber) {
            opStudent = Optional.empty();
        } else {
            opStudent = Optional.of(list.get(indexNumber));
        }
        System.out.println(opStudent.orElseThrow(() -> new NoSuchElementException("입력하신 index는 없는 인덱스입니다.")));
    }
}
