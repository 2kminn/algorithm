import java.io.*;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(br.readLine());
            int num = 1;
            int count = 0;

            while (true) {
               String num1 = String.valueOf(num);
               if (num1.contains("666")) {
                   count++;
                   if (count == a) {
                       System.out.println(num);
                       break;
                   }
               }
               num++;
            }
        }
    }