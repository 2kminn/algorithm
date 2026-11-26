import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int gcd = 0;
        for (int i = 0; i < n - 1; i++) {
            int distance = a[i + 1] - a[i];
            gcd = findgcd(distance, gcd);
        }
        System.out.println((a[n-1]-a[0])/gcd+1-(a.length));
    }
    static int findgcd(int A, int B) {
        while (B != 0) {
            int R = A % B;
            A = B;
            B = R;
        }
        return A;
    }
}
