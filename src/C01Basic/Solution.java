import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < numlist.length ; i++) {
            if(numlist[i] % n == 0) {
                list.add(numlist[i]);
            }
        }

        int[] answer = new int[list.size()];
        for(int i = 0 ; i < list.size() ; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}