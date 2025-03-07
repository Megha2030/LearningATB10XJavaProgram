package Programs.ex_24_Super;

public class Lab140_Super {
    public static void main(String[] args) {
        Car c = new Car(203);
        c.display();

    }
}

class Vehicle
{
    public int maxSpeed = 180;

    Vehicle()
    {
        System.out.println("default constructer");
    }

    Vehicle(int a)
    {
        System.out.println("Parameterized constructer");
    }

    void message()
    {
        System.out.println("No return type, No Argument");
    }

    void message(int a)
    {
        System.out.println("method with arguement");
    }

    void display()
    {
        System.out.println("vehicle -> parent");
    }
}

class Car extends Vehicle
{
    private int maxspeed = 280;

    Car()
    {
        super(10); // it calls parameterized construc in parent class
    }

    Car(int a)
    {
        System.out.println("param const call");
    }
    @Override
    void display() {
        System.out.println("override - Car");
        System.out.println(super.maxSpeed); // accessing maxspeed from parent class
        System.out.println(this.maxspeed); // accessing maxspeed from same class
    }
}
