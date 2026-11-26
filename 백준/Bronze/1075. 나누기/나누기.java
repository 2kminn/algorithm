import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        br.close();
        int count = 0;
        num -= num % 100;

        for (int i = 0; i < 99; i++) {
            if (num % a == 0) {
                if (count < 10) {
                    sb.append(0).append(count);
                    break;
                }
                else {
                    sb.append(count);
                    break;
                }
            }
            else {
                count++;
                num++;
            }
        }
        System.out.println(sb);
    }
}