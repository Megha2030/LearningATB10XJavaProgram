package Programs.ex_25_Abstraction_Interfaces;



public class Lab142_Interfaces {
    public static void main(String[] args) {
        Car1 c = new Car1();
        c.drive();
    }
}

interface Engine1
{
    void startEngine();
    void stopEngine();

    //complete functions cannot be created in interfaces
    // in order to create complete function add default
   /* void abc() //throws error as it is complete functions
    {
        System.out.println("complette funct");
    } */
    // in order to create complete function add default
   default void abc()
    {
        System.out.println("complette funct");
    }
}

interface Breaks
{
    void applyBreaks();
}

class Car1 implements Engine1,Breaks
{

    @Override
    public void applyBreaks() {
        System.out.println("apply breaks");
    }

    @Override
    public void startEngine() {
        System.out.println("start Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("stop Engine");
    }

    void drive()
    {
        startEngine();
        applyBreaks();
        stopEngine();
    }
}

