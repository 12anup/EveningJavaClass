public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 100, a = 0, b = 1;
        System.out.println("the fibonacci series upto " + n);
        while (a <= n) {
            System.out.print(a + ", ");
            int s = a + b;
            a = b;
            b = s;
        }
    }
}
