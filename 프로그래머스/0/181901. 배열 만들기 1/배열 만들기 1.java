import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        ArrayList <Integer> result = new ArrayList<>();
        for (int i = 1; i <= n / k; i++) {
            result.add(i * k);
        }
        return result.stream()
                   .mapToInt(Integer::intValue)
                   .toArray();
    }
}