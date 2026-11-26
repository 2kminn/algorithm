import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long temp_a = a;
        long temp_b = b;
        br.close();
        
        while (true)
            if (a == 1 || b == 1) {
                sb.append(a * b).append("\n");
                break;
            } else if (a < b) {
                a += temp_a;
            } else if (a > b) {
                b += temp_b;
            } else {
                sb.append(a).append("\n");
                break;
            }
        System.out.println(sb);
    }
}
