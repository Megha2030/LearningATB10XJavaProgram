package Tasks;

import java.util.Scanner;

//2)Check if a Number is Even or Odd.
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();

        if(num%2==0)
        {
            System.out.println(num+" is even number");
        }
        else {
            System.out.println(num+" is odd number");
        }
    }
}
