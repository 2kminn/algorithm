import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int time = a*60 + b + c;
        a = time / 60;
        c = time % 60;

        if (a>=24)
            a -= 24;

        System.out.println(a + " " + c);
       }
    }


