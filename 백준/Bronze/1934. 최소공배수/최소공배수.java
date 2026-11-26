import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int temp_a = a;
            int temp_b = b;

            while (true)
            if (a == 1 || b == 1) {
                sb.append(a * b).append("\n");
                break;
            }
            else if (a < b) {
                a += temp_a;
            }
            else if (a > b) {
                b += temp_b;
            }
            else {
                sb.append(a).append("\n");
                break;
            }
        }
        System.out.println(sb);
    }
}
