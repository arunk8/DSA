package Arrays;
import java.util.ArrayList;

public class ArrayListFunctions {
    public static void main(String[] args) {
        // Creating an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<>();
        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        
        // Displaying the ArrayList
        System.out.println("ArrayList of fruits: " + fruits);
        
        // Getting the size of the ArrayList
        int size = fruits.size();
        System.out.println("Size of the ArrayList: " + size);
        
        // Accessing elements by index
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);
        
        // Modifying elements by index
        fruits.set(1, "Grapes");
        System.out.println("Modified ArrayList: " + fruits);
        
        // Removing elements by index
        fruits.remove(2);
        System.out.println("ArrayList after removing Mango: " + fruits);
        
        // Checking if an element exists in the ArrayList
        boolean containsMango = fruits.contains("Mango");
        System.out.println("Does the ArrayList contain Mango? " + containsMango);
        
        // Checking if the ArrayList is empty
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is the ArrayList empty? " + isEmpty);
        
        // Clearing the ArrayList
        fruits.clear();
        System.out.println("ArrayList after clearing: " + fruits);
    }
}
