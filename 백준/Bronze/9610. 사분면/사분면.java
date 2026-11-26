import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [][] a = new int[n][2];
        int num_1 = 0;
        int num_2 = 0;
        int num_3 = 0;
        int num_4 = 0;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a[i][0] = Integer.parseInt(st.nextToken());
            a[i][1] = Integer.parseInt(st.nextToken());
        }
        br.close();
        
        for (int i = 0; i < n; i++) {
            int x = a[i][0];
            int y = a[i][1];
            if (x > 0 && y > 0)
                num_1++;
            else if (x < 0 && y > 0)
                num_2++;
            else if (x < 0 && y < 0)
                num_3++;
            else if (x > 0 && y < 0)
                num_4++;
            else
                temp++;
        }
        System.out.println("Q1: " + num_1);
        System.out.println("Q2: " + num_2);
        System.out.println("Q3: " + num_3);
        System.out.println("Q4: " + num_4);
        System.out.println("AXIS: " + temp);
    }
}
