import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String [] s = new String[n];

        for (int i = 0; i < n; i++) {
            s[i] = br.readLine();
        }
        br.close();

        int len = s[0].length();
        for (int i = 0; i < len; i++) {
            boolean b = true;
            char c = s[0].charAt(i);
            for (int j = 1; j < s.length; j++) {
                char c1 = s[j].charAt(i);
                if (c != c1)
                    b = false;
            }
            if (b)
                sb.append(c);
            else
                sb.append("?");
        }
        System.out.println(sb);
    }
}