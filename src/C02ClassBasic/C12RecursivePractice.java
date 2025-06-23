package C02ClassBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C12RecursivePractice {
    public static void main(String[] args) {
//        // for 문으로 1~10 누적합계
//        int sum = 0;
//        for(int i = 1 ; i < 11 ; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
//        // 재귀함수로 1~10까지 누적합계
//        System.out.println(sumAcc(1, 10));
        // 재귀 함수로 factorial값 구하기 : 1 ~ n 까지를 모두 곱한 값
//        System.out.println(factorial(5));

        // 피보나치 수열 : f(n-1) + f(n-2) = f(n)
        // 1 1 2 3 5 8 13 21 34
        // List로 구현
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(1);
//        for(int i = 2 ; i < 10 ; i++) {
//            list.add(list.get(i-1) + list.get(i-2));
//        }
//        System.out.println(list);

        // 풀이2 : dp 알고리즘(메모이제이션-기억하기 알고리즘)을 활용한 풀이법
        // 위 풀이랑 동일
//        int[] arr = new int[10];
//        arr[0] = 1;
//        arr[1] = 1;
//        for(int i = 2 ; i < 10 ; i++) {
//            arr[i] = arr[i-1] + arr[i-2];
//        }
//        System.out.println(Arrays.toString(arr));

        // 풀이3 : 재귀함수를 이용한 피보나치
        System.out.println(fibonacci(10));
    }

        // 재귀는 중복 계산으로 인해 성능이 떨어진다.
        public static int fibonacci(int n) {
            if(n <= 2) {
                return 1;
            }
            return fibonacci(n-1) + fibonacci(n-2);
        }




//    public static int factorial(int n) {
//        if(n == 1) {
//            return 1;
//        }
//        return n * factorial(n-1);
//    }

//    public static int sumAcc(int n, int target) {
//        if(n > target) {
//            return 0;
//        }
//        return n+sumAcc(n+1, target);
//    }




}
