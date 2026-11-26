import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum_a = 0;
        int sum_b = 0;
        int sum = 0;
        int result = 0;
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        while (a > 0) {
            sum_a = sum_a * 10 + a % 10;
            a /= 10;
        }
        while (b > 0) {
            sum_b = sum_b * 10 + b % 10;
            b /= 10;
        }
        sum = sum_a + sum_b;
        while (sum > 0) {
            result = result * 10 + sum % 10;
            sum /= 10;
        }
        System.out.println(result);
    }
}
