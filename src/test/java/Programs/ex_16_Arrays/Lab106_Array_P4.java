package Programs.ex_16_Arrays;

public class Lab106_Array_P4 {
    public static void main(String[] args)
    {
        int b[] = {10,18,90,13,14,55};
        System.out.println(b.length);

        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
        System.out.println(b[4]);

        //using for loop to print array elements
        System.out.println("-----------");
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}
