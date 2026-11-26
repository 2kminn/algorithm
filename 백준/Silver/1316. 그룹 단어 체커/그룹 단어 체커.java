import com.sun.jdi.IntegerValue;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int c = 0;
        int a = Integer.parseInt(br.readLine());
        int count = a;
        for (int i = 0; i < a; i++) {
            String s = br.readLine();
            c = 0;
            for (int j = 0; j < s.length()-1; j++) {
                if (s.charAt(j) != s.charAt(j+1)) {
                    for (int k = j+2; k < s.length(); k++) {
                        if (s.charAt(j) == s.charAt(k) && c == 0) {
                            count--;
                            c = -1;
                        }
                    }
                }
            }
        }
        bw.write(String.valueOf(count));
        br.close();
        bw.close();
    }
}