package Programs.ex_16_Arrays;

public class Lab104_Array_P2 {
    public static void main(String[] args) {
        int b[] = {10,11,12,13,14,15};

        //2nd way of creating array - using new array
        int a[] = new int[5]; //array size cannot be changed

        //default value of array is default value of data type
          // ex: if data type is int -> default value of array is 0

        System.out.println(a.length);

        b[5] = 16;

        a[0] = 1;
        a[1] = 10;
        a[2] = 20;
        a[3] = 30;
        a[4] = 40;

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

    }
}
