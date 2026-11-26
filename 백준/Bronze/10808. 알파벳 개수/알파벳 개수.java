import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int [] a = new int[26];
        String s = br.readLine();
        br.close();

        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 97]++;
        }
        for (int k : a)
            sb.append(k + " ");
        System.out.println(sb);
    }
}