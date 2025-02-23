package Programs.ex_23_AccessModifier.Police;

public class JuniorCop {
    public static void main(String[] args) {
        Cop cop = new Cop(4);
        cop.canIShoot(); // cann be acceesed if method is protected
    }

}
