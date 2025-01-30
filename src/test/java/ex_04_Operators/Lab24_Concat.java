package ex_04_Operators;

public class Lab24_Concat {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        String s1="Megha", s2="D";
        System.out.println(a+b); //mathematical +
        System.out.println(s1+s2);//concates 2 strings

        System.out.println(s1+s2+a+b); //o/p is MeghaD30 because s1+s2 = concates and then next + will also be treated as concat
        System.out.println(a+b+s1+s2); //50MeghaD -> 1st + maths 2nd + is concat
    }

}
