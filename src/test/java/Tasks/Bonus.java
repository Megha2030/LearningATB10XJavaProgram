package Tasks;

import java.util.Scanner;
/*Calculate Bonus Based on Salary and Years of Experience.
         :- take the salary and Year info from the User.
Implement Bonus Calculation Logic:
 Define the bonus structure based on salary and years of experience.
           :- If years of experience is less than 1 year: No bonus.
           :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
           :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
           :- If years of experience is greater than 6 years: Bonus is 15% of the salary.
 */
public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int yearOfExp = sc.nextInt();
        System.out.println("Enter salary");
        double salary = sc.nextDouble();
        double bonus;
        if(yearOfExp<1)
        {
            bonus=0;
            System.out.println("bonus is: "+bonus);
        }
        else if (yearOfExp>=1 && yearOfExp<=3)
        {
            bonus = salary+(salary*0.05);
            System.out.println("bonus is: "+bonus);
        }
        else if (yearOfExp>=4 && yearOfExp<=6)
        {
            bonus = salary+(salary*0.1);
            System.out.println("bonus is: "+bonus);
        }
        else if (yearOfExp>=6)
        {
            bonus = salary+(salary*0.15);
            System.out.println("bonus is: "+bonus);
        }

    }
}

