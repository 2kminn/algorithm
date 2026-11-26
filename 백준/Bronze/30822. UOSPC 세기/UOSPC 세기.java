import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int [] a = new int[5];

        for (int i = 0; i < n; i++) {
            char temp = s.charAt(i);
            if (temp == 'u' || temp == 'o' || temp == 's' || temp == 'p' || temp == 'c') {
                switch (temp) {
                    case 'u':
                        a[0]++;
                        break;
                    case 'o':
                        a[1]++;
                        break;
                    case 's':
                        a[2]++;
                        break;
                    case 'p':
                        a[3]++;
                        break;
                    case 'c':
                        a[4]++;
                        break;
                }
            }
        }

        int min = a[0];
        for (int i = 1; i < 5; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println(min);
    }
}
