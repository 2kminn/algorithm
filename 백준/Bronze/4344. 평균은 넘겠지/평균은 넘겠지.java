import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0 ; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int count = m;
            int [] a = new int[m];
            int sum = 0;
            int avg = 0;
            for (int j = 0; j < m; j++) {
                int num = Integer.parseInt(st.nextToken());
                a[j] = num;
                sum += num;
            }
            avg = sum / m;
            Arrays.sort(a);
            for (int j = 0; j < m; j++) {
                if (a[j] <= avg)
                    count--;
            }
            double d = ((double)count / m) * 100;
            String result = String.format("%.3f",d);
            sb.append(result).append("%\n");
        }
        br.close();
        System.out.println(sb);
    }
}
