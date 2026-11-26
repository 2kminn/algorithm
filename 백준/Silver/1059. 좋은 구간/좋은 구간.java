import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        int[] a = new int[c];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < c; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        int n = Integer.parseInt(br.readLine());
        int min = 0;
        int max = 0;
        int count = 0;

        for (int i = 0; i < c - 1; i++) {
            if (a[i] < n && a[i + 1] > n) {
                min = a[i] + 1;
                max = a[i + 1] - 1;
            }
        }
        if (n < a[0]) {         // n이 첫번째 원소보다 작을 때
            min = 1;
            max = a[0] - 1;
        }
        if (n > a[c-1]) {
            min = a[c-1] + 1;
            max = 1000;
        }

        while (min < n) {
            for (int i = n; i <= max; i++) {
                count++;
            }
            min++;
        }
        if (min == n) {
            for (int i = min; i < max; i++) {
                count++;
            }
        }
        System.out.println(count);
    }
}