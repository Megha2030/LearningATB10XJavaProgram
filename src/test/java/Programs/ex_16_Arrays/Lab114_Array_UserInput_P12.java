package Programs.ex_16_Arrays;

import java.util.Scanner;

public class Lab114_Array_UserInput_P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();

        int a[] = new int[size];

        for(int i=0;i<size;i++) // user enter elements for array
        {
            System.out.println("enter array elements");
            a[i] = sc.nextInt();
        }
        System.out.println("array elements");
        for(int i=0;i<size;i++)
        {
            System.out.println(a[i]);
        }

    }
}
