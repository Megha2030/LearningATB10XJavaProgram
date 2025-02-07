package Programs.ex_03_Literals;

public class Lab15_Literals_P2 {
    public static void main(String[] args) {
        int a =10; //10 is integer literal
        System.out.println(a);

        int neg = -10; //valid since range of int is 128 to 127
        System.out.println(neg);

        float b=23.98f; // b is a floating point literal
        System.out.println(b);

        float c=45; //internally c is converted from int to float
        System.out.println(c);
    }
}
