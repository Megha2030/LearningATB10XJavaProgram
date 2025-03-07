package Programs.ex_30_Generics;

public class Lab169_Generics {
    public static void main(String[] args) {
        temp(4,5);
        //we will have to create 2 functions & 2 function call for different data types
        // so to avoid this we will create generic method which can accept any data type
        temp("abc","poi");

    }

    static Integer temp(Integer a, Integer b)
    {
        return a+b;
    }

    static String temp(String a,String b)
    {
        return a+b;
    }
}
