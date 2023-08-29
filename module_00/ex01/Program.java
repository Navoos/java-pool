import java.util.Scanner;

public class Program {
	private static final int EXIT_STATUS = -1;

	private static final String EXIT_MESSAGE = "IllegalArgument";
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();

		if (number <= 1) {
			System.out.println(EXIT_MESSAGE);
			System.exit(EXIT_STATUS);
		}

		int step = 0;

		boolean isPrime = true;

		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
			step++;
		}

		String message = (isPrime ? "true" : "false") + " " + (step + 1);

		System.out.println(message);

		scanner.close();
	}
}