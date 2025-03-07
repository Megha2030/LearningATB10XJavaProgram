package Programs.ex_31_Collection_Framework.Map;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab194_HashTable {
    public static void main(String[] args) {
        // Hash table - is legacy class
        // we should use Enumeration to iterate

        Hashtable hash = new Hashtable();
        hash.put("name","Megs");
        hash.put("age",20);
        hash.put("address","bengaluru");
        hash.put("education","BE");
       // hash.put(null,"pep"); // null key not allowed in hash table
        // hash.put("earth",null); // null value not allowed in hash table

        System.out.println(hash);

        Enumeration enumeration = hash.elements();
        while(enumeration.hasMoreElements())
        {
            System.out.println(enumeration.nextElement());
        }
    }
}
