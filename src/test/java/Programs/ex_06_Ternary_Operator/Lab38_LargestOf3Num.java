package Programs.ex_06_Ternary_Operator;

public class Lab38_LargestOf3Num {
    public static void main(String[] args) {
        // Finding the Largest of Three Numbers a,b,c using the Ternary Operator.
        int n1 = 10, n2 = 76, n3 = 99;

        int largestNum = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);
        System.out.println(largestNum);
    }
}
