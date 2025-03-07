package Tasks.Task_19Feb;

public class Constructor_Overloading {
    public static void main(String[] args) {

        Constructor_Overloading co = new Constructor_Overloading();
        Constructor_Overloading co2 = new Constructor_Overloading(3,4);
    }

    public Constructor_Overloading()
    {
        System.out.println("default constructor");
    }

    public  Constructor_Overloading(int a, int b)
    {
        System.out.println("Parameterized constructor");
        System.out.println(a+b);
    }
}
