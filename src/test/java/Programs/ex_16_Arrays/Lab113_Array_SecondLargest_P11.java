package Programs.ex_16_Arrays;

import java.util.Arrays;

public class Lab113_Array_SecondLargest_P11 {
    public static void main(String[] args) {
        int marks[] = {10,18,90,13,14,55};
        int lenOfArray = marks.length; //len = 6

        Arrays.sort(marks); //elements r sorted
        // {10,13,14,18,55,90}

        int secondLargest = marks[lenOfArray-2]; // marks[6-2] = marks[4] -> 55
        System.out.println(secondLargest);
    }
}
