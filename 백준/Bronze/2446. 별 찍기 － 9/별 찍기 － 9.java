import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = n-1; i > 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                sb.append(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++)
                sb.append("*");
            sb.append("\n");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                sb.append(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++)
                sb.append("*");
            sb.append("\n");
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
        br.close();
    }
}