import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] n = new int[10];
        int counter = 0;
        for (int i = 0; i < n.length; i++) {
            n[i] = (Integer.parseInt(br.readLine()))%42;
        }
        int a;
        for (int i = 0; i < n.length; i++) {
            a = 0;
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] == n[j]) {
                    a = 1;
                    break;
                }
            }
            if (a != 1) counter++;
        }
        if (counter == 0)
            System.out.println(1);
        else
            System.out.println(counter);

        br.close();
    }
}