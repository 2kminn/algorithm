import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String a, b;

        HashSet<String> s = new HashSet<>();
        s.add("ChongChong");
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = st.nextToken();
            b = st.nextToken();

            if (s.contains(a) || s.contains(b)) {
                s.add(a);
                s.add(b);
            }
        }
        br.close();
        bw.write(s.size() + "\n");
        bw.flush();
        bw.close();
    }
}