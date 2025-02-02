package Tasks;

import java.util.Scanner;
// 4) Check if a Character is a Vowel or Consonant.
public class VowelOrConsonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character");
        char ch = sc.next().charAt(0);
        if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                System.out.println(ch+" is a Vowel");
            }
            else
            {
                System.out.println(ch+" is a Consonant");
            }

    }
}
