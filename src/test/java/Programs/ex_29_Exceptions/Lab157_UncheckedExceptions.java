package Programs.ex_29_Exceptions;

public class Lab157_UncheckedExceptions {
    // JVM doesn't know about the exceptions
    // identified during runtime
    public static void main(String[] args) {
         int a=0;
         int b=10;

         int c = b/a; //java.lang.ArithmeticException: / by zero - will be thrown
       System.out.println(c);

        String s = null; // java.lang.NullPointerException
        s.trim();
    }
}
