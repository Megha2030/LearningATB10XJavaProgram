package Tasks;

import java.util.Scanner;
// WAP 1) Check if a Number is Positive or Negative.
public class PositiveNegativeNumCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();

        if(num>0)
        {
            System.out.println(num+" is a positive number");
        }
        else if(num<0)
        {
            System.out.println(num+" is a negative number");
        }
        else{
            System.out.println(num + " is 0");
        }
    }

}
