import java.io.*;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int [] a = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
            st = new StringTokenizer(br.readLine());
            int [] b = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
            st = new StringTokenizer(br.readLine());
            int [] c = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

            int x = 0;
            int y = 0;

            if (a[0] == b[0])
                x = c[0];
            else if (a[0] == c[0])
                x = b[0];
            else if (b[0] == c[0])
                x = a[0];

            if (a[1] == b[1])
                y = c[1];
            else if (a[1] == c[1])
                y = b[1];
            else if (b[1] == c[1])
                y = a[1];
            System.out.println(x + " " + y);
        }
    }