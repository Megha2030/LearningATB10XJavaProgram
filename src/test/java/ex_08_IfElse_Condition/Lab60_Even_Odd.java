package ex_08_IfElse_Condition;

import java.util.Scanner;

//Write a program to check whether a num is even or odd
//take input from user
public class Lab60_Even_Odd {
    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a  num");
        num = sc.nextInt();

        if(num%2 == 0)
        {
            System.out.println(num + "is an even number");
        }
        else
        {
            System.out.println(num + "is an odd number");
        }

        //egde cases -> check large int, -ve num handling, 0 ,other input(float or double numbers)
    }
}
