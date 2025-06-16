package C01Basic;

import java.lang.invoke.SwitchPoint;
import java.util.*;

public class C09Map {
    public static void main(String[] args) {
////        key, value로 이루어진 자료구조
////        key 값은 중복이 있으면 value를 덮어쓰기
//        Map<String, Integer> sports = new HashMap<>();
//        sports.put("농구", 2);
//        sports.put("배구", 1);
//
////        map은 key를 통해 value를 get+
////        map에서 key 값을 통한 검색 복잡도는 O(1)
//        System.out.println(sports.get("농구"));
//
////        map의 전체 데이터 출력
////        map의 key값 접근시에 인덱스 사용 불가능(순서가 없음)
////        keySet(): map의 key 목록을 리턴하는 메서드
////        valies(): map의 value 목록을 리턴하는 메서드
//        int total = 0;
//        for(int v : sports.values()){
//            total += v;
//        }
//        System.out.println(total);
//
//        int total2 = 0;
//        for(String k : sports.keySet()){
//            total2 += sports.get(k);
//        }
//        System.out.println(total2);
//
////        remove: key를 통해 map의 요소 삭제
//        sports.remove("농구");
//        System.out.println(sports);
//
////        map에서 기존의 key값에 put할 경우 덮어쓰기
//        sports.put("배구", 10);
//        System.out.println(sports);
//
//        Map<String, String> sports = new HashMap<>();
//        sports.put("soccer", "축구");
//        sports.put("baseball", "야구");
//        sports.put("basketball", "농구");
//
////        putIfAbsent: key값이 없는 경우에만 put
//        sports.putIfAbsent("soccer", "운동");
//        sports.putIfAbsent("tennis", "테니스");
//        System.out.println(sports);
//
////        containsKey: 키가 있으면 true, 없으면 false
//        System.out.println(sports.containsKey("tennis"));
//        System.out.println(sports.containsKey("pingpong"));
//        System.out.println();
//
////        map 출력 방법 2가지
////        1. 강화된 for문 / for-each문
//        for (String k : sports.keySet()) {
//            System.out.println(k);
//            System.out.println(sports.get(k));
//        }
//
//        Set<String> mySet = sports.keySet();
//        for (String s : mySet) {
//            System.out.println(s);
//        }
//        System.out.println();

//        2. iterator를 통한 데이터 소모
//        Map<String, String> sports = new HashMap<>();
//        sports.put("soccer", "축구");
//        sports.put("baseball", "야구");
//        sports.put("basketball", "농구");
//
//        Iterator<String> iterators = sports.keySet().iterator();
////        next 메서드는 데이터를 하나씩 소모시키면서 값을 반환
//        System.out.println(iterators.next());
//
////        hasNext메서드는 Iterator 안에 그 다음값이 있는지 여부를 boolean으로 리턴
//        System.out.println(iterators.hasNext());
//        while(iterators.hasNext()) {
//            System.out.println(iterators.next());
//        }
//        // map은 key의 value 수를 count하는 목적으로 많이 활용
//        String[] arr = {"농구", "축구", "농구", "야구", "축구"};
//        // 농구: 2, 축구:2, 야구:1
//        Map<String, Integer> map = new HashMap<>();
//        for(int i = 0 ; i < arr.length ; i++) {
//            if (map.containsKey(arr[i])) {
//                map.put(arr[i], map.get(arr[i])+1);
//            } else {
//                map.put(arr[i], 1);
//            }
//            // getOrDefault(키값, 초기값) : key 값 없을 경우 초기값 리턴
////            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
//        }
//        System.out.println(map);
//
//        String[] removeArr = {"농구", "농구", "농구", "야구", "축구"};
//        // 농구:2, 축구:2, 야구:1에서 위 값 빼주기 -> 축구:1
//
//        for(String r : removeArr) {
//            if(map.containsKey(r)) {
//                if(map.get(r) == 1) {
//                    map.remove(r);
//                } else {
//                    map.put(r, map.get(r)-1);
//                }
//            }
//        }
//        System.out.println(map);

        //
//        Map<String, Integer> myMap = new HashMap<>();
//        myMap.put("축구", 3);
//        myMap.put("농구", 2);
//        myMap.put("야구", 1);
//
//        // 가장 value가 큰 키 값 찾기
//        String maxKey = "";
//        int max = Integer.MIN_VALUE;
//
//        for(String k : myMap.keySet()) {
//            if(myMap.get(k) > max) {
//                max = myMap.get(k);
//                maxKey = k;
//            }
//        }
//        System.out.println("최대 값의 키: " + maxKey);

//        // 백준 : 베스트 셀러
//        // 프로그래머스 : 완주하지 못한 선수
//        // 프로그래머스 : 의상
//
//        // LinkedHashMap : 데이터의 삽입순서를 보장 (유지)
//        Map<String, Integer> linkedMap = new LinkedHashMap<>();
//        linkedMap.put("hello5", 1);
//        linkedMap.put("hello4", 2);
//        linkedMap.put("hello3", 3);
//        linkedMap.put("hello2", 4);
//        linkedMap.put("hello1", 5);
//        for(String l : linkedMap.keySet()) {
//            System.out.println(l);
//        }
//
//        // TreeMap : key를 정렬(오름차순)하여 map을 저장
//        Map<String, Integer> treeMap = new TreeMap<>();
//        treeMap.put("hello5", 1);
//        treeMap.put("hello4", 2);
//        treeMap.put("hello3", 3);
//        treeMap.put("hello2", 4);
//        treeMap.put("hello1", 5);
//        for(String t : treeMap.keySet()) {
//            System.out.println(t);
//        }
//
//        // 백준 : 파일 정리
    }
}