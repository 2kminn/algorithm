import com.sun.jdi.IntegerValue;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int [] arr = new int[26];
        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            if (65 <= s.charAt(i) && 90 >= s.charAt(i))
                arr[s.charAt(i) - 'A']++;
            else
                arr[s.charAt(i) - 'a']++;
            }

        int max = -1;
        char a = '?';

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                a = (char)(i + 65);
            }
            else if (arr[i] == max)
                a = '?';
        }
        bw.write(a);
        br.close();
        bw.close();
    }
}