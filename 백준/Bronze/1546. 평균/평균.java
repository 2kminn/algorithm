import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        double  [] arr = new double[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i ++) {
            arr[i] = Double.parseDouble(st.nextToken());
        }
        Arrays.sort(arr);
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i]/arr[arr.length-1]*100);
        }
        System.out.println(sum/N);
        br.close();
    }
}