package Programs.ex_31_Collection_Framework.Set;

import java.util.HashSet;
import java.util.*;

public class Lab187_HS_LHS_TS {
    public static void main(String[] args) {
        //order is not maintained
        //duplicates not allowed

        Set hs = new HashSet();

        hs.add("Apple");
        hs.add("oranges");
        hs.add("Watermelon");
        hs.add("Watermelon");
        hs.add(null); // only 1 null is allowed in Hash set
        hs.add(89);

        System.out.println(hs);
        System.out.println("----------------------");

        //Linked Hash set - order is maintained
        //no duplicates
        Set lhs = new LinkedHashSet();

        lhs.add("Apple");
        lhs.add("Dapple");
        lhs.add("oranges");
        lhs.add("Watermelon");
        lhs.add(null);
        lhs.add("Watermelon");

        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("oranges"));
        System.out.println(lhs.size());

        System.out.println("----------------------");

        //Tree set - order will be maintained
        // natural sorting will be done
        //accepts only one datatype - either int or String or Double or Float
        Set ts = new TreeSet();
        ts.add("Dapple");
        ts.add("Apple");
        ts.add("oranges");
        ts.add("Watermelon");

      //  ts.add(90); // integers along with strings cannot be added

        // ts.add(null);

        System.out.println(ts);

        for(Object o:ts)
        {
            System.out.println(o);
        }


    }
}
