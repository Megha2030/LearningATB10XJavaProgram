package Programs.ex_23_AccessModifier;

import Programs.ex_23_AccessModifier.Police.Cop;

public class Lab138_CommonClass {
    public static void main(String[] args) {
        Cop c = new Cop(10);
       // c.canIShoot(); // can be accessed outside class as canIShoot() is public method
    }
}
