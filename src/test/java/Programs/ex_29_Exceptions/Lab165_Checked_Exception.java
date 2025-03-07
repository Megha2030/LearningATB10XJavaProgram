package Programs.ex_29_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab165_Checked_Exception {
    public static void main(String[] args) {
        try
        {
            //JVM identifies & throws error before surrounding with try & catch
            FileReader f = new FileReader("c://megha");
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
