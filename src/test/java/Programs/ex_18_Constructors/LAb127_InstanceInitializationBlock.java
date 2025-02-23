package Programs.ex_18_Constructors;

public class LAb127_InstanceInitializationBlock {
    public static void main(String[] args) {
        IIB i=new IIB(); // object created with reference // IIB is called
        new IIB(); // object created without reference // IIB is called

    }
}
class IIB
{
    // Instance Initialization Block
    // called when object is created
    // strats with { and ends with }
    {
        System.out.println("Instance Initialization Block:called when obj is created");
    }
}
