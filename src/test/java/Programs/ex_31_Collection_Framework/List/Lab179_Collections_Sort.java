package Programs.ex_31_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab179_Collections_Sort {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(89);

        System.out.println(marks);

        Collections.sort(marks); // sorts elements in list
        System.out.println(marks);

        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);
    }
}
