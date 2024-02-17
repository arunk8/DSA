package Strings;

public class StringsFunctions {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Length method
        int length = str.length();
        System.out.println("Length of the string: " + length);
        
        // charAt method
        char firstChar = str.charAt(0);
        System.out.println("First character of the string: " + firstChar);
        
        // substring method
        String substring = str.substring(7);
        System.out.println("Substring of the string from index 7: " + substring);
        
        // indexOf method
        int index = str.indexOf("World");
        System.out.println("Index of the word 'World': " + index);
        
        // toUpperCase method
        String upperCase = str.toUpperCase();
        System.out.println("String in uppercase: " + upperCase);
        
        // toLowerCase method
        String lowerCase = str.toLowerCase();
        System.out.println("String in lowercase: " + lowerCase);
        
        // trim method
        String stringWithWhitespace = "   Trim Me!   ";
        String trimmedString = stringWithWhitespace.trim();
        System.out.println("Trimmed string: " + trimmedString);
        
        // replace method
        String replacedString = str.replace("World", "Universe");
        System.out.println("String after replacing 'World' with 'Universe': " + replacedString);
        
        // startsWith method
        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("Does the string start with 'Hello'? " + startsWithHello);
        
        // endsWith method
        boolean endsWithExclamation = str.endsWith("!");
        System.out.println("Does the string end with an exclamation mark? " + endsWithExclamation);
    }
}
