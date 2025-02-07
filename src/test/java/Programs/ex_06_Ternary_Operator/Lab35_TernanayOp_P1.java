package Programs.ex_06_Ternary_Operator;

public class Lab35_TernanayOp_P1 {
    public static void main(String[] args) {
        //syntax : res = condition ? exp1 : exp2
        int age = 18;
        String result = age>=18 ? "you can vote":"you can't vote";
        System.out.println(result);
    }
}
