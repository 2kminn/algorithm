import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int counter = 0;
       while (a>0) {
          if (a % 5 == 0) {
               counter += a / 5;
               break;
          }
          else {
              a -= 3;
              counter++;
          }

          if (a < 0) {
              counter = -1;
              break;
          }
       }
       System.out.println(counter);
    }
}

