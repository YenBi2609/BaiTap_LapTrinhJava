import java.util.ArrayList;

public class ExArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("apples");

        list.add("bananas");

        list.add("grapes");

        list.add("pears");

        list.add("black plums");

        System.out.println("My array list currently includes: " + list);
// add at index
        list.add(0, "watermelons");

        System.out.println("My array list now includes: " + list);

        list.add(3, "oranges");

        System.out.println("My array list now includes: " + list);
// check element in list
        System.out.println("'grapes' is an element in the list: "

                + list.contains("grapes"));

        System.out.println("'apricots' is an element in the list: "

                + list.contains("apricots"));
// print element at index
        System.out.println("Element at index 2 is: " + list.get(2));

        System.out.println("Element at index 1 is: " + list.get(1));

        System.out.println("The array list is currently empty: " + list.isEmpty());
// size list
        System.out.println("The size of our current array list is: " + list.size());

// clear list
        list.clear();
// check list empty
        System.out.println("The array list is currently empty: " + list.isEmpty());
    }
}
