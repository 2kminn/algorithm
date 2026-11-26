import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> A = new HashSet<>();
        HashSet<Integer> B = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < n; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < m; i++) {
            B.add(Integer.parseInt(st.nextToken()));
        }
        br.close();
        int sum = 0;

        // A - B
        for (int k : B) {
            if (!A.contains(k))
                sum++;
        }
        // B - A
        for (int k : A) {
            if (!B.contains(k))
                sum++;
        }
        System.out.println(sum);
    }
}
