import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] num = new int[9];

        for (int i = 0; i < 9; i++)
            num[i] = Integer.parseInt(br.readLine());

        int max = num[0];
        int max_num = 0;
        for (int i = 0; i < 9; i++) {
            if (num[i] > max) {
                max = num[i];
                max_num = i;
            }
        }
            System.out.println(max);
            System.out.println(max_num+1);
            br.close();
    }
}