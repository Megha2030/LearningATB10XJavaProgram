package Programs.ex_15_StringFunctions;

public class Lab102_StringandBuilder {
    public static void main(String[] args) {
        String str1 = "ABC"; // string creates new String
        String str2 = "DEF";

        System.out.println(str1+str2);
        System.out.println(str1.concat(str2));//string Buffer creates new String

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.append("World")); //string builder does not create new string
        //it performs action on same string
    }
}
