package Programs.ex_22_Encapsulation.RealExample;

public class Lab138 {
    public static void main(String[] args) {
        ICICIBank bank = new ICICIBank("Abhi",9000);
        System.out.println(bank.getBal());

        bank.setBal(20000,true);
        System.out.println(bank.getBal());

        bank.setBal(23000,false);
    }
}

class ICICIBank
{
    private String name;
    private long bal;

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isCashier) {
        if(isCashier)
        {
            this.bal = bal;
        }
        else {
            System.out.println("not allowed to change balance");
        }

    }
}
