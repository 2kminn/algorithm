import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
        	int[] std = new int[101];
			int max = 0;
            
            for (int j = 0; j <1000; j++) {
            	int a = Integer.parseInt(st.nextToken());
                std[a]++;
                if (std[max] < std[a]) {
                    max = a;
            	}
               	else if (std[max] == std[a]) {
                	max = Math.max(max, a);
                }
			}
            sb.append("#" + num + " ").append(max + "\n");
        }
        System.out.println(sb);
    }
}