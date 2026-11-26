import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0 ; i< n; i++) {
            String s = br.readLine();
            if (s.length() >= a)
                map.put(s, map.getOrDefault(s, 0) + 1);
        }
        List<String> s1 = new ArrayList<>(map.keySet());

        s1.sort((o1, o2) -> {
            int x = map.get(o1);
            int y = map.get(o2);

            if (x == y) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return o2.length() - o1.length();
            }
            return y - x;
        });
        for (int i = 0; i < s1.size(); i++) {
            sb.append(s1.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}