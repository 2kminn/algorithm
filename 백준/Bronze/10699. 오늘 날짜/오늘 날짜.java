import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        DateTimeFormatter a = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String s = now.format(a);
        System.out.println(s);
    }
}
