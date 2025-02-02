package ex_10_Loops;

public class Lab75_forLoop_P4 {
    public static void main(String[] args) {
        for(int i=0;i<18;i++) //no condition given so loop executes infinite times
        {
            if(i>15)
            {
                System.out.println("iphone");
            }
            else {
                System.out.println("no iphone");
            }
        }

    }
}
