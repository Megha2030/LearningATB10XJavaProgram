package Programs.ex_29_Exceptions;

public class Lab160_Multiple_Exception {
    public static void main(String[] args) {
        System.out.println("start");

        try {
            int c = 10/0;
            String s = null;
            s.trim();
        }
       /* catch (ArithmeticException | NullPointerException e) {
            System.out.println(e.getMessage());
        }*/



       // (or)
       catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
