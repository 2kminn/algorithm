import java.io.*;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int [][] a = new int[n][2];

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 2; j++)
                    a[i][j] = Integer.parseInt(st.nextToken());
            }
            int xmin = a[0][0];
            int ymin = a[0][0];
            int xmax = a[0][0];
            int ymax = a[0][0];

            for (int i = 0; i < a.length; i++) {
                if (a[i][0] < xmin)
                    xmin = a[i][0];
                if (a[i][0] > xmax)
                    xmax = a[i][0];
                if (a[i][1] < ymin)
                    ymin = a[i][1];
                if (a[i][1] > ymax)
                    ymax = a[i][1];
            }
            if (n == 1)
                System.out.println(0);
            else
                System.out.println((xmax - xmin) * (ymax - ymin));
        }
    }