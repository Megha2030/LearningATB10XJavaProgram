package Programs.ex_31_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab172_ArrayList {
    public static void main(String[] args) {
        List l = new ArrayList();

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(true);

        System.out.println(l);

        System.out.println(l.size());
        System.out.println(l.isEmpty()); // checks if list is empty

        System.out.println(l.contains(2)); //checks if list has 2
        System.out.println(l.contains("gb"));

        System.out.println(l.indexOf(2)); // returns the index of 2

        System.out.println(l.lastIndexOf(4)); // returns index of last element

        // to print each element separately( not in list format then use loop
        System.out.println("-----------------");
        for(int i=0;i<l.size();i++)
        {
            System.out.println(l.get(i));
        }
    }
}
