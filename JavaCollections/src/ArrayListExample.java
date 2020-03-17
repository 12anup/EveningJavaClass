import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student("Ram", 1);
        Student s2 = new Student("hari", 23);
        Student s3 = new Student("sita", 12);
        Student s4 = new Student("abc", 14);
        Student s5 = new Student("gita", 51);
        Student s6 = new Student("xyz", 12);
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);
        studentList.add(new Student("jkl", 102));

        System.out.println(studentList.isEmpty());
        if (!studentList.isEmpty()) {
            for (Student s : studentList) {
                System.out.println(s.toString());
            }


        }
        else System.out.println("list is empty");
    }
}
