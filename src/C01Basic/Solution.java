package C01Basic;

class Solution {
    public int solution(String A, String B) {
        int answer = 0;

        if(A.equals(B)) {
            return 0;
        }
        String temp = A;
        for(int i = 0 ; i <= A.length() ; i++) {
            temp = move(temp);
            if(temp.equals(B)) {
                return 1;
            } else {
                if(i == A.length()) {
                    return -1;
                }
            }
        }

        return answer;
    }


    static String move(String str) {
        // 맨 뒤 가져와서
        char c = str.charAt(str.length()-1);

        // 자른거
        String sub = str.substring(0, str.length()-1);

        // 앞에 붙이기
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        sb.append(sub);

        return String.valueOf(sb);
    }
}

