package Maps;

import java.util.*;

public class MapFunctions {
    public static void main(String[] args) {
        // Creating a Map (HashMap in this case)
        Map<String, Integer> studentScores = new HashMap<>();

        // Adding key-value pairs to the map
        studentScores.put("Alice", 85);
        studentScores.put("Bob", 90);
        studentScores.put("Charlie", 78);
        studentScores.put("David", 92);
        studentScores.put("Emily", 80);

        // Printing the original map
        System.out.println("Original Map:");
        System.out.println(studentScores);

        // Accessing values using keys
        System.out.println("\nAccessing values using keys:");
        System.out.println("Score of Bob: " + studentScores.get("Bob"));

        // Checking if a key exists in the map
        System.out.println("\nChecking if a key exists:");
        String nameToCheck = "Charlie";
        if (studentScores.containsKey(nameToCheck)) {
            System.out.println(nameToCheck + " is present in the map.");
        } else {
            System.out.println(nameToCheck + " is not present in the map.");
        }

        // Removing a key-value pair from the map
        System.out.println("\nRemoving a key-value pair:");
        studentScores.remove("David");
        System.out.println("Map after removing David's score: " + studentScores);

        // Iterating over the map using entrySet()
        System.out.println("\nIterating over the map using entrySet():");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Getting the size of the map
        System.out.println("\nSize of the map: " + studentScores.size());

        // Clearing the map
        studentScores.clear();
        System.out.println("Map after clearing: " + studentScores);
    }
}
