import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String,String> a = new HashMap<String,String>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();
            if (a.containsKey(name))
                a.remove(name);
            else a.put(name, state);
        }
        List<String> s = new ArrayList<>(a.keySet());
        Collections.sort(s, Collections.reverseOrder());
        for (String k : s)
            sb.append(k).append("\n");
        System.out.println(sb);
    }
}
