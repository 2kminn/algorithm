import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static void cantor(char[] arr, int start, int length) {
        if (length == 1) return;

        int third = length / 3;
        for (int i = start + third; i < start + 2 * third; i++) {
            arr[i] = ' ';
        }
        
        cantor(arr, start, third);
        cantor(arr, start + 2 * third, third);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        StringBuilder sb = new StringBuilder();
        while ((input = br.readLine()) != null) {
            input = input.trim();
            if (input.isEmpty()) continue;

            int n = Integer.parseInt(input);
            int len = (int) Math.pow(3, n);

            char[] arr = new char[len];
            for (int i = 0; i < len; i++) {
                arr[i] = '-';
            }

            cantor(arr, 0, len);
            sb.append(arr).append("\n");
        }

        System.out.print(sb);
    }
}