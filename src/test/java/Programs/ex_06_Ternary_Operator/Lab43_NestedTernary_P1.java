package Programs.ex_06_Ternary_Operator;

public class Lab43_NestedTernary_P1 {
    public static void main(String[] args) {

        //syntax
        // result = condition1 ? expression1 : (condtion2 ? expression2 : expression3)
        int num =15;
        String res = num>10 ? (num>20 ? "greater than 20" : " btwn 10 to 20") : "B";
        System.out.println(res);

    }
}
