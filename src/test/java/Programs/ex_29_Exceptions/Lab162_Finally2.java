package Programs.ex_29_Exceptions;

import java.util.Scanner;

public class Lab162_Finally2 {
    public static void main(String[] args) {
        Scanner sc = null;
        sc = new Scanner(System.in);

       int a = sc.nextInt();

        try {
            int c = 50/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("close sc");
            sc.close();

        }

    }
}
