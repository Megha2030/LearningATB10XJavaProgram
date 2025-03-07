package Programs.ex_31_Collection_Framework.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab189_Map {
    public static void main(String[] args) {

        //map - key value pair
        // key:name value:Megs
        //order will not be maintained in hash map
        Map m1 = new HashMap<>();
        m1.put("name","Megs");
        m1.put("rollNo",87);
        m1.put("phone",87777777);

        System.out.println(m1);

        System.out.println("---------------------------------");
        //map - key value pair
        // key:name value:Megs
        //sorting will be done in Linked hash map based on keys
        Map m2 = new LinkedHashMap();
        m2.put("name","Megs");
        m2.put("rollNo",87);
        m2.put("phone",87777777);

        System.out.println(m2);

        System.out.println("---------------------------------");
        //map - key value pair
        // key:name value:Megs
        //sorting will be done in tree map based on keys
        Map m3 = new TreeMap();
        m3.put("name","Megs");
        m3.put("rollNo",87);
        m3.put("phone",87777777);

        System.out.println(m3);

    }
}
