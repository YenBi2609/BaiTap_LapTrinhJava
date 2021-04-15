import java.util.Iterator;
import java.util.LinkedList;

public class ExLinkedList extends Thread {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        int num1 = 11, num2 = 22, num3 = 33, num4 = 44;
        int size;
        Iterator iterator;

        list.add(num1);
        list.add(num2);
        list.add(num3);
        list.add(num4);

        size = list.size();

        System.out.print("Linked list data: ");

        iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
//Check list empty or not

        if (list.isEmpty()){
            System.out.println("Linked list is empty");
        }
        else{
            System.out.println( "Linked list size: " + size);
        }

        System.out.println("Adding data at 1st location: 55");
//Add and print data in list

        list.addFirst(55);

        System.out.print("Now the list contain: ");

        iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        System.out.println();
        System.out.println("Now the size of list: " + list.size());
        System.out.println("Adding data at last location: 66");

        list.addLast(66);

        System.out.print("Now the list contain: ");

        iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        System.out.println();

        System.out.println("Now the size of list: " + list.size());

        System.out.println("Adding data at 3rd location: 99");

        list.add(2,99);

        System.out.print("Now the list contain: ");

        iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        System.out.println();

        System.out.println("Now the size of list: " + list.size());

//6. Retrieve data

        System.out.println("First data: " + list.getFirst());

        System.out.println("Last data: " + list.getLast());

//Retrieve specific data

        System.out.println("Data at 4th position: " + list.get(3));

//7. Remove data

        int first = list.removeFirst();

        System.out.println("Data removed from 1st location: " + first);

        System.out.print("Now the list contain: ");

        iterator = list.iterator();

//After removing data

        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

        System.out.println("Now the size of list: " + list.size());

//Remove last

        int last = list.removeLast();

        System.out.println("Data removed from last location: " + last);

        System.out.print("Now the list contain: ");

        iterator = list.iterator();

//After removing data

        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        System.out.println();

        System.out.println("Now the size of list: " + list.size());

//Remove 2nd data

        int second = list.remove(1);

        System.out.println("Data removed from 2nd location: " + second);

        System.out.print("Now the list contain: ");

        iterator = list.iterator();

//After removing data

        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        System.out.println();

        System.out.println("Now the size of list: " + list.size());

//Remove all
        list.clear();
        if (list.isEmpty()){
            System.out.println("Linked list is empty");
        }
        else{
            System.out.println( "Linked list size: " + size);
        }
    }
}
