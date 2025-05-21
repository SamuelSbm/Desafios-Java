package EstruturaDeDecisao;

import java.util.Scanner;

public class Challenger014 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double firstGrade = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double secondGrade = sc.nextDouble();

        double gradeAverage = (firstGrade + secondGrade) / 2;

        if(gradeAverage >= 6 && gradeAverage <= 10){
            System.out.println("Aprovado! nota: " + gradeAverage);
        } else {
            System.out.println("Reprovado! nota: " + gradeAverage);
        }
    }
}
