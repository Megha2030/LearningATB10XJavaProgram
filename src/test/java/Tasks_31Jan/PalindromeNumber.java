package Tasks_31Jan;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int n = sc.nextInt();
            int reversed = 0;
            int original =n;

            while (n>0){
                int digit = n%10;
                reversed = reversed *10 + digit;
                n=n/10;
            }
            System.out.println(reversed);
            if(reversed == original){
                System.out.println(n+" ia a Palindrome");
            }else{
                System.out.println(n+ "not a palindrome");
            }
        }
    }



