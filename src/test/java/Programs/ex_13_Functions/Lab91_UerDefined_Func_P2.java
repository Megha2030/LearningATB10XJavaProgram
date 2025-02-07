package Programs.ex_13_Functions;

public class Lab91_UerDefined_Func_P2 {
    public static void main(String[] args) {
        greet();

        String s = greet2();
        System.out.println(s);

        int ageToVote = ageToVote();
        System.out.println(ageToVote);

        greetWithName("Megs");

        greetWithFullName("Megha","D");

        empDetails("Megs",20,60000.87);

        int sum = add(10,20);
    }

    //1. without parameter and without return type
    static void greet()
    {
        System.out.println("Hiiiii");
    }

    //2. without parameter but with return type
    static String greet2()
    {
        return "Hi this is returning string";
    }

    static int ageToVote()
    {
        return 18;
    }

    //3. With Parameter Without return type
    static void greetWithName(String name)
    {
        System.out.println("Hiiiii"+name);
    }
    static void greetWithFullName(String firtName,String lastName)
    {
        System.out.println("Hiiiii"+firtName+" "+lastName);
    }

    static void empDetails(String name,int age,double salary)
    {
        System.out.println(name+" "+age+" "+salary);
    }

    //4. With Parameter With return Type
    static int add(int a,int b)
    {
        return a+b;
    }
}
