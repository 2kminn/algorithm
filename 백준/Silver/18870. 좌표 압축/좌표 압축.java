import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int [] a = new int[n];
        int [] temp = new int[n];
        HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            temp[i] = a[i];
        }
        Arrays.sort(temp);

        for (int v : temp) {
            if(!countMap.containsKey(v)) {
                countMap.put(v, count);
                count++;
            }
        }

        for (int k : a) {
            int result = countMap.get(k);
            sb.append(result).append(" ");
        }
        System.out.println(sb);
    }
}
