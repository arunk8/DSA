package Practice;

public class RemoveWhiteSpaces{
	
	static String removeWhiteSpaces(String input) {
		StringBuilder output = new StringBuilder();
		char[] charArray = input.toCharArray();
		
		for (char c : charArray) {
			if (!Character.isWhitespace(c))
				output.append(c);
		}
		return output.toString();
	}
	
	public static void main(String args[]) {
		String s = " qwer  ty  wert yuio";
		System.out.println("String before removing whitespaces is: "+s);
		System.out.println("String after removing whitespaces is: "+removeWhiteSpaces(s));
	}
}