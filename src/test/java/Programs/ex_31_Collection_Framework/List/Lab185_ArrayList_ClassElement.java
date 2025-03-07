package Programs.ex_31_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab185_ArrayList_ClassElement {
    public static void main(String[] args) {
        Student s1 = new Student("Amit",1);
        Student s2 = new Student("Bob",2);
        Student s3 = new Student("Cherry",3);

        List<Student> myStud = new ArrayList<>();

        myStud.add(s1);
        myStud.add(s2);
        myStud.add(s3);

        System.out.println(myStud);

        s1.printDetails();
        s2.printDetails();
        s3.printDetails();

    }
}
