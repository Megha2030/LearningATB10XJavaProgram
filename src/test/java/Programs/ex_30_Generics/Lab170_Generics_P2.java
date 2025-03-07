package Programs.ex_30_Generics;

public class Lab170_Generics_P2 {
    public static void main(String[] args) {
        temp(4,8);
        temp("meg","ha");
        temp(true,false);

    }

    public static <T> T temp(T a,T b)//<T> - generic data type 
    {
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
