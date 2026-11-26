    import java.io.*;
    import java.util.StringTokenizer;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                boolean b = true;
                int a = Integer.parseInt(st.nextToken());
                if (a == 1) continue;
                for (int j = 2; j <= Math.sqrt(a); j++) {
                    if (a % j == 0) {
                        b = false;
                        break;
                    }
                }
                if (b)
                    count++;
            }
            System.out.println(count);
        }
    }