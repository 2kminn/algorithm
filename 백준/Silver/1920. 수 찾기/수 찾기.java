import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int a[] = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            if (find(a, Integer.parseInt(st.nextToken())) == -1) {
                sb.append(0).append("\n");
            }
            else {
                sb.append(1).append("\n");
            }
        }
        System.out.println(sb);
    }

    public static int find(int arr[], int b) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] > b) {
                r = m - 1;
            } else if (arr[m] < b) {
                l = m + 1;
            } else return m;
        }
        return -1;
    }
}