import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int Q = 0;
        int D = 0;
        int N = 0;
        int P = 0;

        int a = Integer.parseInt(br.readLine());
        for (int i = 0; i < a; i++) {
            int num = Integer.parseInt(br.readLine());
            Q = num / 25;
            num = num % 25;
            D = num / 10;
            num = num % 10;
            N = num / 5;
            num = num % 5;
            P = num / 1;
            bw.write(Q + " "  + D + " " + N + " " + P);
            bw.write("\n");
            }
        br.close();
        bw.close();
    }
}