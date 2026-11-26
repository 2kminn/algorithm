import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        int lastElement = -1; // 마지막 요소를 추적

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String[] parts = s.split(" ");
            String command = parts[0];

            if (command.equals("push")) {
                int value = Integer.parseInt(parts[1]);
                lastElement = value;
                queue.add(value);
            } 
            else if (command.equals("pop")) {
                int temp = queue.isEmpty() ? -1 : queue.remove();
                sb.append(temp).append("\n");
            } 
            else if (command.equals("size")) {
                sb.append(queue.size()).append("\n");
            } 
            else if (command.equals("empty")) {
                sb.append(queue.isEmpty() ? 1 : 0).append("\n");
            } 
            else if (command.equals("front")) {
                sb.append(queue.isEmpty() ? -1 : queue.peek()).append("\n");
            } 
            else if (command.equals("back")) {
                sb.append(queue.isEmpty() ? -1 : lastElement).append("\n");
            }
        }
        System.out.print(sb);
    }
}
