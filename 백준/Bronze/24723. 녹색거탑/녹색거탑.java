import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int mul = 1;

        for (int i = 0; i < a; i++) {
            mul *= 2;
        }
        System.out.println(mul);
    }
}