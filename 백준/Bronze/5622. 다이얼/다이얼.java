import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] a = {"ABC", "DEF", "GHI", "JKL", "MNO",  "PQRS", "TUV", "WXYZ"};
        String s = br.readLine();
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a[j].length(); k++)
                    if (s.charAt(i) == a[j].charAt(k))
                        sum += 3+j;
            }
        }
        System.out.println(sum);
    }
}