import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                sb.append("*");
            }
            sb.append("\n");
            for (int k = n; k >= n - i; k--)
                sb.append(" ");
        }
        System.out.println(sb);
    }
}