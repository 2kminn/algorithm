import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] a = new int[46];
        a[0] = 0;
        a[1] = 1;
        a[2] = 1;

        int n = Integer.parseInt(br.readLine());
        br.close();
        for (int i = 3; i <= n; i++) {
            a[i] = a[i-2] + a[i-1];
        }
        System.out.println(a[n]);
    }
}