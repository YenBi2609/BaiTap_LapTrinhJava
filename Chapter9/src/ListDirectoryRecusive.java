import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListDirectoryRecusive extends Thread{
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
//2. Adds elements into s and prints it.

        s.add("grapes");
        s.add("bananas");
        s.add("apples");
        s.add("pears");
        s.add("black plums");

        System.out.println("My set currently includes: " + s);

        s.add("watermelons");

        System.out.println("My set now includes: " + s);

        s.add("bananas");

        System.out.println("My set now includes: " + s);

// Determines whether or not 'grapes' is in the s.

        System.out.println("'grapes' is an element in the set: "+s.contains("grapes"));

// Determines whether or not 'apricots' is in the s.

        System.out.println("'apricots' is an element in the set: " + s.contains("apricots"));

// Checks to see if s is empty or not.

        System.out.println("The set is currently empty: " + s.isEmpty());

// Returns the current size of the array.

        System.out.println("The size of set is: " + s.size());

//3. Copy HashSet s to a TreeSet

        Set<String> sortedSet = new TreeSet<String>(s);

        System.out.println("My sorted set now includes: " + sortedSet);

//4. Clears the entire array. (Removes all elements within it)

        s.clear();

//5. Checks to see if s is empty or not.

        System.out.println("The set is currently empty: " + s.isEmpty());
    }
}
