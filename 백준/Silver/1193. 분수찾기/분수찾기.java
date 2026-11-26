import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 1;
        int count_sum = 0;

        while (true) {
            if(n <= count_sum + count) {
                if (count % 2 == 1) {
                    bw.write(String.valueOf((count - (n - count_sum - 1)) + "/" + (n - count_sum)));
                    break;
                }
                else {
                    bw.write(String.valueOf((n - count_sum) + "/" + (count - (n - count_sum - 1))));
                    break;
                }
            }
            else {
                count_sum += count;
                count++;
            }
        }
        br.close();
        bw.close();
    }
}