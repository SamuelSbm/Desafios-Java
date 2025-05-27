package EstruturaDeDecisao;

import java.util.Scanner;

public class Challenger020 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double firstNote = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double secondNote = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double thirdNote = scanner.nextDouble();

        double result = (firstNote + secondNote + thirdNote) / 3;

        if(result == 10){
            System.out.printf("Aprovado com distinção! nota: %.0f", result);
        } else if (result >= 7){
            System.out.printf("Aprovado! nota: %.1f", result);
        } else {
            System.out.printf("Reprovado! nota: %.1f", result);
        }
    }
}
