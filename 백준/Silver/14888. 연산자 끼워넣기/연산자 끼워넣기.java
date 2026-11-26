import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[] a;
    static int[] b = new int[4];;
    static int number = 0;
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        number = Integer.parseInt(br.readLine());
        a = new int[number];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < number; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        cal(a[0], 1);
        System.out.println(max);
        System.out.println(min);

    }

    public static void cal(int num, int index) {
        if (index == number) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (b[i] > 0) {
                b[i]--;

                switch (i) {
                    case (0): cal(num + a[index], index + 1); break;
                    case (1): cal(num - a[index], index + 1); break;
                    case (2): cal(num * a[index], index + 1); break;
                    case (3): cal(num / a[index], index + 1); break;
                }
                b[i]++;
            }
        }

    }
}