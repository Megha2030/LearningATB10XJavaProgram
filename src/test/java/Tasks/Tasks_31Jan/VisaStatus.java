package Tasks.Tasks_31Jan;
/*Find if a Person Can Travel Based on Visa Status and Age.
     take the input from the user for
            Age (integer).
           Visa Status (String or boolean).
                 Check Eligibility:
             :- If age is 18 or older and visa status is valid, the person can travel.
Otherwise, the person cannot travel.
        Validation Criteria
                Age: - Must be a non-negative integer.
                        :- Should be greater than or equal to 18 to be eligible to travel.
       Visa Status :- Must be a valid string indicating the visa status (e.g., "valid" or "invalid").
                              :- You can also use a boolean where true indicates a valid visa and false indicates an invalid
        */

import java.util.Scanner;

public class VisaStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();

        System.out.println("Enter visa status");
        String visaStatus = sc.next();

        if(age>=18 && visaStatus.equalsIgnoreCase("valid"))
        {
            System.out.println("u Can Travel");
        }
        else
        {
            System.out.println("Invalid visa,u cannot Travel");
        }
    }
}
