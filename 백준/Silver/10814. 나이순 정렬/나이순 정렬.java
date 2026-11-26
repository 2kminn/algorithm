import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringBuilder [] s = new StringBuilder[201];

        for (int i = 0; i < s.length; i++) {
            s[i] = new StringBuilder();
        }
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            s[age].append(age).append(" ").append(st.nextToken()).append("\n");
        }
        for (StringBuilder k : s)
            sb.append(k);
        System.out.println(sb);
    }
}