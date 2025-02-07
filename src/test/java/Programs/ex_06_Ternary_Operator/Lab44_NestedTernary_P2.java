package Programs.ex_06_Ternary_Operator;

public class Lab44_NestedTernary_P2 {
    public static void main(String[] args) {
        int age =69;

        // age<18 -> Minor
        // age>18 -> Adult
        // age>65 -> senior citizen

        String res = (age<18) ? "Minor" : (age<65) ? "adult" : "senoir citizen";
        System.out.println(res);
    }
}
