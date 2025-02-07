package Tasks.Tasks_1Feb;

import java.util.Scanner;
//Check if a Number is Divisible by 5 and 11
public class NumDivisibleBy5And11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int n = sc.nextInt();

        if((n%5 ==0) && (n%11 == 0))
        {
            System.out.println(n+" is divisible by 5 & 11");
        }
        else
        {
            System.out.println(n+" is not divisible by 5 & 11");
        }
    }
}
