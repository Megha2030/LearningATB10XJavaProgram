package Programs.ex_15_StringFunctions;

public class Lab101_String_func {
    public static void main(String[] args)
    {
        String str = "Megha";
        String str2 = "Madam";

        //lenght()
        System.out.println(str.length()); // returns length of string

        //charAt()
        System.out.println(str.charAt(3)); // returns charac at 3rd index -> index starts from 0
        //System.out.println(str.charAt(9)); // StringIndexOutOfBound error

       // concat()
        System.out.println(str.concat("D")); // concatenates 2 strings

        //contains()
        System.out.println(str.contains("eg")); // checks if "eg" is present in str

        //indexOf()
        System.out.println(str.indexOf('g')); // returns the index of 1st occurance of char

        //replace()
        System.out.println(str2.replace('m','M')); //replaces oldchar with new char in every occurance

        //spilt()
        String str3 = "Megha Dev";
        String split[] = str3.split(" "); // splits the string based on regular expression given
        System.out.println(split[0]); //returns str at index 0
        System.out.println(split[1]);

        //substring
        String str4 = "live@456";
        System.out.println(str4.substring(1,3)); //extratcs portion of string by given index (1 to 3rd indext(actually 2nd index)
        System.out.println(str4.substring(5,8));

        //toLowerCase()
        String name1="ABHILASH";
        System.out.println(name1.toLowerCase());//converts string to lowercase

        //toUpperCase()
        String name2="abhilash";
        System.out.println(name2.toUpperCase());// converts string to uppercase

        //startsWith
        String name3 = "megha";
        System.out.println(name3.startsWith("m"));//checks if string starts with given char

        //endsWith
        String name4 = "megha";
        System.out.println(name4.endsWith("a"));//checks if string ends with given char

        //trim()
        String str5 = "     uy  ";
        System.out.println(str5.trim()); //removes trailing or leading spaces

        //compareTo()
        String str6 = "sonal";
        String str7 = "SONal";
        System.out.println(str6.compareTo(str7)); //compares 2 strings in alpahabetical order

        //String Builder
        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.append("welcome to new world"));


















    }
}
