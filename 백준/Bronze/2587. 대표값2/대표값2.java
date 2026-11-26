import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] a = new int[5];
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(br.readLine());
            sum += a[i];
        }
        Arrays.sort(a);
        System.out.printf("%d\n%d", sum/5, a[2]);
    }
}