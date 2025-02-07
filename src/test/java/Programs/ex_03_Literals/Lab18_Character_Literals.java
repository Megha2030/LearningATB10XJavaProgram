package Programs.ex_03_Literals;

public class Lab18_Character_Literals {
    public static void main(String[] args) {
        char c1 = 'a';// it can store alphabets
        char c2 = '4';// it can store numbers
        char c3 = '@'; // it can store special characters
        char c4 = '{'; // it can store brackets

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        // Escape character
         char new_line ='\n';
         char tab_space = '\t';
         char back_space = '\b'; // removes the char before this char
         char carriage_return ='\r'; //selects and then deletes

        System.out.println("Megha"+new_line+"Devaraj");
        System.out.println("Megha"+tab_space+"Devaraj");
        System.out.println("Megha"+back_space+"Devaraj");
        System.out.println("Megha"+carriage_return+"Devaraj"); // selets Megha and clicks on delete (so Megha is deleted)

    }
}
