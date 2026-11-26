import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<int[]> q = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());
        int [] a = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        sb.append("1 ");
        int temp = a[0];

        for(int i = 1; i < n; i++) {
            q.add(new int[] {(i+1), a[i]});
        }

        while(!q.isEmpty()) {
            // 양수인 경우
            if(temp >0) {
                // 순서 뒤로 돌리기
                for(int i = 1; i < temp; i++) {
                    q.add(q.poll());
                }

                int[] next = q.poll();
                temp = next[1];
                sb.append(next[0]+" ");
            }
            // 음수인 경우
            else {
                for(int i=1; i<-temp; i++	) {
                    q.addFirst(q.pollLast());
                }

                int[] next = q.pollLast();
                temp = next[1];
                sb.append(next[0]+" ");
            }
        }

        System.out.println(sb.toString());
    }
}
