import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] a = new int[n+1];
        int sum = 0;
        int count = 1;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i <= n; i++) {
            if (a[i] == 1) {
                if (a[i] == a[i-1]) {
                    count++;
                    sum += count;
                }
                else {
                    count = 1;
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
