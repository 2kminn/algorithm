import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[26];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            a[s.charAt(0) - 97]++;
        }
        for (int i = 0; i < 26; i++) {
            if (a[i] >= 5)
                sb.append((char) (i + 'a'));
        }

        if (sb.isEmpty()) {
            System.out.println("PREDAJA");
        } else {
            Arrays.sort(new StringBuilder[]{sb});
            System.out.println(sb);
        }
    }
}