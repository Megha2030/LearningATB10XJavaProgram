package Tasks.Tasks_31Jan;

import java.util.Scanner;
/*Electricity Bill Calculation (Based on Units Consumed)
           :- take the input from the user of Units.
    Implement Rate Structure:
    Define the rate structure for calculating the bill based on the number of units consumed.
           :-  First 100 units: 0.50Rs per unit
            :-  Next 100 units (101-200): 0.75Rs per unit
            :- Next 100 units (201-300): 1.20Rs per unit
            :- Above 300 units: 1.50Rs per unit
 */
public class ElectricityBillCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter power consumed in units");
        int units = sc.nextInt();
        double rate;
        if(units>0 && units<=100)
        {
            rate = units*0.50;
            System.out.println("bill is: "+rate);
        }
        else if (units>=101 && units<=200)
        {
            rate = units*0.75;
            System.out.println("bill is: "+rate);
        }
        else if (units>=201 && units<=300)
        {
            rate = units*1.20;
            System.out.println("bill is: "+rate);
        }
        else if(units>300)
        {
            rate = units*1.50;
            System.out.println("bill is: "+rate);
        }
        else
        {
            System.out.println("check units entered");
        }

    }
}
