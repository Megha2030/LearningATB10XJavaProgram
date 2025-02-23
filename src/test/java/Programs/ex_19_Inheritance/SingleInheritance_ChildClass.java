package Programs.ex_19_Inheritance;

public class SingleInheritance_ChildClass extends Lab134_SingleInheritance_ParentClass {

    public static void main(String[] args) {
         SingleInheritance_ChildClass sic = new SingleInheritance_ChildClass();
         sic.func1();
    }
    void func2()
    {
        System.out.println("child function");
    }
}
