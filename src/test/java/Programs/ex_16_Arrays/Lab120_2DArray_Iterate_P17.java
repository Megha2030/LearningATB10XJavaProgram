package Programs.ex_16_Arrays;

public class Lab120_2DArray_Iterate_P17 {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for(int i=0;i< matrix.length;i++) //iterating row
        {
            for(int j=0;j<matrix[i].length;j++) //iterating col
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
