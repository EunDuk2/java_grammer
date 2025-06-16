package C01Basic;

import java.util.HashSet;
import java.util.Set;

public class C10Set {
    public static void main(String[] args) {
        // 중복X, 순서보장X
        Set<String> mySet = new HashSet<>();
        mySet.add("h");
        mySet.add("h");
        mySet.add("d");
        mySet.add("s");
        mySet.add("a");
        mySet.add("a");
        System.out.println(mySet);

    }
}
