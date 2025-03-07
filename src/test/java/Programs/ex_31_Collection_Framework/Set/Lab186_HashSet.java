package Programs.ex_31_Collection_Framework.Set;

import java.util.HashSet;
import java.util.Set;

public class Lab186_HashSet {
    public static void main(String[] args) {
        //Set removes duplicate elements
        //set does not maintain order

        Set s = new HashSet();

        s.add("Megha");
        s.add("megha");
        s.add("Megha");
        s.add("megs");
        s.add("Meg");

        System.out.println(s);
    }
}
