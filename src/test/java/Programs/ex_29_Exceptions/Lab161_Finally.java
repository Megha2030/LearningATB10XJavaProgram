package Programs.ex_29_Exceptions;

public class Lab161_Finally {
    public static void main(String[] args) {
        System.out.println("start");
        try
        {
            int c = 10/0;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());

        }
        finally {
            System.out.println("always executed");
        }
    }
}
