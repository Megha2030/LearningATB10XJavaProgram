package Tasks.Task_9Feb;

public class SortingArrayWithoutInbuiltFuc {
    public static void main(String[] args) {
        int num[] = {12, 34, 10, 1, 100, 3, 4, 32};
       // int len = num.length;
        int temp;
        for(int i=0;i<num.length;i++)
        {
            for(int j=i+1;j<num.length;j++)
            {
                if (num[i] > num[j])
                {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
            System.out.print(num[i]+" ");
        }
        //System.out.println();
        //System.out.println("2nd largest:"+ num[len-2]);

    }
}
