import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        int len = my_string.length();
        
        for (int i = 0; i < len / m; i++) {
            sb.append(my_string.charAt(m * i + c - 1));
        }
        
        return sb.toString();
    }
}