package Programs.ex_31_Collection_Framework.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Lab175_Vector {
    public static void main(String[] args) {
        // Vector is also similar to ArrayList
        // all functions are same
        // difference is Vector functions r synchronized
        //they are thread safe(done one one one)

        Vector v = new Vector<>();

        v.add(1);
        v.add(2);
        v.add(3);
        v.add("megs");
        v.add(8.7);
        v.add(true);
        v.add(null);

        System.out.println(v.size());
        System.out.println(v);

        System.out.println(v.isEmpty());

        System.out.println(v.contains(2)); //checks if list has 2
        System.out.println(v.contains("gb"));

        System.out.println(v.indexOf(2));

        // we can iterat using Iterator
        Iterator i = v.iterator();
        while(i.hasNext()) // checks if list has next element
        {
            System.out.println(i.next()); // iterator to next element //similar to i++
        }

        System.out.println("-------enumeration-----");
        Enumeration enumeration = v.elements();
        while(enumeration.hasMoreElements())
        {
            System.out.println(enumeration.nextElement());
        }
    }
}
