import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int [] qs = new int[n];
        int [] el = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            qs[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            el[i] = Integer.parseInt(st.nextToken());
        }

        int count = Integer.parseInt(br.readLine());
        int [] a = new int[count];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (qs[i] == 0) {
                dq.addLast(el[i]);
            }
        }

        for (int i = 0; i < count; i++) {
            int temp = a[i];
            dq.addFirst(temp);
            int result = dq.removeLast();
            sb.append(result).append(" ");
        }
        System.out.println(sb);
    }
}
