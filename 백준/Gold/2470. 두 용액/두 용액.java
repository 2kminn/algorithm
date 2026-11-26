import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] a = new int[n];
        int [] result = new int[2];
        int min = Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            a[i] = Integer.parseInt(st.nextToken());
        br.close();
        Arrays.sort(a);
        int s = 0;
        int e = n - 1;
        while (s < e) {
            int sum = a[s] + a[e];
            if (min > Math.abs(sum)) {
                min = Math.abs(sum);

                result[0] = a[s];
                result[1] = a[e];
                if (sum == 0)
                    break;
            }
            if (sum > 0)
                e--;
            else
                s++;
        }
        System.out.printf("%d %d",result[0], result[1]);
    }
}