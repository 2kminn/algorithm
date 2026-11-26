import java.io.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(br.readLine());
            int count = 2;
            while (a != 1) {
                if (a % count == 0) {
                    a /= count;
                    System.out.println(count);
                }
                else
                    count++;
            }
        }
    }