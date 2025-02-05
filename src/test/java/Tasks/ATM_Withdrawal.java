package Tasks;
/*initialize the account balance with a fixed amount (e.g., ₹10,000).
2️⃣ Take user input for the amount they want to withdraw.
3️⃣ Check withdrawal conditions:
The amount should be greater than zero.
The amount should be a multiple of 100 (common ATM rule).
The amount should not exceed the account balance.
4️⃣ Deduct the amount from the balance if conditions are met.
5️⃣ Display the updated balance or an error message if the withdrawal fails*/

import java.util.Scanner;
public class ATM_Withdrawal {
    public static void main(String[] args)
    {
        int accountBalance=10000;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount to withdraw");
        int withdrawAmount = sc.nextInt();

       /* if(withdrawAmount>0 && withdrawAmount%100==0 && withdrawAmount<=accountBalance)
        {
            accountBalance = accountBalance - withdrawAmount;
            System.out.println("your acc balance is: "+accountBalance);
        }*/
        if(withdrawAmount<=0)
        {
            System.out.println("enter amount in proper format");
        }
        else if(withdrawAmount%100==0 && withdrawAmount<=accountBalance)
        {
            accountBalance = accountBalance - withdrawAmount;
            System.out.println("your acc balance is: "+accountBalance);

        }
        else
        {
            System.out.println("enter amount lesser than your account balanace or shld be in multiples of 100");
        }
    }
}
