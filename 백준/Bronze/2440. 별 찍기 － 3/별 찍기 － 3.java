import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            for (int k = n - i; k > 0; k--) {
                sb.append('*');
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}