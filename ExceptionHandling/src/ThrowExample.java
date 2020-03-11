import java.util.Scanner;

public class ThrowExample {
    public static void validateAge(int age) {
        if (age < 18) {
            try {
                throw new AgeInvalidateException("Age is not valid to vote");
            } catch (AgeInvalidateException e) {
                e.printStackTrace();
            }
        } else System.out.println("you can vote");
    }

    public void divide(int a, int b) {
        try {
            int i = method1(a, b);
            System.out.println(i);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public int method1(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your age:");
        int age = scanner.nextInt();
        validateAge(age);
   /*     ThrowExample example = new ThrowExample();
        int a = 77, b = 0;
        example.divide(a, b);*/
        System.out.println("this is after exception");


    }
}
