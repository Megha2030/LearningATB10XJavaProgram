package Programs.ex_16_Arrays;

public class Lab103_Array_P1 {
    public static void main(String args[])
    {
        int a; //variable
        int b[] = {10,11,12,13,14,15};//Array

        System.out.println(b.length);
        System.out.println(b[0]);

        System.out.println(b[-1]); //ArrayIndexOutOfBoundsException
        System.out.println(b[10]); //ArrayIndexOutOfBoundsException
    }
}
