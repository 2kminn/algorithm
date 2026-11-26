import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> a = new Stack<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if (s.equals("push")) {
                int k = Integer.parseInt(st.nextToken());
                a.push(k);
            }
            else if (s.equals("pop")) {
                if (a.empty())
                    sb.append(-1 + "\n");
                else
                    sb.append(a.pop() + "\n");
            }

            else if (s.equals("size"))
                sb.append(a.size() + "\n");

            else if (s.equals("empty")) {
                if (a.empty())
                    sb.append(1 + "\n");
                else
                    sb.append(0 + "\n");
            }

            else if (s.equals("top")) {
                if (a.empty())
                    sb.append(-1 + "\n");
                else
                    sb.append(a.peek() + "\n");
            }
        }
        br.close();
        System.out.println(sb);
    }
}