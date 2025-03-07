package Programs.ex_25_Abstraction_Interfaces;

public class Lab144_MultipleInheritance_solved {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.f1();
        child1.m1();
        child1.money();
    }

}

interface Mother1
{
    void money();
    void m1();
}

interface Father1
{
    void money();
    void f1();
}

class Child1 implements Mother1, Father1
{
    @Override
    public void f1() {
        System.out.println("father class");
    }

    @Override
    public void money()  // only 1 money will be there bcz in above interfaces the money method is incomplete
    {
        System.out.println("Money");
    }

    @Override
    public void m1() {
        System.out.println("mother class");
    }
}
