package Programs.ex_26_Static;

public class Lab147_Static_P3 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(A.num);
        A.abc();
    }
}

class A
{
    static  // static block
    {
        System.out.println("Static block -> called when class is loaded");
    }

    static int num =20; // static variable

    static  void abc()
    {
        System.out.println("static method");
    }
}
