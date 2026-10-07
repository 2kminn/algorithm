import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList <Integer> answer = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            String s = String.valueOf(i);
            
            if(s.replace("0", "").replace("5", "").isEmpty()) {
                answer.add(i);
            }
        }
        if (answer.isEmpty())
            return new int[]{-1};
        else
            return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}