package ex_08_IfElse_Condition;

import java.util.Scanner;

public class Lab61_IfElseIf {
    public static void main(String[] args) {
        int n1,n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a n1");
        n1 = sc.nextInt();
        System.out.println("enter a n2");
        n2 = sc.nextInt();

        if(n1>n2)
        {
            System.out.println(n1+"is greater");
        }
        else if(n1<n2)
        {
            System.out.println(n1+"is lesser");
        }
        else
        {
            System.out.println("n1 and n2 r equal");
        }
    }
}
