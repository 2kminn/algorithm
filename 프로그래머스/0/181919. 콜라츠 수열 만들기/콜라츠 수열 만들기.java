import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(n);
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
                a.add(n);
            }
            else {
                n = n * 3 + 1;
                a.add(n);
            }
        }
        
        int[] answer = new int[a.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = a.get(i);
        }
        
        return answer;
    }
}