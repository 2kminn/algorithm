import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int temp = n;

        while (true) {
            n = n % 10 * 10 + (n % 10 + n / 10) % 10;
            count ++;
            if (temp == n) {
                System.out.println(count);
                break;
            }
        }
    }
}