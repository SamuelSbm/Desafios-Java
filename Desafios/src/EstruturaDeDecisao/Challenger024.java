package EstruturaDeDecisao;

import java.util.Scanner;

public class Challenger024 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double secondNumber = scanner.nextDouble();

        if (firstNumber == 0 || secondNumber == 0){
            System.out.println("0 não é um valor valido.");
            return;
        }

        System.out.print("\n---------------------------------------\n");
        System.out.print("Qual operação deseja realizar?");
        System.out.print("\n1- Par ou Ímpar - ");
        System.out.print("\n2- Positivo ou Negativo - ");
        System.out.print("\n3- Inteiro ou Decimal - ");
        System.out.print("\n---------------------------------------\n");

        System.out.println("Selecione uma das opções!");

        int console = scanner.nextInt();

        if (console <= 0 || console > 3){
            System.out.println("Opção invalida!");
            return;
        }

        if (console == 1) {
            if (firstNumber % 2 != 0 || firstNumber % 2 == 0 || secondNumber % 2 != 0 || secondNumber % 2 == 0){
                if (firstNumber % 2 == 0){
                    System.out.printf("\n%.0f é um número par ", firstNumber);
                } else {
                    System.out.printf("\n%.0f é um número ímpar ", firstNumber);
                }
                if (secondNumber % 2 == 0){
                    System.out.printf("\n%.0f é um número par ", secondNumber);
                } else {
                    System.out.printf("\n%.0f é um número ímpar ", secondNumber);
                }
            }
        }
        if (console == 2){
            if (firstNumber >= 0 || secondNumber >= 0 || firstNumber < 0 || secondNumber < 0){
                if (firstNumber > 0){
                    System.out.printf("\n%.0f é um número positivo", firstNumber);
                } else {
                    System.out.printf("\n%.0f é um número negativo", firstNumber);
                }
                if (secondNumber > 0){
                    System.out.printf("\n%.0f é um número positivo", secondNumber);
                } else {
                    System.out.printf("\n%.0f é um número negativo", secondNumber);
                }
            }
        }
        if (console == 3){
            if (firstNumber % 1 == 0){
                System.out.println(firstNumber + " é um número inteiro.");
            } else{
                System.out.println(firstNumber + " é um número decimal.");
            }
            if (secondNumber % 1 == 0){
                System.out.println(secondNumber + " é um número inteiro.");
            } else{
                System.out.println(secondNumber + " é um número decimal.");
            }
        }
    }
}
