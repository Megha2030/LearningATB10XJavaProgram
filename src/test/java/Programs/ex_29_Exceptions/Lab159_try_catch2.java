package Programs.ex_29_Exceptions;

public class Lab159_try_catch2 {
    public static void main(String[] args) {
        String s = null; // java.lang.NullPointerException
        try
        {
            s.trim();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(s);
    }
}
