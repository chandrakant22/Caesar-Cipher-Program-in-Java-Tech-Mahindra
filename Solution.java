
public class Test {
	public static final String cap_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String small_ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	public static String encryptData(String inputStr, int shiftKey) {
		String encryptStr = "";

		for (int i = 0; i < inputStr.length(); i++) {

			if ((int) inputStr.charAt(i) > 96) {
				int pos = small_ALPHABET.indexOf(inputStr.charAt(i));

				int encryptPos = (shiftKey + pos) % 26;
				char encryptChar = small_ALPHABET.charAt(encryptPos);
				encryptStr += encryptChar;
			} else {
				int pos = cap_ALPHABET.indexOf(inputStr.charAt(i));

				int encryptPos = (shiftKey + pos) % 26;
				char encryptChar = cap_ALPHABET.charAt(encryptPos);
				encryptStr += encryptChar;
			}
		}

		return encryptStr;
	}

	public static void main(String[] args) {
		
		
		System.out.println(encryptData("Hello", 4));

	}

}
