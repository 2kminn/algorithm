import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int [][] a = new int[9][9];

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        kk(a);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sb.append(a[i][j]).append(' ');
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }

    public static int kk(int [][] a) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] == 0) {
                    for (int k = 1; k <= 9; k++) {
                        if (xc(i, k, a) && yc(j, k, a) && bc(i, j, k, a)) {
                            a[i][j] = k;
                            if (kk(a) == 1) return 1;
                            a[i][j] = 0;
                        }
                    }
                    return 0;
                }
            }
        }
        return 1;
    }
    public static boolean xc(int row, int num, int[][] a) {
        for (int i = 0; i < 9; i++) {
            if (a[row][i] == num) return false;
        }
        return true;
    }

    public static boolean yc(int col, int num, int[][] a) {
        for (int i = 0; i < 9; i++) {
            if (a[i][col] == num) return false;
        }
        return true;
    }
    public static boolean bc(int row, int col, int num, int [][] a) {
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j < 3; j++) {
                if (a[sr + i][sc + j] == num) return false;
            }
        }
        return true;
    }
}
