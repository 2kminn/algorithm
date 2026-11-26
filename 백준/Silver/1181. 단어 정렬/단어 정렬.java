import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String [] s = new String[n];

        for (int i = 0; i < n; i++)
            s[i] = br.readLine();
        br.close();
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length())
                    return o1.compareTo(o2);
                else
                    return o1.length() - o2.length();
            }
        });
        sb.append(s[0]).append("\n");
        for (int i = 1; i < n; i++) {
            if (!s[i].equals(s[i-1]))
                sb.append(s[i]).append("\n");
        }
        System.out.println(sb);
    }
}