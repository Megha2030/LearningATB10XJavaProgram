package Tasks.Task_19Feb;

public class Parameterized_Const {
    public static void main(String[] args) {

        Parameterized_Const pc = new Parameterized_Const(3,4);
    }

    public  Parameterized_Const(int a, int b)
    {
        System.out.println("Parameterized constructor");
        System.out.println(a+b);
    }
}
