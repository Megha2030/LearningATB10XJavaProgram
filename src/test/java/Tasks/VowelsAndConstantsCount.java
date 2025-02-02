package Tasks;
//Count vowels and consonants in a String.  -pramod, → vowels - 2, consnants - 4

import java.util.Scanner;

public class VowelsAndConstantsCount {
    public static void main(String[] args) {
        int vowelsCount=0, consCount=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc.next();

        for(int i=0;i<str.length();i++)
        {

            char ch = str.charAt(i);

           if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                vowelsCount++;
            }
            else
            {
                consCount++;
            }

        }
        System.out.println("number of vowels in string: " +vowelsCount);
        System.out.println("number of constants in string: " +consCount);
    }
}
