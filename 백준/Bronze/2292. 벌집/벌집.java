import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int range = 2;
        int count = 1;
        if (n == 1) {
            bw.write(String.valueOf(n));
        }
        else {
            while (n >= range) {
                range += 6 * count;
                count++;
            }
            bw.write(String.valueOf(count));
        }
        br.close();
        bw.close();
    }
}