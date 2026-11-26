import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int [] a = new int[n];
        int [][] c = new int[4001][2];      // 0 : 양수   1 : 음수
        int sum = 0;
        int max = 0;
        int num = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
            sum += a[i];
            if (a[i] >= 0) {
                c[a[i]][0]++;
                if (max < c[a[i]][0])
                    max = c[a[i]][0];
            }
            else if (a[i] < 0) {
                c[Math.abs(a[i])][1]++;
                if (max < c[Math.abs(a[i])][1])
                    max = c[Math.abs(a[i])][1];
            }
        }
        Arrays.sort(a);
        sb.append(Math.round((double)sum / n)).append("\n");
        sb.append(a[a.length / 2]).append("\n");

        for (int i = 4000; i >= 0; i--) {
            if (c[i][1] == max) {
                num = -i;
                count++;
            }
            if (count >= 2)
                break;
        }

        for (int i = 0; i < 4001; i++) {
            if (c[i][0] == max) {
                num = i;
                count++;
            }
            if (count >= 2)
                break;
        }
        sb.append(num).append("\n");
        sb.append(a[a.length-1] - a[0]);

        System.out.println(sb);
        br.close();
    }
}