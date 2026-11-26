import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int kind = sc.nextInt();
        int [] object_Price = new int[2 * kind];
        int object_total = 0;

        for (int i = 0; i < object_Price.length; i++)
            object_Price[i] = sc.nextInt();

        for (int i = 0; i < kind; i++)
            object_total = object_total + (object_Price[2*i] * object_Price[2*i+1]);

        if (object_total == total)
            System.out.println("Yes");
        else System.out.println("No");
       }
    }