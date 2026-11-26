import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int [] k = new int[num + 1];
        int sum = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= num; i++) {
            k[0] = 0;
            k[i] = k[i-1] + Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(k[b] - k[a - 1]).append("\n");
        }
        br.close();
        System.out.println(sb);
    }
}