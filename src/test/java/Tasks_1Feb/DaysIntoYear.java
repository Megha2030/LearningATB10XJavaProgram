package Tasks_1Feb;

import java.util.Scanner;

public class DaysIntoYear {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter days");
        int noOfday =sc.nextInt();
        int year= noOfday /365;
        int rem= noOfday %365;
        int month= rem/30;
        int days=rem%30;
        System.out.println(year+ " years, "+month +"months, " +days+ " days");
    }
}
