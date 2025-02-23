package Programs.ex_18_Constructors;

public class Lab128_Const_IIB {
    public static void main(String[] args) {
        Plant p = new Plant(); // both IIB & constructor will be called automatically when obj is created


    }
}

class Plant
{
    Plant()
    {
        System.out.println("plant constructor");
    }

    //Instance Initialization Block
    {
        System.out.println("IIB block");
    }
}
