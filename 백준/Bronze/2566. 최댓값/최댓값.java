import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int max = 0;
        int x = -1;
        int y = -1;

        int [][] a = new int[9][9];
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
                if (a[i][j] > max) {
                    max = a[i][j];
                    x = i+1;
                    y = j+1;
                }
                else if (max == 0) {
                    x = 1;
                    y = 1;
                }
            }
        }
        bw.write(String.valueOf(max) + "\n");
        bw.write(String.valueOf(x + " " + y));
        br.close();
        bw.close();
    }
}