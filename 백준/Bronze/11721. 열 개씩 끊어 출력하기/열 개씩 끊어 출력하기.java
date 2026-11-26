import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        while (true) {
            if (s.length() > 10) {
                sb.append(s.substring(0,10)).append("\n");
                s = s.substring(10);
            }
            else {
                sb.append(s);
                break;
            }
        }
        br.close();
        System.out.println(sb);
    }
}