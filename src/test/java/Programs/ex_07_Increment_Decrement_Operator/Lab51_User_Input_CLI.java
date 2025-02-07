package Programs.ex_07_Increment_Decrement_Operator;

public class Lab51_User_Input_CLI {
    public static void main(String[] args) {
        String name = args[0];
        String ageStr =args[1];
        int age = Integer.parseInt(ageStr);
        System.out.println(name);
        System.out.println(age);
    }
}
