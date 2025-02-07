package Programs.ex_09_Switch_Condition;

public class Lab69_Switch_LamdaExp {
    public static void main(String[] args) {
        int item = 001;
        switch (item)
        {
            //java 13
            case 001 -> System.out.println("001"); // -> represents lamda expression
            case 002 -> System.out.println("002"); // used for executing without break
            case 003 -> System.out.println("003");
            default -> System.out.println("default");
        }
    }
}
