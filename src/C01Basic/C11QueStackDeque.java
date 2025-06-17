package C01Basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class C11QueStackDeque {
    public static void main(String[] args) {

//        // Queue 인터페이스를 LinkedList가 구현한 아래와 같은 방식을 가장 많이 사용
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
//
//        // poll : Queue에서 데이터를 삭제하면서, 동시에 return하는 메서드
//        int temp = myQue.poll();
//        System.out.println(temp);
//        System.out.println(myQue);
//
//        // peek : queue에서 데이터를 삭제하지 않고, 가장 앞의 데이터를 반환
//        int temp2 = myQue.peek();
//        System.out.println(temp2);
//        System.out.println(myQue);
//
//        // LinkedList와 ArrayList 성능차이 비교
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        long startTime = System.currentTimeMillis();
//        for(int i = 0 ; i < 100000 ; i++) {
//            linkedList.add(0, i);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("LinkedList에 값 중간 add 시에 소요시간 : " + (endTime - startTime));
//
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        long startTime2 = System.currentTimeMillis();
//        for(int i = 0 ; i < 100000 ; i++) {
//            arrayList.add(0, i);
//        }
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("ArrayList에 값 중간 add 시에 소요시간 : " + (endTime2 - startTime2));

//        Queue<String> myQue = new LinkedList<>();
//        myQue.add("문서1");
//        myQue.add("문서2");
//        myQue.add("문서3");
//        myQue.add("문서4");
//
//        // queue는 일반적으로 while문을 통해 요소 소모
//        while(!myQue.isEmpty()) {
//            System.out.println(myQue.poll());
//            // 2개씩 poll을 할 경우에는 queue가 empty가 되지 않도록 유의.
//        }

        // 백준 : 카드2
        // 백준 : 요세푸스 문제 0

//        // 길이 제한 큐
//        Queue<String> blockingQueue = new ArrayBlockingQueue<>(3);
////        blockingQueue.add("문서1"); // 용량 제한 상관없이 추가
////        blockingQueue.add("문서2");
////        blockingQueue.add("문서3");
////        blockingQueue.add("문서4");
//        blockingQueue.offer("문서1"); // 용량 제한이 없는 경우에만 추가
//        blockingQueue.offer("문서2");
//        blockingQueue.offer("문서3");
//        blockingQueue.offer("문서4");
//        System.out.println(blockingQueue);

        // 우선 순위 큐
    }
}
