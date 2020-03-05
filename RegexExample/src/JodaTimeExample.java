import org.joda.time.DateTime;

import java.util.Date;

public class JodaTimeExample {
    //    https://jar-download.com/artifacts/joda-time/joda-time/2.9.4/source-code
    public static void main(String[] args) {
        DateTime dateTime = new DateTime();
        System.out.println(dateTime);
        Date date = dateTime.toDate();
        System.out.println(dateTime.toString());
        System.out.println(date.toString());

        DateTime now = new DateTime();
        System.out.println("Current Day: " + now.dayOfWeek().get());
        System.out.println("Current Month: " + now.monthOfYear().getAsText());
        System.out.println("Current Year: " + now.year().getAsText());
        System.out.println("Current Year is Leap Year: " + now.year().isLeap());

        System.out.println(JodaTimeExample.class.getName());
        System.out.println(JodaTimeExample.class.isInterface());
        System.out.println(JodaTimeExample.class.isArray());
        System.out.println(JodaTimeExample.class.getSuperclass());

    }
}
