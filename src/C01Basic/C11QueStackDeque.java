package C01Basic;

import java.util.*;
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

//        // 우선 순위 큐 : 데이터를 poll할 때 정렬된 데이터 결과값 보장
//        // 전체 데이터가 계속해서 변경되면서 지속적으로 최소값을 추출해야 하는 경우
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        while(!pq.isEmpty()) {
//            // 1개씩 poll할 때마다 최소값을 뽑아낸다.
//            System.out.println(pq.poll()); // 뽑을 때 복잡도 LogN // 다 뽑는건 정렬된 결과라서 NLogN
//            // add할 때 까지는 전체 정렬이 안 된 상태.
//        }
        
//        // 최소 힙 - 백준
//
//        // 최대 힙
//        Queue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
//        pq2.add(30);
//        pq2.add(20);
//        pq2.add(10);
//        pq2.add(40);
//        pq2.add(50);
//        while(!pq2.isEmpty()) {
//            System.out.println(pq2.poll());
//        }

        // 프로그래머스 - 더 맵게

        // stack : 후입 선출
//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//
//        System.out.println(stack.pop()); // 제거되면서 값 Return
//        System.out.println(stack.peek()); // 값만 Return
//        System.out.println(stack.size());
//        System.out.println(stack.isEmpty());

        // 같은 숫자는 싫어 - 프로그래머스
        // 올바른 괄호 - 프로그래머스

        // deque : addFirst, addLast, pollLast, pollFirst, peekFirst, peekLast
        Deque<Integer> d1 = new ArrayDeque<>();
        d1.addLast(10);
        d1.addLast(20);
        d1.addFirst(30);

        System.out.println(d1.pollLast()); // 20
        System.out.println(d1.pollFirst()); // 30
        System.out.println(d1.peekLast()); // 10
    }
}
