import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int n1 = n;
        br.close();
        int temp = 0;
        int count = 0;
        int a = 64;
        while (true) {
            if (a == n) {
                count++;
                break;
            }
            a /= 2;
            if (a <= n1) {
                count++;
                temp += a;
                n1 -= a;
                if (temp == n)
                    break;
            }
        }
        System.out.println(count);
    }
}