package Programs.ex_02_java_basics;

public class Lab013_constants {
    public static void main(String[] args) {
        final int a=10;
        //a=20; // since a is final which is constant we cannot change the value

        final int price = 213;
        // price = 300;//not possible because price is constant

        System.out.println(a);
        System.out.println(price);
    }
}
