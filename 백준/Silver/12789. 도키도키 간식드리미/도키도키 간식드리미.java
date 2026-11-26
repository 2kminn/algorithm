import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int num = 1;
        int n = Integer.parseInt(br.readLine());
        int [] a = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < n; i++) {
            int temp = a[i];
            if (temp == num) {
                num++;
            }
            else {
                stack.push(temp);
            }
            while (!stack.isEmpty() && stack.peek() == num) {
                stack.pop();
                num++;
            }
        }
        if (stack.isEmpty()) {
            System.out.println("Nice");
        }
        else {
            System.out.println("Sad");
        }

    }
}

