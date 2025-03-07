package Programs.ex_29_Exceptions;

public class Lab150_Exceptions_p2 {
    public static void main(String[] args) {
        int c=0, b=0;
        try
        {
            b=10/c;
        }
        //catch (Exception e)
       /*  catch(Throwable e){ // Throable is parent class for -> Exception
             System.out.println(e.getMessage());
        }*/

        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }

        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        catch(Throwable e){ // Throable is parent class for -> Exception
            System.out.println(e.getMessage());
        }

        System.out.println(b);
    }
}
