package Programs.ex_25_Abstraction_Interfaces;

public class Lab141_Abstraction {
    public static void main(String[] args) {

       // Father f = new Father(); we cannot create object for abstract classes

        Child c = new Child();
        c.loan75k();
        c.loan25k(); // by this we are hiding Father class details -> Abstraction
    }
}

// abstratct classes -> classes having incomplete methods
abstract class Father
{
    abstract void loan75k(); // incomplete abstract method

    void loan25k()
    {
        System.out.println("paid 25k loan");
    }
}

class Child extends Father
{
    // incomplete method in parent class should be completed in child class
    @Override
    void loan75k() {
        System.out.println("child will loan of 75k");
    }
}
