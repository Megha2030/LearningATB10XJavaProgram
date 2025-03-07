package Programs.ex_31_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab180_ArrayList_UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList();

        String continueInput = "Y";

        while (continueInput.equalsIgnoreCase("y"))
        {
            System.out.print("enter names:");
            String name = sc.nextLine();
            names.add(name);

            System.out.print("enter age:");
            int age = sc.nextInt();

            sc.nextLine();
            System.out.print("do u want to continue y/n:");
            continueInput = sc.nextLine();

        }

        for (Object o1 :names)
        {
            System.out.println(o1);
        }
        for (Object o2 :ages)
        {
            System.out.println(o2);
        }
    }
}
