package Programs.ex_31_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab183_AL_Iterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Megs");
        list.add("Manoj");
        list.add("Shiv");

        System.out.println("---using for each---");

        for(String str:list)
        {
            System.out.println(str);
        }

        System.out.println("---using iterator----");

       Iterator<String> iterator = list.iterator();
       while(iterator.hasNext())
       {
           System.out.println(iterator.next());
       }

        System.out.println("---using for loop---");
       for(int i=0;i< list.size();i++)
       {
           System.out.println(list.get(i));
       }
    }
}
