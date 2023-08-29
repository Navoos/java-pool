public class Program {
	private static final String NUMBER = "479598";

	public static int getSumOfDigits(String number) {

		int result = 0;

		for (int i = 0; i < number.length(); i++) {
			result += number.charAt(i) - '0';
		}

		return result;
	}

	public static void main(String[] args) {
		int result = getSumOfDigits(NUMBER);
		
		System.out.println(result);
	}
}