package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C07Array {
    public static void main(String[] args) {
//        // 배열 표현식1. 배열 선언 후 할당 방식
//        // 배열은 사전에 반드시 길이가 결정되어야 함
//        int[] arr1 = new int[5];
//        arr1[0] = 10;
//        arr1[1] = 20;
//        arr1[2] = 30;
//        arr1[3] = 40;
//        arr1[4] = 50;
//        arr1[5] = 10; // IndexOutOfBounds 예외 발생 / 길이가 동적으로 늘어날 수 없음

//        // 배열 표현식2. 리터럴 방식
//        int[] arr2 = {10, 20, 30, 40, 50};
//
//        // 배열 표현식3.
//        int[] arr3 = new int[]{10, 20, 30, 40, 50};
//
//        // 배열 표현식 3. 예시
//        List<int[]> list = new ArrayList<>();
//        list.add(new int[3]);
//        list.add(new int[]{1, 3, 5, 7});
//        System.out.println(list.get(0)[1]);
//
//        // 배열 표현식4 : 불가
////        int[] arr4 = new int[];

//        // Arrays.fill : 배열에 모든 값을 변경
//        String[] arr = new String[5];
//        for(int i = 0 ; i < arr.length ; i++) {
//            arr[i] = "";
//        }
//        Arrays.fill(arr, "");
//        System.out.println(Arrays.toString(arr));

//        // 85, 65, 90으로 구성된 int배열을 선언하고, 총합과 평균을 구해보시오.
//        int[] arr = {85, 65, 90};
//        int sum = 0;
//
//        for(int i = 0 ; i < arr.length ; i++) {
//            sum += arr[i];
//        }
//        double avg = (double) sum / arr.length;
//        System.out.println(sum + " " + avg);

//        // 배열의 최대값, 최소값
//        int[] arr = {10, 20, 30, 12, 8, 17};
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for(int i = 0 ; i < arr.length ; i++) {
//            if(arr[i] > max) {
//                max = arr[i];
//            }
//            if(arr[i] < min) {
//                min = arr[i];
//            }
//        }
//        System.out.println("max: " + max + "\nmin: " + min);
//        System.out.println(Arrays.stream(arr).max());

//        // 배열의 자리 바꾸기
//        int[] arr = { 20, 10, 30 };
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;
//        System.out.println(Arrays.toString(arr));

//        // 배열 뒤집기
//        int[] arr = {10, 20, 30, 40};
//        int[] newArr = new int[arr.length];
//        for(int i = arr.length - 1 ; i >= 0 ; i--) {
//            newArr[arr.length - i - 1] = arr[i];
//        }
//        System.out.println(Arrays.toString(newArr));

//        // 배열의 정렬
//        int[] arr = {17, 12, 20 ,10 ,15};
//        Arrays.sort(arr); // 오름차순 정렬
////        Arrays.sort(arr, Comparator.reverseOrder()); // 원시자료형은 Comparator 사용 불가능
//        System.out.println(Arrays.toString(arr));
//        String[] stArr = {"abc", "aaa", "acb", "abb"};
//        Arrays.sort(stArr, Comparator.reverseOrder()); // 내림차순 // 숫자 안 됨
//        System.out.println(Arrays.toString(stArr));

        // 선택정렬 알고리즘 직접 구현







    }
}
