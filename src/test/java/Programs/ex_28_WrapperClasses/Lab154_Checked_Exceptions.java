package Programs.ex_28_WrapperClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab154_Checked_Exceptions {
    public static void main(String[] args) throws FileNotFoundException {
        // JVM knows about the exceptions
        // identified during compile time

        //there may be case where file may not be found -> jvm identifies this during compile time
        // to avoid filenotfound exception and  try catch block or throws keyword
        FileInputStream fileInputStream = new FileInputStream("c://log.txt");
    }

}
