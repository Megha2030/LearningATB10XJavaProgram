package ex_05_TypeCast;

public class Lab36_TypeCast {
    public static void main(String[] args) {
        int courses = 100;
        float gst = 18.45f;
        int total = courses+(int)gst;// explicit type cast -> one is int and another is double so type casting is required
        float total2 = courses+gst; //implicit type cast
        System.out.println(total);
        System.out.println(total2);
    }
}
