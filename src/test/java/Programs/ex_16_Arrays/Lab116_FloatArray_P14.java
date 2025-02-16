package Programs.ex_16_Arrays;

import java.util.Scanner;

public class Lab116_FloatArray_P14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        float num[] = new float[size];

        for(int i=0;i<size;i++)
        {
            System.out.println("enter floating numbers");
            num[i] = sc.nextFloat();
        }

        System.out.println("array elements");

        for(int i=0;i<size;i++)
        {
            System.out.println(num[i]);
        }

    }
}
