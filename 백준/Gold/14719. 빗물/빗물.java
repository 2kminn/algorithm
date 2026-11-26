import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int [] a = new int[W];
        int result = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < W; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < W - 1; i++) {
            int r = 0;
            int l = 0;
            for (int j = 0; j < i; j++)
                l = Math.max(l,a[j]);
            for (int j = i + 1; j < W; j++)
                r = Math.max(r, a[j]);
            if (a[i] < l && a[i] < r)
                result += Math.min(r, l) - a[i];
        }
        System.out.println(result);
    }
}