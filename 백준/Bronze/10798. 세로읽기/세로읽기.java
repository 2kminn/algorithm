import javax.swing.plaf.IconUIResource;
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        char [][] c = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++)
                c[i][j] = s.charAt(j);
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (c[j][i] == '\0')
                    continue;
                else sb.append(c[j][i]);
            }
        }
        bw.write(String.valueOf(sb));
        br.close();
        bw.close();
    }
}