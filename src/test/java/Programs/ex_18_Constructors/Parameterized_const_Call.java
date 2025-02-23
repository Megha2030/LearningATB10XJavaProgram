package Programs.ex_18_Constructors;

public class Parameterized_const_Call {
    public static void main(String[] args) {
        Lab132_Parametrized_Constructor pc = new Lab132_Parametrized_Constructor(); // default constr is called

        System.out.println(pc.name);
        System.out.println(pc.age);

        Lab132_Parametrized_Constructor pc2 = new Lab132_Parametrized_Constructor("Abhilash",30);



        System.out.println(pc2.name);
        System.out.println(pc2.age);

    }
}
