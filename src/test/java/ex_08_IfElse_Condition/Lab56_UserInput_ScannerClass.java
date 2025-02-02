package ex_08_IfElse_Condition;

import java.util.Scanner;

public class Lab56_UserInput_ScannerClass {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        age = sc.nextInt();

        if(age>18)
        {
            System.out.println("eligible to vote");
        }
        else
        {
            System.out.println("Not eligible to vote");
        }
    }
}
