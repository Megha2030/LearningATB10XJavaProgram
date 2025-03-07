package Programs.ex_31_Collection_Framework.List;

import java.util.Stack;

public class Lab184_Stack {
    public static void main(String[] args) {

        //stack is Legacy class
        // LIFO - last in first out
        Stack s = new Stack<>();
        s.add("Megs");
        s.add("Shiv");

        System.out.println(s);

        Stack s2 = new Stack<>();
        s2.push("Megs");
        s2.push("Shiv");
        s2.push("parvathi");
        s2.push("Shiv");
        System.out.println(s2);
        System.out.println(s2.size());

        //peek -> returns top most element
        System.out.println(s2.peek());

        //removes top most element
        System.out.println(s2.pop());

        System.out.println(s2);

        System.out.println(s2.get(0));
    }
}
