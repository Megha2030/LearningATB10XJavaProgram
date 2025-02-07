package Programs.ex_07_Increment_Decrement_Operator;

public class Lab52_MaxOf2_UserInput {
    public static void main(String[] args) {
        String num1 = args[0];
        int n1 = Integer.parseInt(num1);
        String num2 = args[1];
        int n2 = Integer.parseInt(num2);

        String max = n1>n2 ? "n1 is max" : "n2 is max";
        System.out.println(max);
    }
}
