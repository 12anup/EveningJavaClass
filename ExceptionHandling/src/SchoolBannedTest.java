import com.sun.deploy.util.StringUtils;

import java.util.Scanner;

public class SchoolBannedTest {
    public static void testSchool(String schoolName) throws SchoolBannedException {
        if (schoolName.equalsIgnoreCase("abc")) {
            throw new SchoolBannedException("this school is banned for now ,we will contact you later");
        } else System.out.println("congratulations");
    }

    public static void main(String[] args) {
        System.out.println("please enter school name :");
        Scanner sc = new Scanner(System.in);
        String schoolName = sc.nextLine();
        try {
            testSchool(schoolName);
        } catch (SchoolBannedException e) {
            e.printStackTrace();
        }
        System.out.println("this is after exception");
    }
}
