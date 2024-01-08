package Strings;


public class StringCompression {

    public static String compressString(String input) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < input.length(); i++) {
            // Check if the current character is the same as the next one
            if (i < input.length() - 1 && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                // Append the current character and its count to the compressed string
                compressed.append(input.charAt(i)).append(count);
                count = 1; // Reset count for the next character
            }
        }

        // Check if the compressed string is shorter than the original
        return compressed.length() < input.length() ? compressed.toString() : input;
    }

    public static void main(String[] args) {
        String input = "aabcccccaaa";
        String compressed = compressString(input);
        System.out.println("Original: " + input);
        System.out.println("Compressed: " + compressed);
    }
}
