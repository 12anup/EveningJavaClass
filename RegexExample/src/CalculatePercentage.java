import java.util.Scanner;

public class CalculatePercentage {
    String name = "Ram";
    static int[] marks = {34, 54, 65, 55, 66};

    public void display(double percentage) {
        System.out.println(name + "  has scored " + percentage + "%");
    }

    public double calculatePercentage(int[] marks) {
        double total = 0;
        for (int a : marks) {
            total=total+a;
//            total += a;
        }
        return total / 5;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter marks of five subjects:");
        int[] scannedMarks = new int[5];
//        for (int i = 0; i < 5; i++) {
//            scannedMarks[i] = scanner.nextInt();
//        }


        CalculatePercentage c = new CalculatePercentage();
        c.display(c.calculatePercentage(marks));

//        CalculatePercentage c1 = new CalculatePercentage();
//        double percentage=c1.calculatePercentage(scannedMarks);
//        c1.display(percentage);
    }
}
