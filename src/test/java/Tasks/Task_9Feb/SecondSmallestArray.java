package Tasks.Task_9Feb;

import java.util.Scanner;

public class SecondSmallestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();

        int a[] = new int[size];
        int temp;

        for(int i=0;i<size;i++)
        {
            System.out.println("enter array elements");
            a[i] = sc.nextInt();
        }

        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(a[i]<a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

            System.out.println(a[i]+" ");
        }
        System.out.println("second smallest array element is:"+a[size-2]);
    }
}
