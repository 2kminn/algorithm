import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        long b = Long.parseLong(br.readLine());
        long count = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] / b >= 1) {
                if ((a[i] % b) == 0) {
                    count += a[i] / b;
                }
                else {
                    count += ((a[i] / b) + 1);
                }
            }
            else {
                if (a[i] != 0)
                    count++;
            }
        }
        System.out.println(count * b);
    }
}
