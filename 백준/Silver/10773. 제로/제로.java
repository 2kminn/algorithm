import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a != 0)
                stack.push(a);
            else
                stack.pop();
        }

        if (stack.isEmpty()) {
            System.out.println(0);
        }
        else {
            while (!stack.isEmpty())
                sum += stack.pop();
            System.out.println(sum);
        }
    }
}