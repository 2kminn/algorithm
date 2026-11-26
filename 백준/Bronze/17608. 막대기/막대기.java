import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int [] a = new int[n];
        int count = 1;

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        int max = a[a.length-1];

        for (int i = a.length-2; i >= 0; i--) {
            if (max < a[i]) {
                count++;
                max = a[i];
            }
        }
        System.out.println(count);
    }
}