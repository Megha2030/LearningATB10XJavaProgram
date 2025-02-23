package Programs.ex_21_MethodOverriding;

public class Lab136_MethodOveride {
    public static void main(String[] args) {

        Son s = new Son();
        s.home(); // calls home() in Son's class

        Father f = new Father();
        f.home(); // calls home() in Father's class

        Father f1 = new Son(); // this is called dynamic dispatch
        f1.home(); // calls the function from Son's class since in above stmt we have created object for son class

        // this is called Method overriding - overriding fathers class by sons class

        //Son s = new Father(); // this is not possible bcz Parent cnnot be inherited by child class
    }
}
