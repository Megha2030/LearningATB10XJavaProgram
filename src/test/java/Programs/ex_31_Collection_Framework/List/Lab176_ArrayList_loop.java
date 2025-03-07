package Programs.ex_31_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab176_ArrayList_loop {
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

        //to print each elements separately
        for(int i=0;i<l.size();i++)
        {
            System.out.println(l.get(i));
        }

        System.out.println("---------------------");
        // we can use for each loop as well
        // since list contains all type of data we use Object
        // if there is only 1 type of data we can explicitly specify in for each loop as String/int
        for(Object o:l)
        {
            System.out.println(o);
        }
    }
}
