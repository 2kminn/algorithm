    import java.io.*;
    import java.util.StringTokenizer;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            int min = 10000;
            int M = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());

            for (int i = M; i <= N; i++){
                boolean b = true;
                if (i == 1) continue;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        b = false;break;
                    }
                }
                if (b) {
                    if (min > i)
                        min = i;
                    sum += i;
                }
            }
            if (sum == 0)
                System.out.print(-1);
            else
                System.out.printf(sum + "\n" + min);
        }
    }