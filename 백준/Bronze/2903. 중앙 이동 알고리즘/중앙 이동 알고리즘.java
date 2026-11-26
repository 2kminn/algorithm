import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int result = 0;
        int side = 2;
        for (int i = 0; i < n; i++) {
            side = side * 2 - 1;
            result = side * side;
        }
        bw.write(String.valueOf(result));
        br.close();
        bw.close();
    }
}