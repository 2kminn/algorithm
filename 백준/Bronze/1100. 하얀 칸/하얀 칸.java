import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] s = new String[8];
        int count = 0;
        int a = 1;
        for (int i = 0; i < s.length; i++) {
            s[i] = br.readLine();
        }
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < 4; j++) {
                if (a % 2 == 1) {
                    if (s[i].charAt(2 * j) == 'F') {
                        count++;
                    }
                }
                else {
                    if (s[i].charAt(2 * j + 1) == 'F')
                        count++;
                }
            }
            a++;
        }
        System.out.println(count);
    }
}