package Programs.ex_16_Arrays;

public class Lab111_SumOfArray_P9 {
    public static void main(String[] args) {
        int marks[] = {10,18,90,13,14,55};
        int sum =0;
        for(int i=0;i<marks.length;i++)
        {
            sum = sum+marks[i];
        }
        System.out.println("sum of array is:"+sum);

    }
}
