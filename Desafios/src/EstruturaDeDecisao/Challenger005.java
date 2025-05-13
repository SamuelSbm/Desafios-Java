package EstruturaDeDecisao;

import java.util.Scanner;

public class Challenger005 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double firstNote = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double secondNote = sc.nextDouble();
        double resut = (firstNote + secondNote) /2;

        if (resut > 9)
            System.out.println("Aprovado com Distinção, sua média é: " + resut);
        else if (resut < 7)
            System.out.println("Reprovado, sua média é: " + resut);
        else {
            System.out.println("Aprovado, sua média é: " + resut);
        }
    }
}
