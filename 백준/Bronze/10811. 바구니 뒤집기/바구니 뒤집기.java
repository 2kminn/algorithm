import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int [] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = i+1;
        }

        for (int k = 0; k < M; k++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;

            while (a<b) {
                int temp = B[a];
                B[a++] = B[b];
                B[b--] = temp;
            }
        }
        for (int baguni:B)
            System.out.print(baguni + " ");
        br.close();
    }
}