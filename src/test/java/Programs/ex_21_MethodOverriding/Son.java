package Programs.ex_21_MethodOverriding;

public class Son extends Father{
    @Override //overrriding home function in Father class
    void home()
    {
        System.out.println("Sons home");
    }
}
