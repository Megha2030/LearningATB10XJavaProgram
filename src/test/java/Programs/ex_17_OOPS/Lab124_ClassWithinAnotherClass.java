package Programs.ex_17_OOPS;

public class Lab124_ClassWithinAnotherClass {
    public static void main(String[] args) {
        Students s1 = new Students();
        // Students -> class loading
        // s1 -> object reference
        // new Students() -> Object creation

    }
}

class Students
{
    String name;
    int rollNo;

    void study()
    {

    }

    void marks()
    {

    }
}
