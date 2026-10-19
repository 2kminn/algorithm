import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(indices);
        int temp = 0;

        for (int i = 0; i < my_string.length(); i++) {
            if (temp < indices.length && i == indices[temp]) {
                temp++;
                continue;
            }

            sb.append(my_string.charAt(i));
        }

        return sb.toString();
    }
}