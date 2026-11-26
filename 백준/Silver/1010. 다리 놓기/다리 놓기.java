import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[][] a = new int[30][30];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            sb.append(combi(M, N) + "\n");
        }
        System.out.println(sb);
    }
    static int combi(int n, int r) {
        if (a[n][r] > 0)
            return a[n][r];
        if (n == r || r == 0)
            return a[n][r] = 1;
        return a[n][r] = combi(n-1, r-1) + combi(n-1, r);
    }
}