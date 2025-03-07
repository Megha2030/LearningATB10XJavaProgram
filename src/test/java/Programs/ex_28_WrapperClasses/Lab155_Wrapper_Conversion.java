package Programs.ex_28_WrapperClasses;

public class Lab155_Wrapper_Conversion {
    public static void main(String[] args) {
        String n="40";

        Integer a = Integer.parseInt(n);//converting string wrapper to integer

        System.out.println(a);
        
        int b = Integer.parseInt(n); // converting wrapper string to primitive int

        System.out.println(b);
    }
}
