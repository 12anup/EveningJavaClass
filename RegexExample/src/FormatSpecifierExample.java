import java.util.Calendar;
import java.util.Formatter;

public class FormatSpecifierExample {
    public static void main(String args[]) {
        Formatter fmt = new Formatter();

        fmt = new Formatter();
        System.out.println(fmt.format("%s is a good boy with marks %d percentage %f", "Ram", 450, 60.6));

    }
}