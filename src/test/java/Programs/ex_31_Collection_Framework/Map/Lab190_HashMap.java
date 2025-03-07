package Programs.ex_31_Collection_Framework.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab190_HashMap {
    public static void main(String[] args) {
        Map m1 = new HashMap<>();
        m1.put(null,"Megs"); // o/p : null:Megs
        // basically u are adding 2 values to same key -> 1st value will be replaced by 2nd
        m1.put(null,"Megha"); // Null value will be replaced from Megs to Megha

        m1.put("id1",1);
        m1.put("id1",10);
        m1.put("id2",13);
        m1.put("id3",76);

        System.out.println(m1);
        System.out.println(m1.size());
        System.out.println(m1.isEmpty());
        System.out.println(m1.containsKey("id2"));
        System.out.println(m1.containsValue(10));

        System.out.println(m1.keySet()); // returns all keys
        System.out.println(m1.values());
    }
}
