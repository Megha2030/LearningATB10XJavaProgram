package Tasks;

import java.util.Scanner;

// 3) Find the Maximum of Two Numbers.
public class MaxOf2Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n1 = sc.nextInt();

        System.out.println("enter a number");
        int n2 = sc.nextInt();

       // String maxOf2Num = n1>n2 ? "n1 is greater" : "n2 is greater";
       // System.out.println(maxOf2Num);

        if (n1 > n2) {
            System.out.println(n1 + " is greater");
        } else {
            System.out.println(n2 + " is greater");
        }
    }

}
