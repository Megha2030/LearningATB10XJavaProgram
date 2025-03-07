package Programs.ex_31_Collection_Framework.Queue;

import java.util.PriorityQueue;

public class Lab188_Queue {
    public static void main(String[] args) {
        // First in first out
        //sorts elements naturally
        PriorityQueue p = new PriorityQueue<>();
        p.add("megha");
        p.add("ans");
        p.add("shiv");
        p.add("paru");

        System.out.println(p);
        System.out.println(p.peek());
        System.out.println(p);
        System.out.println(p.poll());
        System.out.println(p);

    }
}
