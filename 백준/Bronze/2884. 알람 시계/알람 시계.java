import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int time = a*60 + b - 45;
        a = time / 60;
        b = time % 60;
        if (b < 0) {
            a = 23;
            b = 60 + b;
        }

        System.out.println(a + " " + b);
       }
    }


