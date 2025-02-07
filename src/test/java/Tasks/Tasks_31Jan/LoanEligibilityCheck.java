package Tasks.Tasks_31Jan;

import java.util.Scanner;
/*17)  Check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)
    * Take the below User info and store it into the variables:
              Age (integer)
              Salary (double or float)
              Credit Score (integer)
    Age Validation:
              :- Check if the age is a positive integer.
              :- Ensure the age is at least 18 years old.
              :- Max age can be 80.
    Salary Validation:
             :- Check if the salary is a positive number.
             :- Define a minimum salary threshold (e.g., 30,000).
    Credit Score Validation:
             :- Check if the credit score is a positive integer.
             :- Define a minimum credit score threshold (e.g., 650).
             :- Max credit score threshold (e.g., 850).
*/
public class LoanEligibilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Enter salary");
        double salary = sc.nextDouble();
        System.out.println("Enter credit score");
        int creditScore = sc.nextInt();

        if(age>0 && age>=18 && age<=80)
        {
            if(salary>0 && salary>=30000)
            {
                if(creditScore>0 && creditScore>=650 && creditScore<=850)
                {
                    System.out.println("u r eligible for loan");
                }
                else
                {
                    System.out.println("u r not eligible for loan");
                }
            }
            else
            {
                System.out.println("u r not eligible for loan");
            }
        }
        else
        {
            System.out.println("u r not eligible for loan");
        }
    }
}
