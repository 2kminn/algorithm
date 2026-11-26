import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int count = 0;
        int [] a = new int[num + 1];
        int max = Integer.MIN_VALUE;

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < a.length; i++) {
            a[i] = a[i-1] + Integer.parseInt(st.nextToken());
        }
        br.close();
        for (int i = n; i <= num; i++) {
            int temp = a[i] - a[count];
            if (max < temp)
                max = temp;
            count++;
        }
        System.out.println(max);
    }
}