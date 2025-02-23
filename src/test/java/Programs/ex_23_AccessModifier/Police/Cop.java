package Programs.ex_23_AccessModifier.Police;

public class Cop {
    public int gun;
    String icard;

    public Cop(int gun)
    {
        this.gun = gun;
    }

    /*public void canIShoot() // if made public it can be accessed outside class
    {
        System.out.println("yes u can");
    }*/

   /* private void canIShoot() // if made private it can be accessed only inside class
    {
        System.out.println("yes u can");
    }*/

    protected void canIShoot() // if made protected it can be accessed ouside class but within same package
    {
        System.out.println("yes u can");
    }


}
