package Programs.ex_27_ENUM;

public class Lab151_enum_P3 {
    public static void main(String[] args) {
        System.out.println(colors.RED.getHexcode());
    }
}

enum colors {
    RED("00FF"),
    GREEN("11FF"),
    BLUE("22FF"),
    YELLOW("33FF");

    private String hexcode;

    colors(String hexcode)
    {
                this.hexcode=hexcode;
    }

    String getHexcode()
    {
        return this.hexcode;
    }



}
