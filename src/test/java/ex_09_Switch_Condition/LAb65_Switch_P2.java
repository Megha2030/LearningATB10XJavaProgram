package ex_09_Switch_Condition;

import java.util.Scanner;

public class LAb65_Switch_P2 {
    public static void main(String[] args) {
        String browser;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter browser name");
        browser = sc.next();
         switch (browser)
         {
             case "chrome":
                 System.out.println("open chrome");
                 break;
             case "Edge":
                 System.out.println("open edge");
                 break;
             case "FireFox":
                 System.out.println("firefox");
                 break;
             default:
                 System.out.println("invalid browser name");

         }

    }
}
