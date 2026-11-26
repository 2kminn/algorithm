import java.io.*;
import java.lang.reflect.Parameter;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int a = (int)s.charAt(0);
        System.out.println(a);
        br.close();
    }
}