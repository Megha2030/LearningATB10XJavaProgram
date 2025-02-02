package Tasks;

import java.util.Scanner;

//5) Check if a Person is Eligible to Vote (Age Check).
public class AgeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int age = sc.nextInt();

       // String eligibleToVote = age>18 ? "Person is Eligible to Vote" : "Person is not Eligible to Vote";
       // System.out.println(eligibleToVote);

        if(age>=18)
        {
            System.out.println("Person is Eligible to Vote");
        }
        else
        {
            System.out.println("Person is not Eligible to Vote");
        }

    }
}
