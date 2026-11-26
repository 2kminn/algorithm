import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int mul = 1;
        for (int i = n ; i > 0; i--) {
            mul *= i;
        }
        System.out.println(mul);
    }
}