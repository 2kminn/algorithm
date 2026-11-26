import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0)
                break;
            int number_count = 0;
            for (int i = n + 1; i <= 2 * n; i++) {
                int count = 0;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        count++;
                        break;
                    }
                }
                if (count == 0 && i >= 2)
                    number_count++;
            }
            sb.append(number_count).append("\n");
        }
        System.out.println(sb);
    }
}
