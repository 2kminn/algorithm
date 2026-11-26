import java.io.*;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
           int n = Integer.parseInt(st.nextToken());
           int max = Integer.parseInt(st.nextToken());
           int [] a = new int[n];
           int sum = 0;
           int sum_max = 0;

           st = new StringTokenizer(br.readLine());
           for (int i = 0; i < n; i++)
               a[i] = Integer.parseInt(st.nextToken());

           for (int i = 0; i < n - 2; i++) {
               for (int j = i + 1; j < n - 1; j++) {
                   for (int k = j + 1; k < n; k ++) {
                       sum = a[i] + a[j] + a[k];
                       if (sum_max < sum && sum <= max)
                           sum_max = sum;
                   }
               }
           }
           System.out.println(sum_max);
        }
    }