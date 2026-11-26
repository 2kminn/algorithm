import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> h = new HashMap<>();
        HashMap<Integer, String> h1 = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String s = br.readLine();
            h.put(s, i);
            h1.put(i, s);
        }
        for (int i = 1; i <= m; i++) {
            String s = br.readLine();
            if (h.containsKey(s)) {
                sb.append(h.get(s)).append("\n");
            } else {
                int a = Integer.parseInt(s);
                sb.append(h1.get(a)).append("\n");
            }
        }
        br.close();
        System.out.println(sb);
    }
}
