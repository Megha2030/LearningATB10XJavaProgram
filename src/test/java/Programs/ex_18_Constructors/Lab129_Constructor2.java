package Programs.ex_18_Constructors;

public class Lab129_Constructor2 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a); // prints address of obj ref a
    }
}

class A
{
    A()
    {
        System.out.println("this is constructor call");
        System.out.println("called only once when object is created");
        System.out.println("----------");
    }
}
