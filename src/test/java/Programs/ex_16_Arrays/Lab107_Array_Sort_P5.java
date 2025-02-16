package Programs.ex_16_Arrays;

import java.util.Arrays;

public class Lab107_Array_Sort_P5 {
    public static void main(String[] args) {
        int marks[] = {10,18,90,13,14,55};
        Arrays.sort(marks);// inbuild predefined function to sort
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }

    }
}
