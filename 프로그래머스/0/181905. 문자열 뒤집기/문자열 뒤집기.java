import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (i >= s && i <= e) {
                sb.insert(s, my_string.charAt(i));
            }
            else {
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }
}