import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        
        String s = br.readLine();
        
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
                sb.append(c);
            }
            else {
                c = Character.toLowerCase(c);
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}