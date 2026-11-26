import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int [] num = new int[N];

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++)
            num[i] = Integer.parseInt(st.nextToken());

        int max = num[0];
        int min = num[0];

        for (int i = 0; i < N; i++) {
            if (num[i] > max)
                max = num[i];
            if (num[i] < min)
                min = num[i];
        }
        System.out.println(min);
        System.out.println(max);
        br.close();
    }
}