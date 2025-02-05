package Tasks;
//8) Find the Smallest of Three Numbers.
import java.util.Scanner;

public class SmallestOf3Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a n1");
        int n1 = sc.nextInt();
        System.out.println("enter a n2");
        int n2 = sc.nextInt();
        System.out.println("enter a n3");
        int n3 = sc.nextInt();

        if(n1<n2 && n1<n3)
        {
            System.out.println(n1+ " is smallest");
        }
        else if(n2<n3 && n2<n1)
        {
            System.out.println(n2+ " is smallest");
        }
        else {
            System.out.println(n3+ " is smallest");
        }
    }
}
