package Programs.ex_29_Exceptions;

public class Lab156_Exceptions {
    public static void main(String[] args) {
        System.out.println("start program");

        String ip = args[0]; // if value is not given in edit config -> java.lang.ArrayIndexOutOfBoundsException
        int a= Integer.parseInt(ip);// if value of a is -> java.lang.NumberFormatException
        int b = 100/a; // java.lang.ArithmeticException: / by zero - will be thrown
        System.out.println(b);

        System.out.println("end of program");
    }
}
