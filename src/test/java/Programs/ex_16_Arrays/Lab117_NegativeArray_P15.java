package Programs.ex_16_Arrays;

public class Lab117_NegativeArray_P15 {
    public static void main(String[] args) {
       // int a[] = new int[-9]; // negative index does not throw error during compile time
        // throws error during runtime
        //NegativeArraySizeException
        int a[] = new int[4];
        a[1] = 12;
        a[2] = -9; // array values can be negative
        a[3] = 10;

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        for(int i:a)
        {
            System.out.println(i);
        }
    }
}
