package ex_10_Loops;

//WAP to find even or odd numbers from 1 to 50
public class Lab80_EvenOdd_P9 {
    public static void main(String[] args) {
        for(int i=1;i<=50;i++)
        {
            if(i%2==0)
            {
                System.out.println(i+" is an even number");
            }
            else {
                    System.out.println(i+" is an odd number");
            }
        }
    }
}
