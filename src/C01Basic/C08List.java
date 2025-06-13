package C01Basic;

import java.util.*;

public class C08List {
    public static void main(String[] args) {
//        // List 선언 방법1
//        ArrayList<String> myList1 = new ArrayList<String>();
//        ArrayList<String> myList2 = new ArrayList<>();
//
//        // List 선언 방법2 : 가장 일반적인 방법
//        List<String> myList3 = new ArrayList<>();
//
//
//        // 초기값 세팅방법1 : 개별 data add
//        myList3.add("java");
//        myList3.add("python");
//        myList3.add("C++");
//
//        System.out.println(myList3);
//
//        // 초기값 세팅방법2: 배열을 리스트로 변환
//        String[] arr = {"java", "python", "C++"};
//        List<String> myList4 = new ArrayList<>(Arrays.asList(arr));
//        System.out.println(myList4);
//
//        int[] intArr = {10, 20, 30};
//        List<Integer> myIntList = new ArrayList<>();
//        for(int i : intArr) {
//            myIntList.add(i);
//        }

        // add 메서드 : List에 값을 하나씩 추가하는 메서드이다.
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(0, 30); // ArrayList는 중간 데이터 삽입은 성능 비효율적 (삭제도 마찬가지)
//        System.out.println(myList);
//
//        // get(index) : 특정 index의 요소 반환
//        System.out.println(myList.get(0));
//
//        // size() : 리스트의 개수(길이)를 반환
//        System.out.println(myList.size());
//        for(int i = 0 ; i < myList.size() ; i++) {
//            System.out.println(myList.get(i));
//        }
//        for(int value : myList) {
//            System.out.println(value);
//        }

//        // remove : 요소 삭제
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//        // 1) index 를 통한 삭제 2) value 를 통한 삭제 (일반적이지 않음)
//        myList.remove(0);
//        myList.remove(Integer.valueOf(30));
//        System.out.println(myList);
//
//        // clear : 요소 전체 삭제
//        myList.clear();
//        System.out.println(myList.isEmpty());

        // indexOf : 특정 값을 찾아 인덱스 return (중복되면 가장 먼저 나오는 값을 리턴)
//        List<Integer> mylist2 = new ArrayList<>();
//        mylist2.add(10);
//        mylist2.add(20);
//        mylist2.add(30);
//        mylist2.add(30);
//        System.out.println(mylist2.indexOf(30));
//
//        // contains : 값이 있는지 없는지 여부를 return
//        System.out.println(mylist2.contains(20));

        // 프로그래머스 n의 배수 고르기

        // 정렬 : 방법 2가지 (Collections 클래스 사용, 객체 사용)
//        List<Integer> myList = new ArrayList<>();
//        myList.add(5);
//        myList.add(3);
//        myList.add(2);
//        myList.add(1);
//        myList.add(4);
//
//        // Collections.sort()
//        Collections.sort(myList);
//        Collections.sort(myList, Comparator.reverseOrder());
//        System.out.println(myList);
//
//        // 객체명(ArrayList클래스).sort()
//        myList.sort(Comparator.naturalOrder());
//        myList.sort(Comparator.reverseOrder());

        // 이중리스트 : 리스트안의 리스트
//        [[1, 2], [3, 4] [5, 6]]
//        List<List<Integer>> myList = new ArrayList();
//        List<Integer> myList1 = new ArrayList<>();
//        myList.add(myList1); // 리스트 안의 리스트 변수는 의미가 없음
//        myList.add(new ArrayList<>());
//        myList.get(0).add(1);
//        myList.get(0).add(2); // [[1, 2], []]
//        myList.get(1).add(3);
//        myList.get(1).add(4); // [[1, 2], [3, 4]]
//
//        // for문을 이용해서 [[1, 2, 3], [4, 5, 6], [7, 8, 9], [10, 11, 12]]
//        List<List<Integer>> list = new ArrayList<>();
//        int num = 1;
//        for(int i = 0 ; i < 4 ; i++) {
//            list.add(new ArrayList<>());
//            for(int j = 0 ; j < 3 ; j++) {
//                list.get(i).add(num);
//                num++;
//            }
//        }
//        System.out.println(list);

        // 리스트안에 배열
        // [{1, 2}, {1, 2, 3}, {1, 2, 3, 4}]
        List<int[]> list = new ArrayList<>();
        list.add(new int[] {1, 2});
        list.add(new int[] {1, 2, 3});
        list.add(new int[] {1, 2, 3, 4});
        for(int i = 0 ; i < list.size() ; i++) {
            for(int j = 0 ; j < list.get(i).length ; j++) {
                System.out.print(list.get(i)[j] + " ");
            }
            System.out.println("");
        }

    }
}
