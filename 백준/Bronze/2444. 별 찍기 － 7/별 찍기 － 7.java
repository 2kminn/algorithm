import java.io.*;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int a = Integer.parseInt(br.readLine());

            for (int i = 0; i < a; i++) {
                for (int k = 0; k < a - i - 1; k++)
                    bw.write(" ");
                for (int k = 0; k < 1 + 2 * i; k++)
                    bw.write("*");
                bw.write("\n");
            }
            for (int i = a - 1; i > 0; i--) { // i = 4
                for (int k = 0; k < a-i; k++)
                    bw.write(" ");
                for (int k = 0; k < 2 * i-1; k++)
                    bw.write("*");
                bw.write("\n");
            }
            br.close();
            bw.close();
        }
    }