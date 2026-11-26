import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            a[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(a);
        int result = Integer.parseInt(br.readLine());
        int count = 0;
        br.close();

        int s = 0;
        int e = n - 1;
        while (s < e) {
            int temp = a[s] + a[e];
            if (temp == result) {
                count++;
                s++;
                e--;
            }
            else if (temp > result)
                e--;
            else
                s++;
        }
        System.out.println(count);
    }
}