import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = prime(Long.parseLong(br.readLine()));
        }

        for (long k : a)
            System.out.println(k);
    }

    public static long prime(long number) {
        if (number < 2)
            return 2;
        while (true) {
            long count = 0;
            for (long i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0)
                return number;
            number++;
        }
    }
}
