import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long sum = 0;
        String [] s = new String[3];
        String [] c = {"black", "brown", "red", "orange", "yellow",
                "green", "blue", "violet", "grey", "white"};

        for (int i = 0; i< s.length; i++) {
            s[i] = br.readLine();
        }
        br.close();
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < 10; j++) {
                if (s[i].equals(c[j])) {
                    if (i == 0)
                        sum = j * 10;
                    else if (i == 1)
                        sum += j;
                    else
                        sum *= Math.pow(10, j);
                }
            }
        }
        System.out.println(sum);
    }
}