package Programs.ex_31_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab171_List {
    public static void main(String[] args) {

       // List l = new List(); // we cannot create objects for list bcz List is an interface

        List l = List.of("apple","banana","grapes","strawberry");
        //of() - method is fully implemented in interface
        //default method - can be fully implemented in interface

       // l.add("oranges"); // this throws java.lang.UnsupportedOperationException
        //l.remove("banana"); // this throws java.lang.UnsupportedOperationException

        System.out.println(l);

        // to avoid above exceptions we use Array List

        ArrayList al = new ArrayList<>();
        al.add("abc");
        al.add(8.9); // can accept any data type
        al.add("megs");// can accept duplicates
        al.add("megs");
        al.add(null); // null can also be added
        System.out.println(al);
        System.out.println(al.size()); // 4

        List list = new ArrayList<>();// Dynamic dispatch
        list.add("tree");
        list.add("plant");
        list.add(345);

        System.out.println(list);


    }
}
