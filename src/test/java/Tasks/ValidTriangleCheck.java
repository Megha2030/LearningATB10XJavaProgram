package Tasks;

import java.util.Scanner;

// Check if a Triangle is Valid Based on Three Sides. (Follow Below Steps to Write Program)
// A triangle is valid if sum of its two sides is greater than the third side.
// If three sides are a, b and c, then three conditions should be met.
//1.a + b > c
//2.a + c > b
//3.b + c > a
public class ValidTriangleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side a of triangle");
        int a= sc.nextInt();
        System.out.println("enter side b of triangle");
        int b= sc.nextInt();
        System.out.println("enter side c of triangle");
        int c= sc.nextInt();

        if(a+b>c || a+c>b || b+c>a)
        {
            System.out.println("triangle is valid");
        }
        else
        {
            System.out.println("triangle is not valid");
        }
    }
}

