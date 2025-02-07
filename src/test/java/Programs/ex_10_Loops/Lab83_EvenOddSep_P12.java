package Programs.ex_10_Loops;

public class Lab83_EvenOddSep_P12 {
    public static void main(String[] args) {
        for(int i=0;i<=50;i++) {
            if (i%2==0)  //condition true it prints even i value
            {
                System.out.println(i+" even");
                continue;  // continue to above for loop increments -> then if condition fails below sout stmt is printed
            }
            System.out.println(i+ "odd");
        }
    }
}
