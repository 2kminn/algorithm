import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

//          킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
            int [] a = {1, 1, 2, 2, 2, 8};
            int [] b = new int[a.length];

            for (int i = 0; i < b.length; i++) {
                b[i] = Integer.parseInt(st.nextToken());
            }
            for (int j = 0; j < b.length; j++) {
                b[j] = a[j] - b[j];
                System.out.print(b[j] + " ");
            }
        }
    }