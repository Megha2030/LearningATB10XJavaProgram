package Tasks;
// 11) Check if a Character is an Alphabet.

import java.util.Scanner;

public class CharacterIsAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character");
        char c = sc.next().charAt(0);

        if((c>='A' && c<='Z') || (c>='a' && c<='z'))
        {
            System.out.println(c+" is an alphabet");
        }
        else
        {
            System.out.println(c+" is not a alphabet");
        }
    }
}
