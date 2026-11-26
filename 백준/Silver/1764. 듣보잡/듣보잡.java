import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String [] s = new String[n];
        HashSet<String> a = new HashSet<>();
        for (int i = 0; i < n; i++) {
            a.add(br.readLine());
        }
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String temp = br.readLine();
            if (a.contains(temp))
                result.add(temp);
        }
        Collections.sort(result);
        System.out.println(result.size());
        for (String k : result)
            System.out.println(k);
    }
}
