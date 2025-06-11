package C01Basic;

import java.util.Arrays;
import java.util.Scanner;

public class C05LoopStatement {
    public static void main(String[] args) {
//        int a = 0;
//        while(a < 10) {
//            System.out.println("Hello World!");
//            a++;
//        }

//        // 2부터 10까지 출력
//        int a = 2;
//        while(a <= 10) {
//            System.out.print(a + " ");
//            a++;
//        }

        // 도어락 키 예제 -> 무한반복 되는 도어락 키 예제 -> 입력 횟수 제한 있는 도어락 키 예제
        // 5회 입력 횟수 제한 있는 도어락 키 (5회 이상 초과 됐습니다.)
//        int a = 0;
//        while(true) {
//            if(a == 5) {
//                System.out.println("5회 이상 초과 됐습니다");
//                break;
//            }
//            int answer = 1234;
//            Scanner sc = new Scanner(System.in);
//            int input = sc.nextInt();
//            if(answer == input) {
//                System.out.println("문이 열렸습니다.");
//                break; // 가장 가까이에 있는 반복문을 즉시 종료.
//            } else {
//                System.out.println("비밀번호가 틀렸습니다.");
//            }
//            a++;
//        }

//        // 입력한 숫자의 구구단 단수 출력
//        int i = 1;
//
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//
//        while(i < 10) {
//            System.out.println(input + " * " + i + " = " + input * i);
//            i++;
//        }

//        // do while문 : 무조건 1번은 실행되는 while문
//        int a = 100;
//        do {
//            System.out.println(a);
//        } while(a < 10);

//        // for문 : 초기식, 조건식, 증감식이 모두 포함돼 있는 반복문
//        for(int a = 0 ; a < 10 ; a++) {
//            System.out.println(a);
//        }
        // for문은 사용했던 변수명을 for문이 끝난 이후에 재선언이 가능

//        // 1~10중에 홀수만 출력하기
//        for(int i = 1 ; i < 11 ; i++) {
//            if(i % 2 == 1) System.out.print(i + " ");
//        }

//        // 1~20까지 짝수의 총합 출력하기
//        int sum = 0;
//        for(int i = 1 ; i < 21 ; i++) {
//            if(i % 2 == 0 ) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);

//        // 두 수의 최대공약수 찾기
//        int a = 24;
//        int b = 36;
//
//        for(int i = Math.min(a, b); i > 1 ; i--) {
//            if(a % i == 0 && b % i == 0) {
//                System.out.println(i);
//                break;
//            }
//        }

//        // 소수구하기 : 1과 자신을 제외한 숫자로 나누어지지 않는 수
//        // 사용자가 입력한 값이 소수인지 아닌지 판별해주는 프로그램
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//
//        if(input == 1) {
//            System.out.println("소수가 아닙니다.");
//            return;
//        } else if(input == 2) {
//            System.out.println("소수 입니다.");
//            return;
//        } else {
//            for(int i = 2 ; i < input ; i++) {
//
//                if(input % i == 0) {
//                    System.out.println("소수가 아닙니다.");
//                    break;
//                }
//                if(i == input - 1) {
//                    System.out.println("소수 입니다.");
//                }
//            }
//        }
//
//        // continue : 반복문의 조건식으로 이동하는 명령어.
//        // 홀수만 출력
//        for(int i = 1 ; i < 11 ; i++) {
//            if(i % 2 == 0) {
//                // continue는 코드의 직관성과 가독성을 위해 사용
//                continue;
//            }
//            System.out.println(i);
//        }

//        // 향상된 for문
//        int[] arr = {1, 3, 5, 7, 9};
////        for(int value : arr) {
////            System.out.println(value);
////        }
//
//        // 일반 for문을 통한 arr의 저장된 값 변경
//        for(int i = 0 ; i < arr.length ; i++) {
//            arr[i] += 10;
//        }
//
//        // 향상된 for 문을 통한 arr의 저장된 값 변경 -> 원본의 값 변경 불가.
//        for(int a : arr) {
//            a += 10;
//        }
//
//        // 자바 변수의 유효범위 : { }
//        int num = 10;
//        if(true) {
//            num = 20;
//            int num2 = 20;
//        }
//        // num2 = 30; if문 중괄호 내에서 정의된 변수는 해당 중괄호 밖에서는 사용불가.

        // 다중 반복문
        // 2단 ~ 9단까지 한꺼번에 출력 + 각 단마다 몇단인지 출력

//        for(int i = 2 ; i < 10 ; i++) {
//            System.out.println(i + "단 입니다.");
//            for(int j = 1 ; j < 10 ; j++) {
//                System.out.println(i + " * " + j + " = " + i * j);
//            }
//        }
//
//        // 라벨문 : 반복문에 이름을 붙이는 것.
//        loop1:
//        for(int i = 0 ; i < 10 ; i++) {
//            loop2:
//            for(int j = 0 ; j < 10 ; j++) {
//                if(true) {
//                    break loop1; // 원하는 for문을 라벨링을 통해 종료시킬 수 있음.
//                }
//            }
//        }

//        // 2차원 배열
//        int[][] arr = {{1, 2, 3}, {4, 5, 11}, {7, 8, 9}, {10, 11, 12}};
//        System.out.println(arr[1][2]); // 1번째 배열에 2번째 값을 찾는 것.
//        // 숫자 11이 위치한 배열의 index값(1, 2 또는 3, 1) 출력
//        // 가장 먼저 찾아지는 11의 위치만 출력
//        loop1:
//        for(int i = 0 ; i < arr.length ; i++) {
//            for(int j = 0 ; j < arr[i].length ; j++) {
//                if(arr[i][j] == 11) {
//                    System.out.println("i: " + i + ", j: " + j);
//                    break loop1;
//                }
//            }
//        }

        // 라벨링 활용 문제풀이
        // 100~200까지 수 중에서 가장 작은 소수를 출력
//        loop1:
//        for(int i = 100 ; i <= 200 ; i++) {
//            for(int j = 2 ; j < i ; j++) {
//                if(i % j == 0) {
//                    break;
//                } else {
//                    if(j == i-1) {
//                        System.out.println(i);
//                        break loop1;
//                    }
//                }
//            }
//        }






    }
}
