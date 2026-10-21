import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] height = new int[100];
        
        for (int n = 1; n <= 10; n++) {
            int dump = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 100; i++) {
            	height[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(height);
            
            for (int i = 0; i < dump; i++) {
                height[0]++;
                height[99]--;
                Arrays.sort(height);
            }
            sb.append("#" + n + " ").append(height[99] - height[0] + "\n");
        }
        System.out.println(sb);
	}
}