package C02ClassBasic;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 조합(combination)과 순열(permutation)
// 주로 백트래킹 알고리즘 상황에서 사용
public class C12RecrusiveCombiPermu {
    public static void main(String[] args) {
        // 2중 for문을 활용하여 helloworld1 helloworld2 ... helloworldN 출력
//        int total = 0;
//        for(int i = 0 ; i < 3 ; i++) {
//            for(int j = 0 ; j < 3 ; j++) {
//                System.out.println("helloworld" + total);
//                total++;
//            }
//        }

        // 위 for문의 반복횟수는 동적으로 결정되지 않고, 정적으로 코딩할 수 밖에 없는 한계가 존재
//        forRecur(0, 2);

        // 재귀함수 예제 : 조합
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        // 숫자 1, 2, 3, 4를 가지고 만들 수 있는 2개짜리 숫자 조합을 이중리스트에 담아 출력
        // [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
//        List<List<Integer>> doubleList = new ArrayList<>();
//
//        for(int i = 0 ; i < myList.size() ; i++) {
//            for(int j = i+1 ; j < myList.size() ; j++) {
//                List<Integer> list = new ArrayList<>();
//                list.add(i+1);
//                list.add(j+1);
//                doubleList.add(list);
//            }
//        }
//        System.out.println(doubleList);
//        List<List<Integer>> doubleList = new ArrayList<>();
//        List<Integer> list = new ArrayList<>();
//
//        for(int i = 0 ; i < myList.size() ; i++) {
//            list.add(i+1);
//            for(int j = i+1 ; j < myList.size() ; j++) {
//                list.add(j+1);
//                doubleList.add(new ArrayList<>(list)); // 주소 공유를 막음
//                list.remove(list.size()-1);
//            }
//            list.remove(list.size()-1);
//        }
//

        List<List<Integer>> doubleList = new ArrayList<>();
//        combi(0, myList, new ArrayList<>(), doubleList, 3);
//        System.out.println(doubleList);

        // 1, 2, 3, 4를 n개씩 뽑은 순열구하기
        // [[1, 2], [1, 3], [1, 4], [2, 1], [2, 3], ... [4, 3]]
        permu(myList, new ArrayList<>(), doubleList, 2, new boolean[myList.size()]);
        System.out.println(doubleList);

        // 선이해 <-> 선암기
        // 백준 : 15649 - N과 M
        // 백준 : 6603 - 로또
    }
//    static boolean[] isVisited = new boolean[4];
//    static void permu(List<Integer> myList, List<Integer> temp, List<List<Integer>> doubleList, int target) {
//
//        if(temp.size() == target) {
//            doubleList.add(new ArrayList<>(temp));
//            return;
//        }
//
//        for(int i = 0 ; i < myList.size() ; i++) {
//            if(!isVisited[i]) {
//                temp.add(myList.get(i));
//                isVisited[i] = true;
//                permu(myList, temp, doubleList, target);
//                temp.remove(temp.size()-1);
//                isVisited[i] = false;
//            }
//        }
//    }

    static void permu(List<Integer> myList, List<Integer> temp, List<List<Integer>> doubleList, int target, boolean[] visited) {
        if(temp.size() == target) {
            doubleList.add(new ArrayList<>(temp));
            return;
        }

        for(int i = 0 ; i < myList.size() ; i++) {
            if(!visited[i]) {
                temp.add(myList.get(i));
                visited[i] = true;
                permu(myList, temp, doubleList, target, visited);
                temp.remove(temp.size()-1);
                visited[i] = false;
            }
        }
    }

    static void combi(int start, List<Integer> myList, List<Integer> temp, List<List<Integer>> doubleList, int target) {
        if(temp.size() == target) {
            doubleList.add(new ArrayList<>(temp));
            return;
        }

        for(int i = start ; i < myList.size() ; i++) {
            temp.add(myList.get(i));
            combi(i+1, myList, temp, doubleList, target);
            temp.remove(temp.size()-1);
        }
    }

    static int count = 0;
    static void forRecur(int num, int target) {
        if(num == target) {
            System.out.println("hello"); // 9번
            count++;
            return;
        }
        for(int i = 0 ; i < 3 ; i++) {
//            System.out.println("hello"); // 12번
            forRecur(num+1, target);
        }
    }


}
