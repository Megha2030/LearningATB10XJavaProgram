package Tasks;
/*Calculate Grade Based on Marks. (Follow Below Steps to Write Program.)
1️⃣ Take user input for marks (Use Scanner class).
2️⃣ Check the validity of marks (ensure they are between 0 and 100).
3️⃣ Use if-else-if conditions to determine the grade based on marks.
4️⃣ Display the grade as output.*/

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks");
        int marks = sc.nextInt();
        if(marks>=0 && marks<=100)
        {
            if(marks>=90 && marks<=100)
            {
                System.out.println("grade is A+");
            }
            else if(marks>=80 && marks<=89)
            {
                System.out.println("grade is A");
            }
            else if(marks>=70 && marks<=79)
            {
                System.out.println("grade is B");
            }
            else if(marks>=60 && marks<=69)
            {
                System.out.println("grade is C");
            }
            else if(marks>=50 && marks<=59)
            {
                System.out.println("grade is D");
            }
            else if(marks>=40 && marks<=49)
            {
                System.out.println("grade is E");
            }
            else
            {
                System.out.println("Fail");
            }
        }
        else
        {
            System.out.println("your marks should be between 0-100");
        }
    }
}
