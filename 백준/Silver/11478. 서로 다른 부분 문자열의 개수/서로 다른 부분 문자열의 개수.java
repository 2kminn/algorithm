import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> a = new HashSet<>();
        int count = 0;
        String s = br.readLine();
        br.close();
        
        while (true) {
            for (int i = 0; i < s.length() - count; i++) {
                a.add(s.substring(i, i + count + 1));
            }
            count++;
            if (count == s.length())
                break;
        }
        System.out.println(a.size());
    }
}
