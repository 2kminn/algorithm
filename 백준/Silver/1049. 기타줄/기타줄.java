import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int set = 1001;
        int each = 1001;
        int sum = 0;
        int [][] a = new int[M][2];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            a[i][0] = Integer.parseInt(st.nextToken());     // 세트
            a[i][1] = Integer.parseInt(st.nextToken());     // 낱개
        }
        br.close();

        for (int i = 0; i < M; i++) {
            if (set > a[i][0]) {
                set = a[i][0];
            }
            if (each > a[i][1]) {
                each = a[i][1];
            }
        }
        while (N > 0) {
            if (N / 6 >= 1) {
                if (set <= 6 * each) {
                    sum += set;
                    N -= 6;
                }
                else {
                    sum += (6 * each);
                    N -= 6;
                }
            }
            else {
                int num = N % 6;
                if (num * each > set) {
                    sum += set;
                    N -= 6;
                }
                else {
                    sum += num * each;
                    N -= num;
                }
            }
        }
        System.out.println(sum);
    }
}