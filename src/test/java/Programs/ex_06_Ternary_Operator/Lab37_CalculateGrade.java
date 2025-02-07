package Programs.ex_06_Ternary_Operator;

public class Lab37_CalculateGrade {
    public static void main(String[] args) {
       /* Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
        A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69
        F: 0-59  */

        int marks = 98;
        String grade = (marks>90 && marks<=100) ?"A": (marks>80 && marks<=89) ? "B" : (marks>70 && marks<=79) ? "C" : (marks>60 && marks<=69) ? "D":(marks>0 && marks<=59) ? "F" :"Invalid marks";
        System.out.println(grade);
    }
}
