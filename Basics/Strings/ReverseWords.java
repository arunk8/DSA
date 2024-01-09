package Strings;

public class ReverseWords {
    public String reverseWords(String s) {
        String strArr[] = s.split(" ");
        String reverse = "";
        for(int i=strArr.length-1;i>=0;i--){
            reverse = (reverse+strArr[i]).trim();
            reverse = reverse+" ";
        }
        return reverse.trim();
    }
    
    public static void main(String args[]) {
    	ReverseWords r = new ReverseWords();
    	String input = "This is a string function";
    	String reversedString  = r.reverseWords(input);
    	System.out.println("Actual String = "+input);
    	System.out.println("reversedString = "+reversedString);
    }
}