package Programs.ex_09_Switch_Condition;

public class Lab68_Switch_JDK13_Concept_P5 {
    public static void main(String[] args) {
        // JDK>13 we can pass mutiple values in case
        int itemCode = 03;
        switch (itemCode)
        {
            case 02,05,07:
                System.out.println("electronic gadget");
                break;
            case 8,9,03:
                System.out.println("kitchen gadget");
                break;

        }
    }
}
