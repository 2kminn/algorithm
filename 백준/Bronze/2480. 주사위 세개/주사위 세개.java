import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a;

        if (a == b && b == c)
            System.out.println(10000 + (a*1000));
        else if (a == b || b == c)
            System.out.println(1000 + (b*100));
        else if (c == a)
            System.out.println(1000 + (a*100));
        else {
            if (max <= b && b >= c)
                max = b;
            else if (c >= b && c > max)
                max = c;
            else
                max = a;
            System.out.println(max * 100);
        }
       }
    }