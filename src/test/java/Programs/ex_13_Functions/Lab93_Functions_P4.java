package Programs.ex_13_Functions;

import java.util.Scanner;

public class Lab93_Functions_P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n1 value");
        int n1 = sc.nextInt();
        System.out.println("enter n2 value");
        int n2 = sc.nextInt();
        int res = sum(n1,n2);
    }
    static int sum(int a, int b)
    {
        return a+b;
    }
}
