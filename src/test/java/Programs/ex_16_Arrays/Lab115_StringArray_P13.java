package Programs.ex_16_Arrays;

import java.util.Scanner;

public class Lab115_StringArray_P13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        String names[] = new String[size];

        for(int i=0;i<size;i++)
        {
            System.out.println("enter names");
            names[i] = sc.next();
        }

        System.out.println("array elements");

        for(int i=0;i<size;i++)
        {
            System.out.println(names[i]);
        }

    }
}
