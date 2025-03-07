package Programs.ex_31_Collection_Framework.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lab191_HashMap_P2 {
    public static void main(String[] args) {
        Map<String,Object> student = new HashMap();
        student.put("name","Megs");
        student.put("roll num",16);
        student.put("address","bengaluru");
        System.out.println(student);


        Set read = new HashSet<>();
        read.add("can we be strangers again");
        read.add("leave me alnoe or die");
        read.add("get lost");
        read.add("strangers to be");

        System.out.println(read);

    }
}
