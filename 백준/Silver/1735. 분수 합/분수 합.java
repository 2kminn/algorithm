import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int a1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        int b1 = Integer.parseInt(st.nextToken());
        br.close();

        int A = a * b1 + b * a1;
        int B = a1 * b1;
        int count = 2;

        while (true) {
            if (A % count == 0 && B % count == 0) {
                A /= count;
                B /= count;
            } else count++;
            if (count > Math.min(A, B)) {
                sb.append(A + " " + B);
                break;
            }
        }
        System.out.println(sb);
    }
}
