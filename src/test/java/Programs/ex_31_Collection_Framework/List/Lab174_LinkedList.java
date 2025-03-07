package Programs.ex_31_Collection_Framework.List;

import java.util.LinkedList;

public class Lab174_LinkedList {

    public static void main(String[] args) {

        // Linked list is similar to Array list
        // elements are not stored in continuos manner
        // elements are stored in pointer manner head & tail
        LinkedList ll = new LinkedList<>();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add("megs");
        ll.add(8.7);
        ll.add(true);
        ll.add(null);

        System.out.println(ll.size());
        System.out.println(ll);

        System.out.println(ll.isEmpty());

        System.out.println(ll.contains(2)); //checks if list has 2
        System.out.println(ll.contains("gb"));

        System.out.println(ll.indexOf(2));

    }
}
