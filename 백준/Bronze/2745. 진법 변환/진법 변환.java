import javax.swing.plaf.IconUIResource;
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String s = st.nextToken();
        int n = Integer.parseInt(st.nextToken());
        int sum = 0;
        int temp = 1;
        for (int i = s.length()-1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z')
                sum += (c-55) * temp;
            else
                sum += (c-48) * temp;
            temp *= n;
        }
        bw.write(String.valueOf(sum));
        br.close();
        bw.close();
    }
}