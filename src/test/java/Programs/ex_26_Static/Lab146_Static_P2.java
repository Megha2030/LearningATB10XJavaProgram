package Programs.ex_26_Static;

public class Lab146_Static_P2 {
    public static void main(String[] args) {
        ATB atb = new ATB(89765566,"Abhi");
        ATB atb1 = new ATB(87645644,"Megha");

        System.out.println(atb.phNo+" "+atb.name);
        System.out.println(atb1.phNo+" "+atb1.name);
    }


}

class ATB
{
    static String courseName = "ATB";
    long phNo;
    String name;

    public ATB(long phNo, String name) {
        this.phNo = phNo;
        this.name = name;
    }

    void display()
    {
        System.out.println(this.phNo+" "+this.name+" "+courseName);
    }
}
