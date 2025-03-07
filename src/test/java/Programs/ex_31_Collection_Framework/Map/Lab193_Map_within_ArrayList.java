package Programs.ex_31_Collection_Framework.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab193_Map_within_ArrayList {
    public static void main(String[] args) {
        Map student = new HashMap();
        student.put("name","Megs");
        student.put("roll num",16);
        student.put("address","bengaluru");

        Map student2 = new HashMap();
        student2.put("name","Shiv");
        student2.put("roll num",20);
        student2.put("address","bengaluru");

        List students = new ArrayList();
        students.add(student);
        students.add(student2);

        System.out.println(students);


    }
}
