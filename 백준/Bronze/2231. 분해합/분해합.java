import java.io.*;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int result = 0;
            for (int i = n / 2; i < n; i++) {
                int sum = 0;
                int a = i;
                while (a > 0) {
                    sum += a % 10;
                    a /= 10;
                }
                if (i + sum == n) {
                    result = i;
                    break;
                }
            }
            System.out.println(result);
        }
    }