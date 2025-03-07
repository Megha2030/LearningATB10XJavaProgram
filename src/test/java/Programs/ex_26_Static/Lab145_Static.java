package Programs.ex_26_Static;

public class Lab145_Static {
    public static void main(String[] args) {
        Student s1 = new Student(25);
        Student s2 = new Student(29);

        System.out.println(s1.age);
        System.out.println(s2.age);

        System.out.println(s1.courseName);

       Student.m1(); // calling static method
        // static methods & variables can be called without creating objects
    }
}

class Student
{
    int age;
    static String courseName = "ATB";

    public Student(int age_c)
    {
        this.age=age_c;
    }

    static void m1()
    {
        System.out.println("static method");
    }
}
