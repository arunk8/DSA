
import java.io.*; 
import java.util.*; 

public class HashSetEx1 {
	
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        HashSet<Short> shortSet = new HashSet<Short>();
        for (short i = 0; i < 100; i++) {
            shortSet.add(i);
            shortSet.remove(i - 1);
        }

        System.out.println(shortSet.size());
    }
}
