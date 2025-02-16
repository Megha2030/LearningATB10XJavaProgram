package Programs.ex_16_Arrays;

public class LAb108_Array_MAxValue_P6 {
    public static void main(String[] args) {
        int marks[] = {10,18,90,13,14,55};
        int max=marks[0];
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]>max)
            {
                max = marks[i];
            }
        }
        System.out.println("max of array is:"+max);
    }
}
