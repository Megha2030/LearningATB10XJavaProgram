package Programs.ex_17_OOPS;

public class Lab125_Cats {
    public static void main(String[] args) {
        cat c1 = new cat(); // object
        cat c2 = null; // reference without object
        new cat(); //object without reference
        
        c1.run();
        c2.run(); //inititally it will throw error-> then make cat c2 = null
        // running the program throws NullPointerException for line 10-> as c2 =null
    }
}

class cat
{
    String name;

    void run()
    {
        System.out.println("Running");
    }
}
