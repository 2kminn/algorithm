import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int [] a = new int[10];
        int mul = 1;

        for (int i = 0; i < 3; i++) {
            mul *= Integer.parseInt(br.readLine());
        }
        while (mul > 0) {
            a[mul % 10]++;
            mul /= 10;
        }
        for (int k : a)
            sb.append(k + "\n");
        System.out.println(sb);
    }
}