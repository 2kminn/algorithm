import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[5];
        int count = 0;
        for (int i = 0; i < 5; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
        Arrays.sort(a);
        int temp = a[0];

        while (true) {
            for (int i = 0; i < 5; i++) {
                if (temp % a[i] == 0) {
                    count++;
                }
            }
            if (count > 2)
                break;
            temp++;
            count = 0;
        }
        System.out.println(temp);
    }
}