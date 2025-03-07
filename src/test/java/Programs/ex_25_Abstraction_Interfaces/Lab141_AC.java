package Programs.ex_25_Abstraction_Interfaces;

public class Lab141_AC {

    public static void main(String[] args) {
        Wagonor wagonor = new Wagonor();
        wagonor.drive(); // it calls both startEngine() & stopEngine() methods
    }
}

abstract class Car
{
    abstract void startEngine();
    abstract void stopEngine();

    void completeFunc() // abstract can have complete methods
    {
        System.out.println("complete mthod");
    }
}

class Wagonor extends Car{

    @Override
    void startEngine() {
        System.out.println("start");
    }

    @Override
    void stopEngine() {
        System.out.println("stop");
    }

    void drive()
    {
        startEngine();
        System.out.println("driving");
        stopEngine();
    }
}
