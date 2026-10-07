import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < queries.length; i++) {
            sb = new StringBuilder();

            int s = queries[i][0];
            int e = queries[i][1];

            sb.append(my_string.substring(0, s));

            String temp = new StringBuilder(
                my_string.substring(s, e + 1)
            ).reverse().toString();

            sb.append(temp);

            sb.append(my_string.substring(e + 1));

            my_string = sb.toString();
        }

        return my_string;
    }
}