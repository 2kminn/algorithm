import java.io.*;
import java.util.*;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(br.readLine());

            ArrayList <Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++)
                a.add(Integer.parseInt(br.readLine()));
            Collections.sort(a);
            for (int k : a)
                sb.append(k + "\n");
            System.out.println(sb);
        }
    }