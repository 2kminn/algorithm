import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String s = st.nextToken();
        int n = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
        System.out.println(sb);
    }
}