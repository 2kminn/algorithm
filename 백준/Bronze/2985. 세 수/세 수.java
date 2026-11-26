import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        br.close();
        int max = Math.max(a,(Math.max(b, c)));
        if (max == a) {
            if (a == b + c)
                System.out.printf("%d=%d+%d", a, b, c);
            else if (a - b == c)
                System.out.printf("%d-%d=%d", a, b, c);
            else if (a == b * c)
                System.out.printf("%d=%d*%d", a, b, c);
            else if (a / b == c)
                System.out.printf("%d/%d=%d", a, b, c);
        }
        else if (max == b) {
            if (a == b - c)
                System.out.printf("%d=%d-%d", a, b, c);
            else if (a == b / c)
                System.out.printf("%d=%d/%d", a, b, c);
        }
        else {
            if (a + b == c)
                System.out.printf("%d+%d=%d", a, b, c);
            else if (a * b == c)
                System.out.printf("%d*%d=%d", a, b, c);
        }
    }
}