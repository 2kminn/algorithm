import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int [] a = new int[3];
            a[0] = Integer.parseInt(st.nextToken());
            a[1] = Integer.parseInt(st.nextToken());
            a[2] = Integer.parseInt(st.nextToken());
            Arrays.sort(a);
            int sum = a[0] + a[1] + a[2];

            if (a[0] + a[1] <= a[2]) {
                for (int i = a[0] + a[1]; i <= a[2]; i++)
                    sum -= 1;
                System.out.println(sum);
            }
            else
                System.out.println(sum);
        }
    }