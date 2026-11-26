    import java.io.*;
    import java.util.StringTokenizer;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                StringBuilder sb = new StringBuilder();
                int a = Integer.parseInt(br.readLine());
                if (a == -1)
                    break;
                sb.append(a + " = 1");
                int sum = 1;
                for (int i = 2; i < a; i++) {
                    if (a % i == 0) {
                        sb.append(" + " + i);
                        sum += i;
                    }
                }
                if (sum == a)
                    System.out.println(sb);
                else
                    System.out.println(a + " is NOT perfect.");
            }
            br.close();
        }
    }