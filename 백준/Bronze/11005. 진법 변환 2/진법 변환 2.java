import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int temp = 0;

        while (a > 0) {
            temp = a % b;
            if (temp >= 10) {
                char c = (char) (temp + 55);
                sb.append(c);
            }
            else
                sb.append(temp);
            a = a / b;
        }

        bw.write(String.valueOf(sb.reverse()));
        br.close();
        bw.close();
    }
}