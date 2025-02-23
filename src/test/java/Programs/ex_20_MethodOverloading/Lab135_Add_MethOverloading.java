package Programs.ex_20_MethodOverloading;

public class Lab135_Add_MethOverloading {
    public static void main(String[] args) {
        Add a= new Add();
        int res = a.sum(3,5); // calling method sum by passing 2 arg
        System.out.println(res);

        int res2 = a.sum(4,1,2);
        System.out.println(res2);

    }
}
