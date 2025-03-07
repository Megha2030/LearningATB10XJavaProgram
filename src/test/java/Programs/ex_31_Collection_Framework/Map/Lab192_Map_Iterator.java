package Programs.ex_31_Collection_Framework.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab192_Map_Iterator {
    public static void main(String[] args) {
        Map<String, Object> m1 = new HashMap<>();
        m1.put("id1",1);
        m1.put("id1",10);
        m1.put("id2",13);
        m1.put("id3",76);
        m1.put(null,77);
        m1.put("id4","Megs");

        //iterator, for loop -> Not supported by Map

        //we shld use EntrySet
        for(Map.Entry<String, Object> item: m1.entrySet())
        {
            System.out.println(item.getKey());
            System.out.println(item.getValue());
            System.out.println(item.getKey() + "->"+ item.getValue());
        }
    }
}
