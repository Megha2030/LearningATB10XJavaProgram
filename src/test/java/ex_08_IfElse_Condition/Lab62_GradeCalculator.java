package ex_08_IfElse_Condition;
import java.util.Scanner;
/*Grade Calculator:
Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59 */
public class Lab62_GradeCalculator {
    public static void main(String[] args) {
        int marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks");
        marks = sc.nextInt();
        if(marks>=90 && marks<=100)
        {
            System.out.println("Grade is A");
        }
        else if(marks>=80 && marks<=89)
        {
            System.out.println("Grade is B");
        }
        else if(marks>=70 && marks<=79)
        {
            System.out.println("Grade is C");
        }
        else if(marks>=60 && marks<=69)
        {
            System.out.println("Grade is D");
        }
        else
        {
            System.out.println("Grade is F");
        }
    }
}
