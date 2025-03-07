package Programs.ex_25_Abstraction_Interfaces;

public class Lab143_Interfaces2 {
    public static void main(String[] args) {
        P p = new P();
        p.icm1();
        p.icm2();
    }
}

interface I1
{
    void icm1();
    void icm2();
}

interface I2
{
    void icm3();
}

class P implements I1
{

    @Override
    public void icm1() {
        System.out.println("icm1 complete");
    }

    @Override
    public void icm2() {
        System.out.println("icm2 complete");
    }
}
