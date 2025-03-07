package Programs.ex_29_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab168_Throws {
    static void validateAge(int age)
    {
        if(age<18)
        {
            try
            {
                throw new Exception("age cant be <18"); //custom exception
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        validateAge(9);

        FileInputStream f = new FileInputStream("d://lor");
    }
}
