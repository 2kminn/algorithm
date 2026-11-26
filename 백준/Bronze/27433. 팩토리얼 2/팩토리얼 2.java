import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long a = Integer.parseInt(br.readLine());
        long b = 1;
        while(a > 0) {
            b *= a;
            a--;
        }
        System.out.println(b);
    }
}
