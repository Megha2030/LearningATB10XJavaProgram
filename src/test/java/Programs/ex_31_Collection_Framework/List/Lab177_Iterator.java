package Programs.ex_31_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab177_Iterator {
    public static void main(String[] args) {
        List l = new ArrayList();

        l.add("Milk");
        l.add(123);
        l.add(null);
        l.add("Bread");
        l.add("Egg");
        l.add(6.7);
        l.add("Man");

        System.out.println(l.size());
        System.out.println(l);

        // to iterate over elements we use Iterator
        Iterator i = l.iterator();
        while(i.hasNext()) // checks if list has next element
        {
            System.out.println(i.next()); // iterator to next element //similar to i++
        }
    }
}
