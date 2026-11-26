import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int p_num = Integer.parseInt(st.nextToken());
        int [] a = new int[num];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            a[i] = Integer.parseInt(st.nextToken() );
        }
        Arrays.sort(a);

        System.out.println(a[a.length - p_num]);
    }
}