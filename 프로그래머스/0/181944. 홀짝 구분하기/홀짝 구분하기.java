import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        
        if (isodd(a))
            System.out.printf("%d is odd", a);
        else
            System.out.printf("%d is even", a);
    }
    
    private static boolean isodd(int n) {
        return n % 2 != 0;
    }
}
