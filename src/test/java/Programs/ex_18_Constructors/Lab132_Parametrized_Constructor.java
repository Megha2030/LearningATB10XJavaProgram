package Programs.ex_18_Constructors;

public class Lab132_Parametrized_Constructor {

    String name;
    int age;

    Lab132_Parametrized_Constructor() {
        System.out.println("default constructor");
        name = "Megha";
        age = 26;
    }

    // parameterized constructor
    Lab132_Parametrized_Constructor(String p_name, int p_age)
    {
        System.out.println("parameterized constructor");
        this.name = p_name; // this keyword is used to access global variable in local instance
        this.age = p_age;

    }
}
