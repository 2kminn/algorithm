import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        sb.append(Math.round(Math.pow(Integer.parseInt(br.readLine()), 2))).append("\n" + 2);
        br.close();
        System.out.println(sb);
    }
}