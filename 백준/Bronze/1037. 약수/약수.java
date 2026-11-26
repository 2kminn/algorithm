import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (n-- > 0){
            int a = Integer.parseInt(st.nextToken());
            max = a > max ? a : max;
            min = a < min ? a : min;
        }
        System.out.println(max * min);
    }
}