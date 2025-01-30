package ex_06_Ternary_Operator;

public class Lab39_Question2 {
    public static void main(String[] args) {
        int a = 10;

        System.out.println(++a + a++ + a++);
        // ++a =11
        // a++ =11 (actually 12)
        //a++ =12
        //11+11+12

        System.out.println(a);

    }
}
