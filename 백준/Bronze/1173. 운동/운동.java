import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int time = 0;
        int min = b;

        if (b + d > c)
            time = -1;
        else {
            while (true) {
                if (b + d <= c) {
                    a--;
                    b += d;
                } else
                    b -= e;

                if (b < min) {
                    b = min;
                }
                time++;
                if (a == 0)
                    break;
            }
        }
        System.out.println(time);
    }
}