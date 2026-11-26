import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = br.readLine();
            int n = s.length();
            boolean b = true;

            if (s.equals("0")) break;

            for (int i = 0; i < n / 2; i++) {
                if (s.charAt(i) != s.charAt(n - 1 - i)) {
                    System.out.println("no");
                    b = false;
                    break;
                }
            }
            if (b) System.out.println("yes");
        }
    }
}
