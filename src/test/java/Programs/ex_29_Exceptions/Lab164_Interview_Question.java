package Programs.ex_29_Exceptions;

public class Lab164_Interview_Question {
    public static void main(String[] args) {
        final double pi=3.14;
        int a= 0;
        try
        {
            int x=10/a;
        }
        catch (Exception e) {
            System.out.println("divide by 0 error");
        }
        finally {
            System.out.println("finally its executed");
        }
    }
}
