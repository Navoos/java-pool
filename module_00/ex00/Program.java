public class Program {
	private static final String NUMBER = "479598";
	public static void main(String[] args) {
		int result = 0;

		for (int i = 0; i < NUMBER.length(); i++) {
			result += NUMBER.charAt(i) - '0';
		}
		
		System.out.println(result);
	}
}