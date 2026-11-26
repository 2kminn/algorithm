import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        char [] a = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z')) {
                if (s.charAt(i) + 13 > 'Z') {
                    a[i] = (char) (s.charAt(i) - 'Z' + 'A' + 12);
                }
                else a[i] =(char) (s.charAt(i) + 13);
            }
            else if ((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z')) {
                if (s.charAt(i) + 13 > 'z') {
                    a[i] = (char) (s.charAt(i) - 'z' + 'a' + 12);
                }
                else a[i] =(char) (s.charAt(i) + 13);
            }
            else a[i] = s.charAt(i);
        }
        for (char k : a)
            sb.append(k);
        System.out.println(sb);
    }
}