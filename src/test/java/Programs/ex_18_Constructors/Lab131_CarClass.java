package Programs.ex_18_Constructors;

public class Lab131_CarClass {
    public static void main(String[] args) {
        // when obj is created constructor in LAb130_Car is called
        Lab130_Car_Const car = new Lab130_Car_Const(); // creating object for car class
        System.out.println(car.name); // calling variables declared in other class in this class by obj creation
        System.out.println(car.mode);
        System.out.println(car.year);

        // changing values of variables declared in lab130_car
        car.name = "waganor";
        System.out.println(car.name);
    }
}
