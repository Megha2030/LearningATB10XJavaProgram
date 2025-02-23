package Programs.ex_18_Constructors;

public class Lab126_Constructor1 {
    public static void main(String[] args) {

        Baby b = new Baby(); //constructor is called
        Baby b2; // obj is not created
        new Baby(); //obj without ref -> constructor is called

    }
}

class Baby
{
    // this method shld have same name as class
    // no return type
    // its called automatically when object is created
    Baby()
    {
        System.out.println("constructor call");
    }
}
