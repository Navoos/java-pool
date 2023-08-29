import java.util.Scanner;

public class Program {
	public static int getSumOfDigits(String number) {

		int result = 0;

		for (int i = 0; i < number.length(); i++) {
			result += number.charAt(i) - '0';
		}

		return result;
	}

	public static boolean isPrime(int number) {
		boolean isPrime = true;

		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}

		return isPrime && number > 1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int counter = 0;

		while (scanner.hasNextInt()) {
			String number = scanner.next();
			if (isPrime(getSumOfDigits(number))) {
				counter ++;
			}
		}

		String message = "Count of coffee-request : ";

		System.out.println(message + counter);

		scanner.close();

	}
}