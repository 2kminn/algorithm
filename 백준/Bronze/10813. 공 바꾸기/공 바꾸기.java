import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int [] b = new int[N];
        int swap = 0;
        for (int n = 0; n < N; n++)
            b[n] = n+1;
        for (int m = 0; m < M; m++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            swap = b[i-1];
            b[i-1] = b[j-1];
            b[j-1] = swap;

        }
        for (int i = 0; i < N; i++)
            System.out.printf("%d ",b[i]);
        br.close();
    }
}