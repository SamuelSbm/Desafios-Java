package EstruturaSequencial;

import java.util.Scanner;

public class Challenger004 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe as notas do bimestre: ");

        float grade = sc.nextInt();
        float gradeOne = sc.nextInt();
        float gradeTwo = sc.nextInt();
        float gradeThree = sc.nextInt();

        float average = (grade + gradeOne + gradeTwo +gradeThree)/2;
        System.out.println("A média é: " + average);

    }
}
