package Programs.ex_16_Arrays;

public class Lab109_Array_MinValue_P7 {
    public static void main(String[] args) {
        int marks[] = {10,18,90,13,14,55};
        int min =marks[0];
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]< min)
            {
                min = marks[i];
            }
        }
        System.out.println("max of array is:"+ min);
    }
}
