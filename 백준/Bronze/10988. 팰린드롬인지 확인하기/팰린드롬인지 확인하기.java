import java.io.*;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringBuilder sb = new StringBuilder();
            String s = br.readLine();

            for (int i = 0; i < s.length(); i++) {
                sb.append(s.charAt(s.length()-i-1));
            }
            String ns = String.valueOf(sb);
            if (ns.equals(s)) bw.write("1");
            else bw.write("0");
            br.close();
            bw.close();
        }
    }