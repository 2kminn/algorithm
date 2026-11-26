import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] a = new int[31];

        for (int i = 1; i <= 28; i++)
            a[Integer.parseInt(br.readLine())]++;

        for (int i = 1; i < a.length; i++) {
            if (a[i] != 1)
                System.out.println(i);
        }
        br.close();
    }
}