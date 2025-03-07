package Programs.ex_29_Exceptions;

public class Lab163_Multiple_Exceptions {
    public static void main(String[] args) {
        try {
            String ip = args[0];
            int a= Integer.parseInt(ip);
            int b = 100/a;
            System.out.println(b);
        }
        catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }
}
