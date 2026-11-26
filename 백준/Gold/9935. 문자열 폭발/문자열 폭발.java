import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        String ex = br.readLine();
        int slen = s.length();
        int exlen = ex.length();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < slen; i++) {
            int count = 0;
            stack.push(s.charAt(i));

            if (stack.size() >= exlen) {
                for (int j = 0; j < exlen; j++) {
                    if (stack.get(stack.size() - exlen + j) == ex.charAt(j)) {
                        count++;
                    }
                    if (count == exlen) {
                        for (int k = 0; k < exlen; k++) {
                            stack.pop();
                        }
                    }
                }
            }
        }
        if (stack.isEmpty()) {
            sb.append("FRULA");
        }
        else {
            for (char k : stack) {
                sb.append(k);
            }
        }
        System.out.println(sb);
    }
}
