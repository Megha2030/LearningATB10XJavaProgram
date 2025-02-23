package Programs.ex_18_Constructors;

public class Lab133_Parameterized_Construc {
    public static void main(String[] args) {
        Mobile mob1 = new Mobile("Iphone 13", "2013");
        Mobile mob2 = new Mobile("Vivo","2023");

        System.out.println(mob1.modelName + " " + mob1.yearOfLaunch);
        System.out.println(mob2.modelName + " " + mob2.yearOfLaunch);


    }


}

class Mobile
{
    String modelName;
    String yearOfLaunch;

    Mobile(String model_Name, String year_Of_Launch)
    {
        this.modelName = model_Name;
        this.yearOfLaunch = year_Of_Launch;
    }
}
