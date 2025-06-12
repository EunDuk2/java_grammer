package C01Basic;

import java.util.Arrays;

// 선택 정렬 알고리즘
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 1, 2, 6, 9, 13, 12, 8, 7, 10, 11};

        for(int i = 0 ; i < arr.length ; i++) {
            swap(arr, i, getIndexOfMinimum(arr, i));
            System.out.println(Arrays.toString(arr)); // 정렬 과정 출력
        }
    }

    // 배열이랑 인덱스 2개 받아서, 값 위치 바꿔서 저장
    static void swap(int[] arr, int startIndex, int endIndex) {
        int temp = arr[startIndex];
        arr[startIndex] = arr[endIndex];
        arr[endIndex] = temp;
    }

    // 배열이랑 시작 인덱스 받아서, 최소값 인덱스 반환
    static int getIndexOfMinimum(int[] arr, int startIndex) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        for(int i = startIndex ; i < arr.length ; i++) {
            if(arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}
