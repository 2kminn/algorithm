import java.io.*;
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            int n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
            
            int[] a = new int[n];
            int count = 0;

            for (int j = 0; j < n; j++) {
                a[j] = Integer.parseInt(st.nextToken());
			}
            
            for (int j = 2; j < n - 2; j++) {
                int max = Math.max(
					Math.max(a[j - 2], a[j - 1]),
                    Math.max(a[j + 1], a[j + 2])); 
                
            	if (a[j] > max) {
                	count += a[j] - max;
            	}
            }
            sb.append("#" + i + " ").append(count).append("\n");
        }
        System.out.println(sb);
    }
}