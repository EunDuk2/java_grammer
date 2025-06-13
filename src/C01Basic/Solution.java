import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands[0].length];

        for(int i = 0 ; i < commands.length ; i++) {
            int a = commands[i][0];
            int b = commands[i][1];
            int c = commands[i][2];

            int[] arr = new int[b-a+1];

            for(int j = 0 ; j < arr.lengh ; j++) {
                arr[i] = commands[i][j+a-1]
            }
            System.out.println(Arrays.toString(arr[i]));
        }





        return answer;
    }
}