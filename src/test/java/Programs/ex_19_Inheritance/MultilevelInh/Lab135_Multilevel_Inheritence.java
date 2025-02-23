package Programs.ex_19_Inheritance.MultilevelInh;

public class Lab135_Multilevel_Inheritence {
    public static void main(String[] args) {

        Son s= new Son();
        Father f = new Father();
        GrandFather gf = new GrandFather();

        f.home();

        s.bhk3();
    }
}
