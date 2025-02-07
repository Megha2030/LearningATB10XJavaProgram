package Tasks.Tasks_31Jan;

import java.util.Scanner;
//Calculate Employee Net Salary (Basic Pay, HRA, DA, Tax Deductions) Reserch from your side for this program.

public class NetSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic salary");
        int basicSalary = sc.nextInt();
        System.out.println("enter the hra");
        double hra =sc.nextDouble();
        System.out.println("Enter the da");
        double da =  sc.nextDouble();
        System.out.println(" Enter other allowance");
        double oa = sc.nextDouble();
        System.out.println("Enter the tax rate:");
        double taxRate = sc.nextDouble();

        double grossSalary = (basicSalary + hra + da + oa);
        double taxDeduction = grossSalary * (taxRate / 100);
        double netSalary = (grossSalary - taxDeduction);

        System.out.println("The net salary is Rs." + netSalary);

    }
}
