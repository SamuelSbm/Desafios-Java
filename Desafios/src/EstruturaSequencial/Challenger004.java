package EstruturaSequencial;

import java.util.Scanner;

public class Challenger004 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe as notas do bimestre: ");

        float grade = sc.nextFloat();
        float gradeOne = sc.nextFloat();
        float gradeTwo = sc.nextFloat();
        float gradeThree = sc.nextFloat();

        float average = (grade + gradeOne + gradeTwo +gradeThree)/4;
        System.out.printf("A média é: %.1f \n", average);

    }
}
