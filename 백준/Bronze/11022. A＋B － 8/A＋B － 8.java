import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int []num = new int[2 * a];
        for (int i = 0; i < num.length; i++)
          num[i] = sc.nextInt();
        for (int i = 0; i < a; i++)
            System.out.printf("Case #%d: %d + %d = %d\n", i+1, num[2*i], num[2*i+1], num[2*i] + num[2*i+1]);
       }
    }