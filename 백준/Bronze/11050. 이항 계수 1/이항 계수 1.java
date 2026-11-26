import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int a_mul = 1;
        int b_mul = 1;

        for (int i = a; i > 0; i--) {
            a_mul *= i;
        }
        for (int i = b; i > 0; i--) {
            b_mul *= i;
        }
        for (int i = a - b; i > 0; i--) {
            b_mul *= i;
        }
        System.out.println(a_mul / b_mul);
    }
}