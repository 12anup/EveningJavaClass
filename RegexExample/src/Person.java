import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    String name;
    int age;
    Date dateOfBirth;

    public Person(String name, int age, Date dateOfBirth) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

  /*  @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }*/

    @Override
    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", dateOfBirth=" + dateOfBirth +
//                '}';

        return "name="+name+" age="+age+" dob="+dateOfBirth;
    }

    public static void main(String[] args) {
        Person person = new Person("Rajip", 20, new Date());
        System.out.println(person.toString());
//        SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
        String dateString = f.format(person.dateOfBirth);
        System.out.println(dateString);
        f = new SimpleDateFormat("dd-MMMM-yyyy hh:mm:ss");
        dateString = f.format(person.dateOfBirth);
        System.out.println(dateString);
    }
}
