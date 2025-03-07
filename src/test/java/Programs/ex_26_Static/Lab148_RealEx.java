package Programs.ex_26_Static;

public class Lab148_RealEx {
    public static void main(String[] args) {
        ATB1 atb = new ATB1();
        atb.setName("Megs");
        ATB1.doAssignment();
    }
}

class ATB1
{
    {
        System.out.print("IIB - called when object is created");
    }

    static
    {
        System.out.println("load class, I will execute");
    }

    private String name;
    private String phone;
    static String courseName = "ATB10x";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static String getCourseName() {
        return courseName;
    }

    public static void setCourseName(String courseName) {
        ATB1.courseName = courseName;
    }

    void readDocuments()
  {
    System.out.println("Non static method");
    System.out.println(courseName);
  }

  static void doAssignment()
  {
     // System.out.println(phone); // static methods cannot access non static variables
      System.out.println("do Assignment");
  }
}
