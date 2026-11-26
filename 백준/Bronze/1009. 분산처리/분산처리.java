import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0 ; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int result = a % 10;
            if (a % 10 == 0) {
                sb.append(10).append("\n");
                continue;
            }
            for (int j = 1; j < b; j++) {
                result = (result * a) % 10;
            }
            sb.append(result + "\n");
        }
        System.out.println(sb);
    }
}