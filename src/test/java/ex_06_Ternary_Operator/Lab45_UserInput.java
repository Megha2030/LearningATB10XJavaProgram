package ex_06_Ternary_Operator;

public class Lab45_UserInput {
    public static void main(String[] args) {
        // taking inputs from user using cli
        // click on above arrow -> edit configuration -> give the value -> click on Apply ->OK
        //the value will be passed in (String[] args) -> args is value we gave in config

        String age_str = args[0]; // the value given will be passed as string
        // we should convert it to int using parseInt
        int age = Integer.parseInt(age_str);
        System.out.println(age);

        String isAdult = age >=18 ? "adult" : "not adult";

        System.out.println(isAdult);
    }

}
