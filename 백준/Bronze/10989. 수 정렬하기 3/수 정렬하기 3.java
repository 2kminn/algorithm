import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int [] a = new int[10001];
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            a[Integer.parseInt(br.readLine())]++;
        }
        br.close();

        for (int i = 1; i < 10001; i++) {
            while (a[i] > 0) {
                sb.append(i).append("\n");
                a[i]--;
            }
        }
        System.out.println(sb);
    }
}