package Tasks;
// 7) Find the Smallest of Two Numbers.
import java.util.Scanner;

public class SmallestOf2Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n1 = sc.nextInt();

        System.out.println("enter a number");
        int n2 = sc.nextInt();

        if (n1 < n2) {
            System.out.println(n1 + " is smallest");
        } else {
            System.out.println(n2 + " is smallest");
        }
    }
}
