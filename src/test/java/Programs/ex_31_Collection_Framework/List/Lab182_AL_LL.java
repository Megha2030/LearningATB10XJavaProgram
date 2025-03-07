package Programs.ex_31_Collection_Framework.List;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lab182_AL_LL {
    public static void main(String[] args) {

        //ArrayList and Linked List are almost same, no difference

        LinkedList ll = new LinkedList<>();

        ll.add("node1");
        ll.add("node2");
        ll.add("node3");
        ll.add("node4");
        ll.add("node5");

        System.out.println(ll);

        ArrayList al = new ArrayList();
        al.add("node1");
        al.add("node2");
        al.add("node3");
        al.add("node4");
        al.add("node5");

        System.out.println(al);


    }
}
