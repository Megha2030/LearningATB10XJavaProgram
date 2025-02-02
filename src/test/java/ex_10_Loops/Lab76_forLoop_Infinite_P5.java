package ex_10_Loops;

public class Lab76_forLoop_Infinite_P5 {
    public static void main(String[] args) {
        final boolean b= true;
        for(int i=0;b;i++) // b value is true -> loop runs infinite times as all conditions are true
        {
            System.out.println(i);
        }
      /*  for(int j=0;;) // infinite condition
        {
            System.out.println(j);
        }*/
        /*  for(;;;) // infinite condition
        {
            System.out.println();
        }*/

    }
}
