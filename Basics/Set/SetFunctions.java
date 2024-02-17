package Set;

import java.util.HashSet;
import java.util.Set;

public class SetFunctions {
    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> colors = new HashSet<>();
        
        // Adding elements to the Set
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red"); // Duplicate element, will not be added
        
        // Displaying the Set
        System.out.println("Set of colors: " + colors);
        
        // Getting the size of the Set
        int size = colors.size();
        System.out.println("Size of the Set: " + size);
        
        // Checking if an element exists in the Set
        boolean containsGreen = colors.contains("Green");
        System.out.println("Does the Set contain Green? " + containsGreen);
        
        // Removing an element from the Set
        colors.remove("Blue");
        System.out.println("Set after removing Blue: " + colors);
        
        // Checking if the Set is empty
        boolean isEmpty = colors.isEmpty();
        System.out.println("Is the Set empty? " + isEmpty);
        
        // Clearing the Set
        colors.clear();
        System.out.println("Set after clearing: " + colors);
    }
}
