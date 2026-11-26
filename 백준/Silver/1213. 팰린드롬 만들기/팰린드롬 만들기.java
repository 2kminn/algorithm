import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] count = new int[26];
        String s = br.readLine();

        for (char c : s.toCharArray()) {
            count[c - 'A']++;
        }

        int oddc = 0;
        int oddindex = -1;

        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 != 0) {
                oddc++;
                oddindex = i;
            }
        }
        if (oddc > 1) {
            System.out.println("I'm Sorry Hansoo");
            return;
        }
        StringBuilder temp = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < count[i] / 2; j++) {
                temp.append((char)(i + 'A'));
            }
        }

        result.append(temp);

        if (oddindex != -1) {
            result.append((char)(oddindex + 'A'));
        }
        result.append(temp.reverse());

        System.out.println(result);
    }
}
