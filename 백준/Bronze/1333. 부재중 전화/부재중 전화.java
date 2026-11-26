import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int interlude = 5;
        int tik = 0;

        while (true) {
            if (tik >= l * n + interlude * (n - 1)) {
                while (tik % d != 0) {
                    tik++;
                }
                break;
            }
            if (tik % (l + interlude) >= l && tik % d == 0) {
                break;
            }
            tik++;
        }
        System.out.println(tik);
    }
}