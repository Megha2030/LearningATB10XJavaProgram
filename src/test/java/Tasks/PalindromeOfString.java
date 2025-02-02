package Tasks;

//WAP to find Palidrome of String
// (chatAt()) - naman, → reverse - naman , madam ( string = rev(str)
import java.util.Scanner;

public class PalindromeOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc.next();

        String rev ="";

        for(int i=str.length()-1;i>=0;i--)
        {
            rev = rev+str.charAt(i);
        }
        System.out.println("palindrome of "+str+ " is " + rev);
    }
}
