package Programs.ex_14_Strings;

public class Lab96_String_P3 {
    public static void main(String[] args) {
        String s="Megha"; // s is stored in string constant pool(SCP)
        String s2 = new String("Megha"); //s2 is stored in Object Area(OA)
        // s1 & s2 are not equal -> bcz both oints to 2 diff locations -> scp & ocp
        System.out.println(s);
        System.out.println(s2);
    }
}
