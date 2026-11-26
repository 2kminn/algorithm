import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static boolean [][] arr;
    public static int min = 64;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                if (s.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else arr[i][j] = false;
            }
        }
        int N1 = N - 7;
        int M1 = M - 7;
        for (int i = 0; i < N1; i++) {
            for (int j = 0; j < M1; j++)
                find(i, j);
        }
        System.out.println(min);
    }
    public static void find(int x, int y) {
        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0;
        boolean b = arr[x][y];

        for (int i = x; i < end_x; i++) {
            for (int j = y; j < end_y; j++) {
                if (arr[i][j] != b) {
                    count++;
                }
                b = (!b);
            }
            b = !b;
        }
        count = Math.min(count, 64 - count);
        min = Math.min(min, count);
    }
}
