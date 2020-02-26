import java.util.Scanner;

public class ConsoleInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		long b = scanner.nextLong();
		String next = scanner.next();
		System.out.print(a);
		System.out.println(next);
	}

}
