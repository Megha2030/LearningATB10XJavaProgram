package Tasks;

import java.util.Scanner;
// WAP to Find the Largest of Three Numbers.
public class LargestOf3Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a n1");
        int n1 = sc.nextInt();
        System.out.println("enter a n2");
        int n2 = sc.nextInt();
        System.out.println("enter a n3");
        int n3 = sc.nextInt();

        if(n1>n2 && n1>n3)
        {
            System.out.println(n1+ "is greater");
        }
        else if(n2>n3 && n2>n1)
        {
            System.out.println(n2+ "is greater");
        }
        else {
            System.out.println(n3+ "is greater");
        }
    }
}
