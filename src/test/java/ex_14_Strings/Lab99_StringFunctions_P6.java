package ex_14_Strings;

public class Lab99_StringFunctions_P6 {
    public static void main(String[] args) {
        String s1 ="Hello"; // stored in SCP
        String s2 ="Hello"; // stored in SCP
        // both S1 and S2 points to same String so in SCP only 1 string is present

        String s3 = new String("Hi"); //stored in OA
        String s4 = new String("Hi"); //stored in OA
        // s3 & s4 points to different locations in OA so there r 2 strings in OA
    }
}
