import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList <Integer> answer = new ArrayList<>();
        int start = slicer[0];
        int end = slicer[1] + 1;
        int gap = 1;
        
        if (n == 1) {
            start = 0;
        }
        else if (n == 2) {
            end = num_list.length;
        }
        else if (n == 4) {
            gap = slicer[2];
        }
        
        for (int i = start; i < end; i += gap) {
            answer.add(num_list[i]);
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}