package Programs.ex_29_Exceptions;

public class Lab158_try_catch {
    public static void main(String[] args) {

        System.out.println("start");
        try
        {
            int c = 10/0;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("catch block");
          //  e.printStackTrace(); //prints full problem details
        }

        System.out.println("stop");
    }
}
