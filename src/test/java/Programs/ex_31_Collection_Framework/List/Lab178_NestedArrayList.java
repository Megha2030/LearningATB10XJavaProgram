package Programs.ex_31_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab178_NestedArrayList {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>(); //<String> is given list can accept only STring elements
        fruits.add("apple");
        fruits.add("Banana");
        fruits.add("Chicoo");
        System.out.println(fruits);

        List<String> fruits2 = new ArrayList<>();
        fruits2.add("Dragon");
        fruits2.add("Elachi");
        fruits2.add("Fig");
        System.out.println(fruits2);

        List<String> fruits3 = new ArrayList<>();
        fruits3.add("Grapes");
        fruits3.add("Mango");
        fruits3.add("Oranges");
        System.out.println(fruits3);

        // combining all elements into 1 single element

        List allFruits = new ArrayList<>();
        allFruits.add(fruits);
        allFruits.add(fruits2);
        allFruits.add(fruits3);
        System.out.println(allFruits);

        System.out.println(allFruits.get(0));
        System.out.println(allFruits.get(1));
        System.out.println(allFruits.get(2));





    }
}
