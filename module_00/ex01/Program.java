import java.util.Scanner;

public class Program {
	private static final int EXIT_STATUS = -1;

	private static final String EXIT_MESSAGE = "IllegalArgument";

	private static final String TRUE = "true";

	private static final String FALSE = "false";

	public static boolean isPrime(int number) {
		if (number <= 1) {
			System.err.println(EXIT_MESSAGE);
			System.exit(EXIT_STATUS);
		}

		boolean isPrime = true;

		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}

		return isPrime;
	}

	public static int calculateSteps(int number) {
		int steps = 1;

		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				break;
			}
			steps++;
		}

		return steps;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();

		String message = "";

		if (isPrime(number)) {
			message += TRUE;
		} else {
			message += FALSE;
		}

		message += " " + calculateSteps(number);

		System.out.println(message);

		scanner.close();
	}
}