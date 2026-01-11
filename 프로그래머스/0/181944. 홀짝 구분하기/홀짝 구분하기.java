import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        
        isodd(a);
    }
    
    private static void isodd(int n) {
        if (n % 2 == 1)
            System.out.printf("%d is odd", n);
        else
            System.out.printf("%d is even", n);
    }
}
