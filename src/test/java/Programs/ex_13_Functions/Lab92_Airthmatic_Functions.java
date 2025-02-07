package Programs.ex_13_Functions;

import java.util.Scanner;

//create a func for Add, Sub, Mul and Div
// take a & b as paratmeters -> values from user
public class Lab92_Airthmatic_Functions {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n1 value");
        int n1 = sc.nextInt();
        System.out.println("enter n2 value");
        int n2 = sc.nextInt();

        System.out.println(add(n1,n2));
        System.out.println(sub(n1,n2));
        System.out.println(mul(n1,n2));
        System.out.println(div(n1,n2));



    }
    static int add(int a, int b)
    {
        return a+b;
    }
    static int sub(int a, int b)
    {
        return a-b;
    }
    static int mul(int a, int b)
    {
        return a*b;
    }
    static int div(int a, int b)
    {
        if(b==0)
        {
            System.out.println("divide by 0 not possible");
        }
        return a/b;
    }
}

