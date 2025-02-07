package Programs.ex_14_Strings;

public class Lab100_StringCompare_P7 {
    public static void main(String[] args) {
        String s1 ="Hello"; //SCP -> 1
        String s2 = "Hello"; //SCP -> 1

        String s3 = new String("Hello"); // OA -> 1
        String s4 = new String("Hello"); // OA -> 2
        String s5 = new String("hello"); // OA -> 3

        // == in string compares if location references are same

        System.out.println(s1==s3); // false because s1 is in SCP & s3 is in OA
        System.out.println(s1==s2);// true bcz s1 is in SCP & s2 is in SCP as well
        System.out.println(s3==s4); // false even though s3 & s4 are in OA -> they will be stored in diff location

        // equals -> compares the string values
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s4.equals(s5));

        System.out.println(s4.equalsIgnoreCase(s5));
    }
}
