import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String [] s = new String[n];

        for (int i = 0; i < n; i++) {
            int sum = 0;
            int count = 0;
            s[i] = br.readLine();

            for (int j = 0; j < s[i].length(); j++) {
                if (s[i].charAt(j) == 'O') {
                    count++;
                }
                else {
                    count = 0;
                }
                sum += count;
            }
            sb.append(sum + "\n");
        }
        System.out.println(sb);
    }
}