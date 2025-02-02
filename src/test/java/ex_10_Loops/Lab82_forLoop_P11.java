package ex_10_Loops;

public class Lab82_forLoop_P11 {
    public static void main(String[] args) {
        for(int i=1;i<=50;i++) {
            if (i  == 5) {
                continue; // skips the above condtion goes to top(for loop)
                //it skips i=5 and then increments i=6 to ....50
            }
            System.out.println(i);
        }
    }
}
