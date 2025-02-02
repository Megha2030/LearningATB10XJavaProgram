package ex_08_IfElse_Condition;

import java.util.Scanner;

/*Write a program that classifies a triangle based on its side lengths.
Given three input values representing the lengths of the sides
determine if the triangle is equilateral (all sides are equal)
isosceles (exactly two sides are equal),
or scalene (no sides are equal).
Use an if-else statement to classify the triangle.
 */
public class Lab63_TriangleClassifier {
    public static void main(String[] args) {
        double s1,s2,s3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter s1 value");
        s1 = sc.nextDouble();
        System.out.println("enter s2 value");
        s2 = sc.nextDouble();
        System.out.println("enter s3 value");
        s3 = sc.nextDouble();
        if(s1<=0 || s2<=0 ||s3<=0) {
            System.out.println("invalid input enter =ve value > 0");
        }
        else {
            if (s1 == s2 && s2 == s3 && s3 == s1) {
                System.out.println("triangle is equilateral");
            } else if (s1 == s2 || s2 == s3 || s3 == s1) {
                System.out.println("triangle is isosceles");
            } else {
                System.out.println("triangle is scalene");
            }
        }
    }
}
