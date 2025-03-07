package Programs.ex_31_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab173_ListFixedSize {
    public static void main(String[] args) {

        // initial capacity can also be mention which is similar to Array
        List l = new ArrayList(5);

        l.add("abc");
        l.add(123);
        l.add(null);
        l.add("megs");
        l.add("megs");
        // capacity is 5 -> if u try adding 6th element it will not throw any error
        //Array list grows dynamically as u add elements
        l.add(9.8);

        System.out.println(l);
    }
}
