package EstruturaDeDecisao;

import java.util.Scanner;

public class Challenger008 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do primeiro item: ");
        double fistNumber = sc.nextDouble();

        System.out.print("Digite o valor do segundo item: ");
        double secondNumber = sc.nextDouble();

        System.out.print("Digite o valor do terceiro item: ");
        double thirdNumber = sc.nextDouble();

        if (fistNumber < secondNumber && fistNumber < thirdNumber){
            System.out.printf("O produto mas em conta é: R$ %.2f" , fistNumber);
        } if (secondNumber < fistNumber && secondNumber < thirdNumber){
            System.out.printf("O produto mas em conta é: R$ %.2f" , secondNumber);
        } if (thirdNumber < fistNumber && thirdNumber < secondNumber) {
            System.out.printf("O produto mas em conta é: R$ %.2f" , thirdNumber);
        } if (fistNumber == secondNumber && fistNumber == thirdNumber)
            System.out.println("Os valores são equivalentes!");
    }
}
